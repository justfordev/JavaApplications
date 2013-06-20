package cn.java.base.ch11.layoutmanager;

import java.awt.Button;
import java.awt.Frame;

import javax.swing.BoxLayout;

public class BoxLayoutTest {

	private Frame xf = new Frame("X���Դ���");
	private Frame yf = new Frame("Y���Դ���");
	
	private void init() {
		xf.setLayout(new BoxLayout(xf, BoxLayout.X_AXIS));
		xf.add(new Button("ˮƽ��ťһ"));
		xf.add(new Button("ˮƽ��ť��"));
		yf.setLayout(new BoxLayout(yf, BoxLayout.Y_AXIS));
		yf.add(new Button("��ֱ��ťһ"));
		yf.add(new Button("��ֱ��ť��"));
		xf.pack();
		xf.setVisible(true);
		yf.pack();
		yf.setVisible(true);
	}
	
	public static void main(String[] args) {
		new BoxLayoutTest().init();
	}

}
