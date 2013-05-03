package cn.java.base.ch16.extendsthread;

public class TeacherA extends Thread {
	private char c;

	public TeacherA() {
	}

	public TeacherA(char c) {
		this.c = c;
	}

	private void print() {
		for (int i = 0; i < 10; i++) {
			System.out.print(c);
		}
	}
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			print();
			System.out.println();
		}
	}

}
