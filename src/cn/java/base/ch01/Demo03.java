package cn.java.base.ch01;

public class Demo03 {
	
	public static void main(String[] args) {
		Something s = new Something();
		s.doSomething();
	}

}

class Something {
	int i;
	public void doSomething() {
		System.out.println("i = " + i);
	}
}

class Something1 {
	{
		i=0;
	}
	final int i;
	public void doSomething() {
		System.out.println("i = " + i);
	}
}
