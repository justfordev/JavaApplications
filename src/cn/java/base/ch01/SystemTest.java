package cn.java.base.ch01;

public class SystemTest {

	public static void main(String[] args) {
		System.out.println(System.getProperties().keySet().toString());
		System.out.println(System.getProperty("java.version"));
		System.out.println(System.getProperty("os.name"));
		System.out.println(System.getenv().keySet().toString());
		System.out.println(System.getenv().get("Path").toString());
		
	}

}
