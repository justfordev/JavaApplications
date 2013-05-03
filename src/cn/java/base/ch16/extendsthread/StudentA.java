package cn.java.base.ch16.extendsthread;

public class StudentA extends Thread {

	@Override
	public void run() {
		for(int i = 0; i < 26; i++){
			System.out.println((char)('a' + i));
			try {
				sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
