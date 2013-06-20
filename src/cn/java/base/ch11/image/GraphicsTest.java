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

public class GraphicsTest {
	private final int LINE_SHARP = 1;
	private final int STRING_SHARP = 2;
	private final int RECT_3D_SHARP = 3;
	private final int RECT_3D_SOLID_SHARP = 4;
	private final int RECT_3D_RAISED_SHARP = 5;
	private final int RECT_3D_SOLID_RAISED_SHARP = 6;
	private final int RECT_SHARP = 7;
	private final int RECT_SOLID_SHARP = 8;
	private final int ROUND_RECT_SHARP = 9;
	private final int ROUND_RECT_SOLID_SHARP = 10;
	private final int OVAL_SHARP = 11;
	private final int OVAL_SOLID_SHARP = 12;
	private final int ARC_SHARP = 13;
	private final int ARC_SOLID_SHARP = 14;
	private final int POLGON_SHARP = 15;
	private final int POLGON_SOLID_SHARP = 16;

	private Frame f = new Frame("Graphicsπ§æﬂ");
	private Panel p = new Panel();
	private MyCanvas drawarea = new MyCanvas();
	private int sharp = 0;
	
	private Button line = new Button("ªÊ÷∆÷±œﬂ");
	private Button string = new Button("ªÊ÷∆◊÷∑˚¥Æ");
	private Button rect = new Button("ªÊ÷∆æÿ–Œ");
	private Button rect_solid = new Button("ÃÓ≥‰æÿ–Œ");
	private Button round_rect = new Button("ªÊ÷∆‘≤Ω«æÿ–Œ");
	private Button round_rect_solid = new Button("ÃÓ≥‰‘≤Ω«æÿ–Œ");
	private Button rect_3d = new Button("ªÊ÷∆3dæÿ–Œ");
	private Button rect_3d_solid = new Button("ÃÓ≥‰3dæÿ–Œ");
	private Button rect_3d_raised = new Button("ªÊ÷∆3d“ı”∞æÿ–Œ");
	private Button rect_3d_solid_raised = new Button("ÃÓ≥‰3d“ı”∞æÿ–Œ");
	private Button oval = new Button("ªÊ÷∆Õ÷‘≤");
	private Button oval_solid = new Button("ÃÓ≥‰Õ÷‘≤");
	private Button arc = new Button("ªÊ÷∆…»–Œ");
	private Button arc_solid = new Button("ÃÓ≥‰…»–Œ");
	private Button polgon = new Button("ªÊ÷∆∂‡±ﬂ–Œ");
	private Button polgon_solid = new Button("ÃÓ≥‰∂‡±ﬂ–Œ");
	
