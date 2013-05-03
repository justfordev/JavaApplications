package cn.java.base.ch16.extendsthread;

public class Teacher extends Thread {
	public void run() {
		System.out.println("工作中，请勿打扰。。。");
		try {
			sleep(15000);
		} catch (InterruptedException e) {
			System.out.println("喂！有你电话。。。");
			return;
		}
		System.out.println("工作结束。。。");
	}
}
