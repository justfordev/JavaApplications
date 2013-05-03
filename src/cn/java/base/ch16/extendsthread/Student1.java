package cn.java.base.ch16.extendsthread;

public class Student1 extends Thread {

	@Override
	public void run() {
		for(int i = 1; i < 27; i++){
			System.out.println(i);
			try {
				sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
