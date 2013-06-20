package cn.java.base.ch11.component;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Frame;

import javax.swing.Box;

public class BoxAndBoxSpaceTest {
	
	
	public void box() {
		Frame f = new Frame("测试box窗口");
		Box horizontal = Box.createHorizontalBox();
		Box vertical = Box.createVerticalBox();
		
		horizontal.add(new Button("水平按钮一"));
		horizontal.add(new Button("水平按钮二"));
		vertical.add(new Button("垂直按钮一"));
		vertical.add(new Button("垂直按钮二"));
		
		f.add(horizontal, BorderLayout.NORTH);
		f.add(vertical);
		f.pack();
		f.setVisible(true);
	} 
	
	public void boxSpace() {
		Frame f = new Frame("测试box窗口");
		Box horizontal = Box.createHorizontalBox();
		Box vertical = Box.createVerticalBox();
		
		horizontal.add(new Button("水平按钮一"));
		horizontal.add(Box.createHorizontalGlue());
		horizontal.add(new Button("水平按钮二"));
		horizontal.add(Box.createHorizontalStrut(30));
		horizontal.add(new Button("水平按钮三"));
		horizontal.add(Box.createRigidArea(new Dimension(100, 10)));
		horizontal.add(new Button("水平按钮四"));
		vertical.add(new Button("垂直按钮一"));
		vertical.add(Box.createVerticalGlue());
		vertical.add(new Button("垂直按钮二"));
		vertical.add(Box.createVerticalStrut(40));
		vertical.add(new Button("垂直按钮三"));
		vertical.add(Box.createRigidArea(new Dimension(20, 20)));
		vertical.add(new Button("垂直按钮四"));
		
		f.add(horizontal, BorderLayout.NORTH);
		f.add(vertical);
		f.pack();
		f.setVisible(true);
	}

	public static void main(String[] args) {
		BoxAndBoxSpaceTest boxAndBoxSpaceTest = new BoxAndBoxSpaceTest();
		boxAndBoxSpaceTest.box();
		boxAndBoxSpaceTest.boxSpace();
	}

}
