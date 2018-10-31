package com.cg.mousemotion;

import java.awt.Color;
import java.awt.Component;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MouseMotionDemo extends JPanel {

	public static void main(String[] args) {

		JFrame frame = new JFrame();
		JPanel panel = new MouseMotionDemo();
		
		frame.setSize(500, 500);
		frame.setContentPane(panel);
		
		MouseMotionListener listener = new MotionHandler();
		panel.addMouseMotionListener(listener);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	}
}

class MotionHandler implements MouseMotionListener{

	@Override
	public void mouseDragged(MouseEvent arg0) {
		
		Component src = (Component)arg0.getSource();
		Graphics g = src.getGraphics();
		int x1,y1,x2,y2;
		boolean drag;
		x1 = arg0.getX();
		y1 = arg0.getY();
		x2 = arg0.getX();
		y2 = arg0.getY();
		System.out.println("X1 "+x1+" Y1 "+y1+" X2 "+x2+" Y2 "+y2);
		g.setColor(Color.BLACK);
		g.setPaintMode();
		g.drawLine(x1, y1, x2+10, y2+10);
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		
	}
	
}