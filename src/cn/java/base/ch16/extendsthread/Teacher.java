package cn.java.base.ch16.extendsthread;

public class Teacher extends Thread {
	public void run() {
		System.out.println("�����У�������š�����");
		try {
			sleep(15000);
		} catch (InterruptedException e) {
			System.out.println("ι������绰������");
			return;
		}
		System.out.println("��������������");
	}
}
