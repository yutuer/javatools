package pureland;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ModifyProtoPackageName {
	public static void main(String[] args) throws IOException {
		ModifyProtoPackageName.Start("./proto", "java_package\\s*=\\s*\"([\\w|\\.]+)\"", args[0]);
	}
	
	public static void Start(String dirName, String patternStr, String packageName) throws IOException {
		Pattern p = Pattern.compile(patternStr);
		File dir = new File(dirName);
		if (dir.exists() && dir.isDirectory()) {
			for (File f : dir.listFiles()) {
				String name = f.getName();
				boolean isVo = false;
				if (name.endsWith(".proto")) {
					String preName = name.substring(0,name.indexOf("."));
					if(preName.endsWith("VO") || preName.equals("ResourceType")){
						isVo=true;
					}
					String s = getContent(f);
					 Matcher m = p.matcher(s);
					 StringBuffer sb = new StringBuffer();
					 if(m.find()){
						  m.appendReplacement(sb, "");
						  if(isVo){
							  sb.append(m.group().replace(m.group(1), packageName + ".vo"));
						  }else{
							  sb.append(m.group().replace(m.group(1), packageName ));
						  }
					 }
					 m.appendTail(sb);
					 FileOutputStream fos = new FileOutputStream(f);
					 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos,"utf-8"));
					 bw.write(sb.toString());
					 bw.close();
					 fos.close();
				}
			}
		}
	}

	public static String getContent(File f) throws IOException {
		StringBuilder sb = new StringBuilder();
		FileInputStream fis = new FileInputStream(f);
		BufferedReader br = new BufferedReader(new InputStreamReader(fis, "utf-8"));
		String s = "";
		while ((s = br.readLine()) != null) {
			sb.append(s).append("\r\n");
		}
		br.close();
		fis.close();
		return sb.toString();
	}
}
