package cn.java.base.ch17;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {

	public static void main(String[] args) {
		InetAddress iNet = null;
		try {
			iNet = InetAddress.getByName("www.baidu.com");
		} catch (UnknownHostException e2) {
			e2.printStackTrace();
		}
		print(iNet);
		try {
			iNet = InetAddress.getByAddress(new byte[] { 127, 0, 0, 1 });
		} catch (UnknownHostException e1) {
			e1.printStackTrace();
		}
		print(iNet);
	}

	private static void print(InetAddress iNet) {
		try {
			System.out.println(iNet.isReachable(1000));
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(iNet.getHostAddress());
		System.out.println(iNet.getHostName());
		System.out.println(iNet.getAddress());
		System.out.println(iNet.getCanonicalHostName());
	}

}
