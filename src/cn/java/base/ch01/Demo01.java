package cn.java.base.ch01;

public class Demo01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s0 = new String("HEllo");
		String s1 = "Hello";
		String s2 = "HEllo";
		String s3 = s1.toLowerCase();
		String s4 = s2.toLowerCase();
		String s5 = s2.toLowerCase();
		
		System.out.println(s1 == s2);
		System.out.println(s3 == s4);
		System.out.println(s3 == s1);
		System.out.println(s4 == s2);
		System.out.println(s4 == s5);
	}

}
