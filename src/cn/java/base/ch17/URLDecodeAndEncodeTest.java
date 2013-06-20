package cn.java.base.ch17;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class URLDecodeAndEncodeTest {

	public static void main(String[] args) {
		String strURL = "≤‚ ‘Encode/Decode°£°£°£";
		try {
			System.out.println(URLEncoder.encode(strURL, "GBK"));
			System.out.println(URLDecoder.decode(strURL, "GBK"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
	}

}
