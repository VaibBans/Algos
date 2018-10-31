package com.cg.mouseevents;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MouseEventDemo extends JPanel {

	public void paintComponent(Graphics g) {

		super.paintComponent(g);
		setBackground(Color.WHITE);
		g.setColor(Color.BLACK);
		g.drawString("JAVA!!", Font.BOLD, 40);
	}

	public static void main(String[] args) {

		JFrame frame = new JFrame();
		JPanel panel = new MouseEventDemo();

		frame.setSize(500, 500);
		frame.setContentPane(panel);

		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

		MouseListener listener = new Mousee();
		panel.addMouseListener(listener);

	}
}

class Mousee implements MouseListener {

	private static class SecondFrame extends JPanel {

		public void paintComponent(Graphics g) {

			super.paintComponent(g);
			g.drawString("Enjoying GUI in JAVA!!", 40, 40);
		}
	}

	MouseListener mListener;
	JFrame frame1 = new JFrame();
	JPanel panel1 = new SecondFrame();

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
		panel1.addMouseListener(mListener);
	}

	@Override
	public void mousePressed(MouseEvent e) {

		frame1.setSize(500, 100);
		frame1.setLocation(800, 200);
		mListener = new Mousee();
		panel1.setBackground(Color.WHITE);
		frame1.setContentPane(panel1);
		frame1.setVisible(true);
		frame1.addMouseListener(mListener);

	}

	@Override
	public void mouseReleased(MouseEvent e) {

		System.exit(0);
	}

}