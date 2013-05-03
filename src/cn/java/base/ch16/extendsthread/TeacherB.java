package cn.java.base.ch16.extendsthread;

public class TeacherB extends Thread {

	Object obj = new Object();
	
	public TeacherB() {
	}

	private void print() {
		System.out.print(Thread.currentThread().getName() + ":");
		for (int i = 0; i < 10; i++) {
			System.out.print(i);
		}
	}
	
	public void run() {
		synchronized (obj) {
			print();
			System.out.println();
		}
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
