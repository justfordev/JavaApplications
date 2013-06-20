package cn.java.base.ch11.layoutmanager;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class FlowLayoutTest {

	public static void main(String[] args) {
		Frame f = new Frame("²âÊÔ´°¿Ú");
		f.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 10));
		for(int i=0; i<10; i++) {
			f.add(new Button("°´Å¥" + i));
		}
		f.pack();
		f.setVisible(true);
	}

}
