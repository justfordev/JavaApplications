package cn.java.base.ch11.layoutmanager;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class GridBagLayoutTest {

	Frame f = new Frame("²âÊÔ´°¿Ú");
	GridBagLayout gbl = new GridBagLayout();
	Button[] bs = new Button[10];
	GridBagConstraints gbc = new GridBagConstraints();

	private void addComponent(Button b) {
		gbl.setConstraints(b, gbc);
		f.add(b);
	}

	public void init() {
		f.setLayout(gbl);
		for(int i = 0; i < 10; i++) {
			bs[i] = new Button("Button" + i);
		}
		
		gbc.fill = GridBagConstraints.BOTH;
		gbc.weightx = 1;
		addComponent(bs[0]);
		addComponent(bs[1]);
		addComponent(bs[2]);
		
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		addComponent(bs[3]);		
		gbc.weightx = 0;
		addComponent(bs[4]);		
		
		gbc.gridwidth = 2;
		addComponent(bs[5]);		
		
		gbc.gridwidth = 1;
		gbc.gridheight = 2;
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		addComponent(bs[6]);		
		
		gbc.gridwidth = 1;
		gbc.gridheight = 2;
		gbc.weightx = 1;
		addComponent(bs[7]);		
		
		gbc.weighty = 0;
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		gbc.gridheight = 1;
		addComponent(bs[8]);		
		addComponent(bs[9]);		
		
		f.pack();
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		new GridBagLayoutTest().init();
	}

}
