package test;

import org.apache.commons.httpclient.URI;
import org.apache.commons.httpclient.URIException;
import org.apache.commons.httpclient.methods.GetMethod;

public class UriTest {

	public static void main(String[] args) throws URIException, NullPointerException {
		String uriStr = "http://52.76.214.65/badperson/api/efun/pay/sendmail?userId=391c8f41baad500c776f2992bd9569fb&roleId=20996000033&serialNo=A5Basd8asdaf6200C047347&gameCode=vnblr&serverCode=996"
				+ "&packageId=0,2,2;10,1,2;&packetnum=1&md5Str=EBBA22A3AD67F4E15111E53421AE3532&activityCode=vnblrfbinvitefriend&title=award&content=award";
		URI uri = new URI(uriStr, false, "utf-8");
		GetMethod getMethod = new GetMethod();
		getMethod.setURI(uri);
//		new URI(uri, true, "utf-8");
	}
}
