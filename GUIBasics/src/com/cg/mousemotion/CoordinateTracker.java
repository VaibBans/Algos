package com.cg.mousemotion;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class CoordinateTracker extends JPanel {

	int x,y;
	
	void draw(MouseEvent evt) {
		x = evt.getX();
		y = evt.getY();
		repaint();
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawString("("+x+","+y+")", x, y);
	}
	
	class MouseCoord implements MouseListener,MouseMotionListener{

		@Override
		public void mouseClicked(MouseEvent arg0) {
			draw(arg0);		
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			draw(arg0);		
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			draw(arg0);		
		}

		@Override
		public void mousePressed(MouseEvent arg0) {

			draw(arg0);		
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			draw(arg0);		
		}

		@Override
		public void mouseDragged(MouseEvent arg0) {
			draw(arg0);		
		}

		@Override
		public void mouseMoved(MouseEvent arg0) {
			draw(arg0);		
		}
	}
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		CoordinateTracker panel = new CoordinateTracker();
		MouseCoord l = panel.new MouseCoord();
		
		frame.setSize(850, 500);	
		frame.setContentPane(panel);
		panel.setBackground(Color.white);
		
		frame.setVisible(true);
		frame.addMouseListener(l);
		frame.addMouseMotionListener(l);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	}
}