	private void init() {
		f.addWindowListener(new MyWindowsListener());
		line.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sharp = LINE_SHARP;
				drawarea.repaint();
			}
		});
		string.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sharp = STRING_SHARP;
				drawarea.repaint();
			}
		});
		round_rect.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sharp = ROUND_RECT_SHARP;
				drawarea.repaint();
			}
		});
		round_rect_solid.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sharp = ROUND_RECT_SOLID_SHARP;
				drawarea.repaint();
			}
		});
		rect_3d.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sharp = RECT_3D_SHARP;
				drawarea.repaint();
			}
		});
		rect_3d_raised.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sharp = RECT_3D_RAISED_SHARP;
				drawarea.repaint();
			}
		});
		rect_3d_solid.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sharp = RECT_3D_SOLID_SHARP;
				drawarea.repaint();
			}
		});
		rect_3d_solid_raised.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sharp = RECT_3D_SOLID_RAISED_SHARP;
				drawarea.repaint();
			}
		});
		rect.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sharp = RECT_SHARP;
				drawarea.repaint();
			}
		});
		rect_solid.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sharp = RECT_SOLID_SHARP;
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
		oval_solid.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sharp = OVAL_SOLID_SHARP;
				drawarea.repaint();
			}
		});
		arc.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sharp = ARC_SHARP;
				drawarea.repaint();
			}
		});
		arc_solid.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sharp = ARC_SOLID_SHARP;
				drawarea.repaint();
			}
		});
		polgon.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sharp = POLGON_SHARP;
				drawarea.repaint();
			}
		});
		polgon_solid.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sharp = POLGON_SOLID_SHARP;
				drawarea.repaint();
			}
		});
		
		p.add(line);
		p.add(string);
		p.add(rect);
		p.add(rect_solid);
		p.add(rect_3d);
		p.add(rect_3d_solid);
		p.add(rect_3d_raised);
		p.add(rect_3d_solid_raised);
		p.add(round_rect);
		p.add(round_rect_solid);
		p.add(oval);
		p.add(oval_solid);
		p.add(arc);
		p.add(arc_solid);
		p.add(polgon);
		p.add(polgon_solid);
		
		drawarea.setPreferredSize(new Dimension(500, 400));
		f.setLocation(0, 200);
		f.addWindowListener(new MyWindowsListener());
		f.add(drawarea);
		f.add(p, BorderLayout.SOUTH);
		f.pack();
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		new GraphicsTest().init();
	}

	class MyCanvas extends Canvas {
		Random rd = new Random();
		public void paint(Graphics g) {
			switch (sharp) {
			case 1:
				g.setColor(new Color(rd.nextInt(255), rd.nextInt(255), rd.nextInt(255)));
				g.drawLine(rd.nextInt(100), rd.nextInt(100), rd.nextInt(400), rd.nextInt(300));

			case 2:
				g.setColor(new Color(rd.nextInt(255), rd.nextInt(255), rd.nextInt(255)));
				g.drawString("STRING", rd.nextInt(400), rd.nextInt(300));
				break;

			case 3:
				g.setColor(new Color(rd.nextInt(255), rd.nextInt(255), rd.nextInt(255)));
				g.draw3DRect(rd.nextInt(100), rd.nextInt(100), rd.nextInt(400), rd.nextInt(300), true);				
				break;
			
			case 4:
				g.setColor(new Color(rd.nextInt(255), rd.nextInt(255), rd.nextInt(255)));
				g.fill3DRect(rd.nextInt(100), rd.nextInt(100), rd.nextInt(400), rd.nextInt(300), false);
				break;
				
			case 5:
				g.setColor(new Color(rd.nextInt(255), rd.nextInt(255), rd.nextInt(255)));
				g.draw3DRect(rd.nextInt(100), rd.nextInt(100), rd.nextInt(400), rd.nextInt(300), true);				
				break;
				
			case 6:
				g.setColor(new Color(rd.nextInt(255), rd.nextInt(255), rd.nextInt(255)));
				g.fill3DRect(rd.nextInt(100), rd.nextInt(100), rd.nextInt(400), rd.nextInt(300), true);				
				break;
				
			case 7:
				g.setColor(new Color(rd.nextInt(255), rd.nextInt(255), rd.nextInt(255)));
				g.drawRect(rd.nextInt(100), rd.nextInt(100), rd.nextInt(400), rd.nextInt(300));
				break;
				
			case 8:
				g.setColor(new Color(rd.nextInt(255), rd.nextInt(255), rd.nextInt(255)));
				g.fillRect(rd.nextInt(100), rd.nextInt(100), rd.nextInt(400), rd.nextInt(300));
				break;
				
			case 9:
				int w1 = rd.nextInt(400);
				int h1 = rd.nextInt(300);
				g.setColor(new Color(rd.nextInt(255), rd.nextInt(255), rd.nextInt(255)));
				g.drawRoundRect(rd.nextInt(100), rd.nextInt(100), w1, h1, rd.nextInt(w1), rd.nextInt(h1));
				break;
				
			case 10:
			{
				int w2 = rd.nextInt(400);
				int h2 = rd.nextInt(300);
				g.setColor(new Color(rd.nextInt(255), rd.nextInt(255), rd.nextInt(255)));
				g.fillRoundRect(rd.nextInt(100), rd.nextInt(100), w2, h2, rd.nextInt(w2), rd.nextInt(h2));
				break;
			}	
			case 11:
				g.setColor(new Color(rd.nextInt(255), rd.nextInt(255), rd.nextInt(255)));
				g.drawOval(rd.nextInt(100), rd.nextInt(100), rd.nextInt(400), rd.nextInt(300));
				break;
				
			case 12:
				g.setColor(new Color(rd.nextInt(255), rd.nextInt(255), rd.nextInt(255)));
				g.fillOval(rd.nextInt(100), rd.nextInt(100), rd.nextInt(400), rd.nextInt(300));
				break;
				
			case 13:
				g.setColor(new Color(rd.nextInt(255), rd.nextInt(255), rd.nextInt(255)));
				g.drawArc(rd.nextInt(100), rd.nextInt(100), rd.nextInt(400), rd.nextInt(300), rd.nextInt(100), rd.nextInt(100));
				break;
				
			case 14:
				g.setColor(new Color(rd.nextInt(255), rd.nextInt(255), rd.nextInt(255)));
				g.fillArc(rd.nextInt(100), rd.nextInt(100), rd.nextInt(400), rd.nextInt(300), rd.nextInt(100), rd.nextInt(100));
				break;
				
			case 15:
				g.setColor(new Color(rd.nextInt(255), rd.nextInt(255), rd.nextInt(255)));
				g.drawPolygon(new int[]{rd.nextInt(400), rd.nextInt(400), rd.nextInt(400), rd.nextInt(400), rd.nextInt(400), rd.nextInt(400), rd.nextInt(400)}, new int[]{rd.nextInt(300), rd.nextInt(300), rd.nextInt(300), rd.nextInt(300), rd.nextInt(300), rd.nextInt(300), rd.nextInt(300)}, 7);
				break;
				
			case 16:
				g.setColor(new Color(rd.nextInt(255), rd.nextInt(255), rd.nextInt(255)));
				g.fillPolygon(new int[]{rd.nextInt(400), rd.nextInt(400), rd.nextInt(400)}, new int[]{rd.nextInt(300), rd.nextInt(300), rd.nextInt(300)}, 3);
				break;
				
			default:
				break;
			}
//			if(sharp.equals(LINE_SHARP)) {
//				g.setColor(new Color(rd.nextInt(255), rd.nextInt(255), rd.nextInt(255)));
//				g.drawLine(rd.nextInt(100), rd.nextInt(100), rd.nextInt(400), rd.nextInt(300));
//			}
//			if(sharp.equals(STRING_SHARP)) {
//				g.setColor(new Color(rd.nextInt(255), rd.nextInt(255), rd.nextInt(255)));
//				g.drawString("STRING", rd.nextInt(400), rd.nextInt(300));
//			}
//			if(sharp.equals(RECT_3D_SHARP)) {
//				g.setColor(new Color(rd.nextInt(255), rd.nextInt(255), rd.nextInt(255)));
//				g.draw3DRect(rd.nextInt(100), rd.nextInt(100), rd.nextInt(400), rd.nextInt(300), false);
//			}
//			if(sharp.equals(RECT_3D_RAISED_SHARP)) {
//				g.setColor(new Color(rd.nextInt(255), rd.nextInt(255), rd.nextInt(255)));
//				g.draw3DRect(rd.nextInt(100), rd.nextInt(100), rd.nextInt(400), rd.nextInt(300), true);				
//			}
//			if(sharp.equals(RECT_3D_SOLID_SHARP)) {
//				g.setColor(new Color(rd.nextInt(255), rd.nextInt(255), rd.nextInt(255)));
//				g.fill3DRect(rd.nextInt(100), rd.nextInt(100), rd.nextInt(400), rd.nextInt(300), false);
//			}
//			if(sharp.equals(RECT_3D_SOLID_RAISED_SHARP)) {
//				g.setColor(new Color(rd.nextInt(255), rd.nextInt(255), rd.nextInt(255)));
//				g.fill3DRect(rd.nextInt(100), rd.nextInt(100), rd.nextInt(400), rd.nextInt(300), true);				
//			}
//			if(sharp.equals(RECT_SHARP)) {
//				g.setColor(new Color(rd.nextInt(255), rd.nextInt(255), rd.nextInt(255)));
//				g.drawRect(rd.nextInt(100), rd.nextInt(100), rd.nextInt(400), rd.nextInt(300));
//			}
//			if(sharp.equals(RECT_SOLID_SHARP)) {
//				g.setColor(new Color(rd.nextInt(255), rd.nextInt(255), rd.nextInt(255)));
//				g.fillRect(rd.nextInt(100), rd.nextInt(100), rd.nextInt(400), rd.nextInt(300));
//			}
//			if(sharp.equals(ROUND_RECT_SHARP)) {
//				int w = rd.nextInt(400);
//				int h = rd.nextInt(300);
//				g.setColor(new Color(rd.nextInt(255), rd.nextInt(255), rd.nextInt(255)));
//				g.drawRoundRect(rd.nextInt(100), rd.nextInt(100), w, h, rd.nextInt(w), rd.nextInt(h));
//			}
//			if(sharp.equals(ROUND_RECT_SOLID_SHARP)) {
//				int w = rd.nextInt(400);
//				int h = rd.nextInt(300);
//				g.setColor(new Color(rd.nextInt(255), rd.nextInt(255), rd.nextInt(255)));
//				g.fillRoundRect(rd.nextInt(100), rd.nextInt(100), w, h, rd.nextInt(w), rd.nextInt(h));
//			}
//			if(sharp.equals(OVAL_SHARP)) {
//				g.setColor(new Color(rd.nextInt(255), rd.nextInt(255), rd.nextInt(255)));
//				g.drawOval(rd.nextInt(100), rd.nextInt(100), rd.nextInt(400), rd.nextInt(300));
//			}
//			if(sharp.equals(OVAL_SOLID_SHARP)) {
//				g.setColor(new Color(rd.nextInt(255), rd.nextInt(255), rd.nextInt(255)));
//				g.fillOval(rd.nextInt(100), rd.nextInt(100), rd.nextInt(400), rd.nextInt(300));
//			}
//			if(sharp.equals(ARC_SHARP)) {
//				g.setColor(new Color(rd.nextInt(255), rd.nextInt(255), rd.nextInt(255)));
//				g.drawArc(rd.nextInt(100), rd.nextInt(100), rd.nextInt(400), rd.nextInt(300), rd.nextInt(100), rd.nextInt(100));
//			}
//			if(sharp.equals(ARC_SOLID_SHARP)) {
//				g.setColor(new Color(rd.nextInt(255), rd.nextInt(255), rd.nextInt(255)));
//				g.fillArc(rd.nextInt(100), rd.nextInt(100), rd.nextInt(400), rd.nextInt(300), rd.nextInt(100), rd.nextInt(100));
//			}
//			if(sharp.equals(POLGON_SHARP)) {
//				g.setColor(new Color(rd.nextInt(255), rd.nextInt(255), rd.nextInt(255)));
//				g.drawPolygon(new int[]{rd.nextInt(400), rd.nextInt(400), rd.nextInt(400), rd.nextInt(400), rd.nextInt(400), rd.nextInt(400), rd.nextInt(400)}, new int[]{rd.nextInt(300), rd.nextInt(300), rd.nextInt(300), rd.nextInt(300), rd.nextInt(300), rd.nextInt(300), rd.nextInt(300)}, 7);
//			}
//			if(sharp.equals(POLGON_SOLID_SHARP)) {
//				g.setColor(new Color(rd.nextInt(255), rd.nextInt(255), rd.nextInt(255)));
//				g.fillPolygon(new int[]{rd.nextInt(400), rd.nextInt(400), rd.nextInt(400)}, new int[]{rd.nextInt(300), rd.nextInt(300), rd.nextInt(300)}, 3);
//			}
		}
	}
}
