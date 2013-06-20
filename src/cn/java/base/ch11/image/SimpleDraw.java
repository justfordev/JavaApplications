package cn.java.base.ch11.image;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import cn.java.base.ch11.listener.MyWindowsListener;

public class SimpleDraw {

	private final String RECT_SHARP = "rect";
	private final String OVAL_SHARP = "voal";
	private String sharp = "";
	private Frame f = new Frame("ºÚµ•ªÊÕº");
	private Button rect = new Button("ªÊ÷∆æÿ–Œ");
	private Button oval = new Button("ªÊ÷∆Õ÷‘≤");
	private Panel p = new Panel();
	private MyCanvas drawarea = new MyCanvas();
	
	private void init() {
		f.addWindowListener(new MyWindowsListener());
		rect.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sharp = RECT_SHARP;
				drawarea.repaint();
			}
		});
		oval.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sharp = OVAL_SHARP;
				drawarea.repaint();
			}
		});
		
		p.add(rect);
		p.add(oval);
		drawarea.setPreferredSize(new Dimension(250, 180));
		f.add(drawarea);
		f.add(p, BorderLayout.SOUTH);
		f.pack();
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		new SimpleDraw().init();
	}

	class MyCanvas extends Canvas {

		public void paint(Graphics g) {
			Random rand = new Random();

			if(sharp.equals(RECT_SHARP)) {
				g.setColor(new Color(200, 100, 80));
				g.drawRect(rand.nextInt(200), rand.nextInt(120), 40, 60);
			}
			if(sharp.equals(OVAL_SHARP)) {
				g.setColor(new Color(80, 100, 200));
				g.fillOval(rand.nextInt(200), rand.nextInt(120), 50, 40);
			}
		}
	}
	
}
