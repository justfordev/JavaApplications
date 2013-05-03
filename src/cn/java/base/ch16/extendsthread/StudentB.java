package cn.java.base.ch16.extendsthread;

public class StudentB extends Thread {

	public void run() {
		for(int i = 0; i < 26; i++){
			System.out.println((char)('a' + i));
		}
	}
}
