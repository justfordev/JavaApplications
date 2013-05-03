package cn.java.base.ch16.implementrunnable;

public class StudentA implements Runnable {

	@Override
	public void run() {
		for(int i = 0; i < 26; i++){
			System.out.println((char)('a' + i));
		}
	}
}
