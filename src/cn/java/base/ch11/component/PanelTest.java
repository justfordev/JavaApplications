package cn.java.base.ch11.component;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;

public class PanelTest {

	public static void main(String[] args) {
		Frame f = new Frame("²âÊÔ´°¿Ú");
		Panel p = new Panel();
		p.add(new TextField(20));
		p.add(new Button("µã»÷ÎÒ"));
		f.add(p);
		f.setBounds(100, 100, 300, 100);
		f.setVisible(true);
	}

}
