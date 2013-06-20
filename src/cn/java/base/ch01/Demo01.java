package cn.java.base.ch01;

public class Demo01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s0 = new String("Hello");
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = s1.toLowerCase();
		String s4 = s2.toLowerCase();
		String s5 = s2.toLowerCase();
		String s6 = "hello";
		String s7 = s6.toLowerCase();
		
		
		System.out.println("s1 == s0 : " + (s1 == s0));
		System.out.println("s1 == s2 : " + (s1 == s2));
		System.out.println("s3 == s4 : " + (s3 == s4));
		System.out.println("s3 == s1 : " + (s3 == s1));
		System.out.println("s3 equals s4 : " + (s3.equals(s4)));
		System.out.println("s3 equals s1 : " + (s3.equals(s1)));
		System.out.println("s4 == s2 : " + (s4 == s2));
		System.out.println("s4 == s5 : " + (s4 == s5));
		System.out.println("s6 == s7 : " + (s6 == s7));
		
		System.out.println('1');
		System.out.println(0 + '0');
		System.out.println(0 + '1');
	}

}
