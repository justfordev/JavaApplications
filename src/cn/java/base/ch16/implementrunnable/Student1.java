package cn.java.base.ch16.implementrunnable;

public class Student1 implements Runnable {

	@Override
	public void run() {
		for(int i = 1; i < 27; i++){
			System.out.println(i);
		}
	}
	
}
