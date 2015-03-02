package parseXml;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import util.MyUtil;

public class GenXml {
	public static void main(String[] args) {
		parseFile();
	}

	private static void parseFile() {
		try {
			Document document = MyUtil.parseXml("xmls/UserRace.xml");
			// 生成XPath对象
			XPath xpath = XPathFactory.newInstance().newXPath();
			Node beans = (Node) xpath.evaluate("/beans", document, XPathConstants.NODE);
			NodeList beanList = beans.getChildNodes();

			for (int i = 0; i < beanList.getLength(); i++) {
				Node bean = beanList.item(i);
				if (bean.getNodeType() == Node.TEXT_NODE)
					continue;
				createBean(xpath, bean);
			}
		} catch (XPathExpressionException e) {
			e.printStackTrace();
		}
	}

	private static void createBean(XPath xpath, Node bean) throws XPathExpressionException {
		String cname = (String) xpath.evaluate("@className", bean, XPathConstants.STRING);
		String fieldFormat = "//%s\nprivate %s %s;\n";
		StringBuilder fieldSb = new StringBuilder();

		String setMethodFormat = "public void set%s(%s %s){\n \tthis.%s=%s;\n}\n";
		StringBuilder setMethodsb = new StringBuilder();

		String getMethodFormat = "public %s get%s(){\n \treturn %s;\n}\n";
		StringBuilder getMethodsb = new StringBuilder();

		NodeList fieldList = bean.getChildNodes();
		for (int j = 0; j < fieldList.getLength(); j++) {
			Node field = fieldList.item(j);
			if (field.getNodeType() == Node.TEXT_NODE)
				continue;
			String name = (String) xpath.evaluate("@name", field, XPathConstants.STRING);
			String type = (String) xpath.evaluate("@type", field, XPathConstants.STRING);
			String desc = (String) xpath.evaluate("@desc", field, XPathConstants.STRING);
			String collection = (String) xpath.evaluate("@collection", field, XPathConstants.STRING);

			String typeStr = type;
			if (collection.length() > 0) {
				typeStr = collection + "<" + type + ">";
			}

			fieldSb.append(String.format(fieldFormat, desc, typeStr, name));

			getMethodsb.append(String.format(getMethodFormat, typeStr, MyUtil.firstChar2Upper(name), name));

			setMethodsb.append(String.format(setMethodFormat, MyUtil.firstChar2Upper(name), typeStr, name, name, name));
		}

		final String templateString = MyUtil.getFileContent("resources/genTemplate/XmlBeanFile");
		String content = templateString.replaceAll("%cname%", cname).replaceAll("%field_def%", fieldSb.toString())
				.replaceAll("%get_method%", getMethodsb.toString()).replaceAll("%set_method%", setMethodsb.toString());
		MyUtil.writeFile("/src/parseXml/bean/" + cname, content);
	}
}
