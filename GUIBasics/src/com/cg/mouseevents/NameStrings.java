package com.cg.mouseevents;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class NameStrings extends JPanel{

	static int i = 0;
	Font font1;
	static String name[] = {"H","E","L","L","O"};
	static String m = "";
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		font1 = new Font("Sans",Font.BOLD,20);
//		System.out.println("outside for M "+m);
		
		for(i=0;i<5;i++) {
			m = name[i];
//			System.out.println("in for M "+m);
			g.setFont(font1);
			g.setColor(Color.WHITE);
			g.drawString(m,50*i+50,50*i+50);
		}
	}
	
	static class MouseHandler implements MouseListener{

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

			i = 0;
			System.out.println("In mouse");
			System.out.println("String "+m);
			if(m.equals("")) {
				m = name[i];
				System.out.println("Value of i "+i);
				i++;
			}
			else
				m = "";
			Component source = (Component)e.getSource();
			source.repaint();
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Name String");
		JPanel panel = new NameStrings();
		MouseListener mList = new MouseHandler();
		
		frame.setSize(1350, 1000);
		panel.setBackground(Color.black);
		frame.setContentPane(panel);
		frame.setVisible(true);
		frame.addMouseListener(mList);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	}
}
