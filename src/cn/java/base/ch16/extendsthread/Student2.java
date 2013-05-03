package cn.java.base.ch16.extendsthread;

public class Student2 extends Thread {

	public void run() {
		for(int i = 1; i < 27; i++){
			System.out.println(i);
			yield();
		}
	}
	
}
