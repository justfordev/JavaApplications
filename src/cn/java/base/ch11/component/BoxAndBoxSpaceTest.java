package cn.java.base.ch11.component;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Frame;

import javax.swing.Box;

public class BoxAndBoxSpaceTest {
	
	
	public void box() {
		Frame f = new Frame("����box����");
		Box horizontal = Box.createHorizontalBox();
		Box vertical = Box.createVerticalBox();
		
		horizontal.add(new Button("ˮƽ��ťһ"));
		horizontal.add(new Button("ˮƽ��ť��"));
		vertical.add(new Button("��ֱ��ťһ"));
		vertical.add(new Button("��ֱ��ť��"));
		
		f.add(horizontal, BorderLayout.NORTH);
		f.add(vertical);
		f.pack();
		f.setVisible(true);
	} 
	
	public void boxSpace() {
		Frame f = new Frame("����box����");
		Box horizontal = Box.createHorizontalBox();
		Box vertical = Box.createVerticalBox();
		
		horizontal.add(new Button("ˮƽ��ťһ"));
		horizontal.add(Box.createHorizontalGlue());
		horizontal.add(new Button("ˮƽ��ť��"));
		horizontal.add(Box.createHorizontalStrut(30));
		horizontal.add(new Button("ˮƽ��ť��"));
		horizontal.add(Box.createRigidArea(new Dimension(100, 10)));
		horizontal.add(new Button("ˮƽ��ť��"));
		vertical.add(new Button("��ֱ��ťһ"));
		vertical.add(Box.createVerticalGlue());
		vertical.add(new Button("��ֱ��ť��"));
		vertical.add(Box.createVerticalStrut(40));
		vertical.add(new Button("��ֱ��ť��"));
		vertical.add(Box.createRigidArea(new Dimension(20, 20)));
		vertical.add(new Button("��ֱ��ť��"));
		
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
