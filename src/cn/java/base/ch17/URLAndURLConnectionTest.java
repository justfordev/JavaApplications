package cn.java.base.ch17;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class URLAndURLConnectionTest {

	// URL = protocol://host:port/resourceName
	public static void main(String[] args) throws IOException {
		URL url = new URL("http://6.su.bdimg.com/icon/10605.png?name=123");
		
		System.out.println("File:" + url.getFile());
		System.out.println("Protocol:" + url.getProtocol());
		System.out.println("Host:" + url.getHost());
		System.out.println("Port:" + url.getPort());
		System.out.println("Path:" + url.getPath());
		System.out.println("Query:" + url.getQuery());
		URLConnection con = url.openConnection();
		System.out.println("ContentLength:" + con.getContentLength());
		System.out.println("ContentEncoding£º" + con.getContentEncoding());
	}

}
