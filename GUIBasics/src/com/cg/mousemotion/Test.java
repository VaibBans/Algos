package com.cg.mousemotion;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test extends JPanel implements MouseListener{
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawString("Hello ", 20, 40);
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new Test();
		MouseListener l = new Test();
		
		frame.setSize(850, 500);	
		frame.setContentPane(panel);
		panel.setBackground(Color.white);
		
		frame.setVisible(true);
//		frame.addMouseListener(l);
		frame.addMouseListener(l);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	}

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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
