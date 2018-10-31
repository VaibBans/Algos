package com.cg.test;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

	public class MouseEventDataTest extends JPanel {

	static JFrame frame;
	static JPanel panel;
	static String m = "JAVA!!";
		
	public void paintComponent(Graphics g) {

		Mousee handler = new Mousee();
		super.paintComponent(g);
		setBackground(Color.WHITE);
		g.setColor(Color.BLACK);
		g.drawString(handler.Message(m), Font.BOLD, 40);
	}

	public static void main(String[] args) {

		 frame = new JFrame();
		 panel = new MouseEventDataTest();

		frame.setSize(500, 500);
		frame.setContentPane(panel);

		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

		MouseListener listener = new Mousee();
		panel.addMouseListener(listener);

	}
}

class Mousee extends MouseEventDataTest implements MouseListener {

	private static class SecondFrame extends JPanel {

		public void paintComponent(Graphics g) {

			super.paintComponent(g);
			g.drawString("Enjoying GUI in JAVA!!", 40, 40);
		}
	}

	String Message(String msg) {
		return msg;
	}
	
	MouseListener mListener;

	@Override
	public void mouseClicked(MouseEvent arg0) {

	}

	@Override
	public void mouseEntered(MouseEvent e) {

	}

	@Override
	public void mouseExited(MouseEvent e) {

		mListener = new Mousee();
		System.out.println("Hello");
		panel.addMouseListener(mListener);
	}

	@Override
	public void mousePressed(MouseEvent e) {

		mListener = new Mousee();
		if(MouseEventDataTest.m.equals("JAVA!!")) {
			MouseEventDataTest.m = "Hello JAVA!!";
			Message(m);
		}
		else if(MouseEventDataTest.m.equals("Hello JAVA!!")){
			MouseEventDataTest.m = "JAVA!!";
			Message(m);
		}
		panel.addMouseListener(mListener);
		panel.repaint();
	}

	@Override
	public void mouseReleased(MouseEvent e) {

	}

}