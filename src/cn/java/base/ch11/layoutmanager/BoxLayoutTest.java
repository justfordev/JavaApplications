package cn.java.base.ch11.layoutmanager;

import java.awt.Button;
import java.awt.Frame;

import javax.swing.BoxLayout;

public class BoxLayoutTest {

	private Frame xf = new Frame("X测试窗口");
	private Frame yf = new Frame("Y测试窗口");
	
	private void init() {
		xf.setLayout(new BoxLayout(xf, BoxLayout.X_AXIS));
		xf.add(new Button("水平按钮一"));
		xf.add(new Button("水平按钮二"));
		yf.setLayout(new BoxLayout(yf, BoxLayout.Y_AXIS));
		yf.add(new Button("垂直按钮一"));
		yf.add(new Button("垂直按钮二"));
		xf.pack();
		xf.setVisible(true);
		yf.pack();
		yf.setVisible(true);
	}
	
	public static void main(String[] args) {
		new BoxLayoutTest().init();
	}

}
