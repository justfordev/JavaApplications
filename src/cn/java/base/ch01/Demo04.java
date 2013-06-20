package cn.java.base.ch01;

import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;

public class Demo04 {

	public static void main(String[] args) {

		String str = "HELLO WORLD";
		byte[] b = str.getBytes();
		System.out.println(Base64.encode(b));
	}

}
