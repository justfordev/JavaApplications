package cn.java.base.ch11.layoutmanager;

import java.awt.Button;
import java.awt.Frame;

public class NullLayoutTest {

	Frame f = new Frame("²âÊÔ´°¿Ú");
	Button b1 = new Button("°´Å¥1");
	Button b2 = new Button("°´Å¥2");
	
	public void init() {
		f.setLayout(null);
		b1.setBounds(0,0, 60, 40);
		b2.setBounds(70, 90, 80, 30);
		f.add(b1);
		f.add(b2);
		f.setBounds(100, 100, 200, 200);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		new NullLayoutTest().init();
	}

}
