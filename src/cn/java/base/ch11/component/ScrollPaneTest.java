package cn.java.base.ch11.component;

import java.awt.Button;
import java.awt.Frame;
import java.awt.ScrollPane;
import java.awt.TextField;

public class ScrollPaneTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Frame f = new Frame("²âÊÔ´°¿Ú");
		ScrollPane sp = new ScrollPane(ScrollPane.SCROLLBARS_ALWAYS);
		sp.add(new TextField(20));
		sp.add(new Button("µã»÷ÎÒ"));
		f.add(sp);
		f.setBounds(100, 100, 300, 100);
		f.setVisible(true);
	}

}
