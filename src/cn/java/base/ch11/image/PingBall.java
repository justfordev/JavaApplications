package cn.java.base.ch11.image;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

import javax.swing.Timer;

public class PingBall {
	private final int DESK_WIDTH = 300;
	private final int DESK_HEIGHT = 400;
	
	private final int RACKET_WIDTH = 60;
	private final int RACKET_HEIGHT = 20;
	
	private final int BALL_SIZE = 16;
	
	private Frame f = new Frame("µ¯ÇòÓÎÏ·");
	private Random rand = new Random();
	
	private int ySpeed = 10;
	private Double xySpeed = rand.nextDouble() - 0.5;
	private int xSpeed = (int)(ySpeed * xySpeed * 2);

	private int ballX = rand.nextInt(200) + 20;
	private int ballY = rand.nextInt(10) + 20;
	
	private int racketX = rand.nextInt(200);
	private final int RACKET_Y = 340;
	
	private MyCanvas deskArea = new MyCanvas();
	Timer timer;
	private boolean isLose = false;

	private void init() {
		KeyAdapter keyProcessor = new KeyAdapter() {
			public void keyPressed(KeyEvent ke) {
				if(ke.getKeyCode() == KeyEvent.VK_LEFT) {
					if(racketX > 0) {
						racketX -= 10;
					}
				}
				if(ke.getKeyCode() == KeyEvent.VK_RIGHT) {
					if(racketX < DESK_WIDTH - RACKET_WIDTH) {
						racketX += 10;
					}
				}
			}
		};
		ActionListener taskPerformer = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(ballX < 0 || ballX > DESK_WIDTH - BALL_SIZE) {
					xSpeed = -xSpeed;
				}
				if(ballY >= RACKET_Y - BALL_SIZE && (ballX < racketX || ballX > racketX + BALL_SIZE)) {
					timer.stop();
					isLose = true;
					deskArea.repaint();
				}
				else if(ballY < 0 || (ballY >= RACKET_Y - BALL_SIZE && ballX > racketX && ballX < racketX + BALL_SIZE)) {
					ySpeed = -ySpeed;
				}
				
				ballX += xSpeed;
				ballY += ySpeed;
				deskArea.repaint();
			}
		};

		deskArea.setPreferredSize(new Dimension(DESK_WIDTH, DESK_HEIGHT));
		f.add(deskArea);
		f.addKeyListener(keyProcessor);
		deskArea.addKeyListener(keyProcessor);
		f.pack();
		f.setVisible(true);
		
		timer = new Timer(100, taskPerformer);
		timer.start();
	}
	
	public static void main(String[] args) {
		new PingBall().init();
	}

	class MyCanvas extends Canvas {
		public void paint(Graphics g) {
			if(isLose) {
				g.setColor(new Color(250, 0, 0));
				g.setFont(new Font("Times", Font.BOLD, 30));
				g.drawString("ÓÎÏ·½áÊø£¡", 50, 200);
			}
			else {
				g.setColor(new Color(240, 240, 80));
				g.fillOval(ballX, ballY, BALL_SIZE, BALL_SIZE);
				g.setColor(new Color(80, 80, 100));
				g.fillRect(racketX, RACKET_Y, RACKET_WIDTH, RACKET_HEIGHT);
			}
		}
	}
}
