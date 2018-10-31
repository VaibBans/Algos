package com.cg.mouseevents;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class RandomStrings extends JPanel{

	int i = 0;
	Font font1, font2, font3, font4;
	static String m = "";
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		font1 = new Font("Sans",Font.BOLD,20);
		font2 = new Font("SansSerif",Font.ITALIC,21);
		font3 = new Font("Monospaced",Font.CENTER_BASELINE,22);
		font4 = new Font("Dialog",Font.ITALIC,23);
		Font font[] = {font1, font2, font3, font4};
		
		for(i=0;i<50;i++) {
			int j = 0;
			if(j>4)
				j = 0;
			j++;
			g.setFont(font[j]);
			Color color = new Color((int)(50*Math.random()),(int)(50*Math.random()),(int)(50*Math.random()));
			g.setColor(color);
			g.drawString(m,(int)(50+i*i-100*Math.random()),(int)(50+i*i-100*Math.random()));
			/*if(i<=25)
				g.drawString("JAVA!!", i*i, i*i);
			else
				g.drawString("JAVA!!", i*i, (50-i)*(50-i));*/
			
		}
	}
	
	static class MouseHandle implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {

			if(m.equals(""))
				m = "JAVA!!";
			else
				m = "";
//			panel.repaint();
			
			Component source = (Component)e.getSource();
			source.repaint();
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Random String");
		JPanel panel = new RandomStrings();
		MouseListener mList = new MouseHandle();
		
		frame.setSize(1350, 1000);
		panel.setBackground(Color.black);
		frame.setContentPane(panel);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		frame.addMouseListener(mList);
		
	}
}
