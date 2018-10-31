package com.cg.test;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MouseDragHandler extends JPanel implements MouseListener, MouseMotionListener {
	private static int startX, startY; // Point where the original mousePress occurred.
	private static int prevX, prevY; // Most recently processed mouse coords.
	private boolean dragging; // Set to true when dragging is in process.

	public static void main(String[] args) {

		JFrame frame = new JFrame();
		JPanel panel = new MouseDragHandler();

		frame.setSize(1000, 1000);
		panel.setBackground(Color.WHITE);
		frame.setContentPane(panel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	}

	public void mousePressed(MouseEvent evt) {
		if (dragging==true ) {
			dragging = true;
			JPanel panel = new MouseDragHandler();
			startX = evt.getX(); // Remember starting position.
			startY = evt.getY();
			Graphics g = getGraphics();
			g.setColor(Color.BLACK);
			prevX = startX; // Remember most recent coords.
			prevY = startY;
			g.drawLine(startX,startY,prevX,prevY);
		}
	}
	public void mouseDragged(MouseEvent evt) {
		if (dragging == false ) // First, check if we are
			return; // processing a dragging gesture.
		int x = evt.getX(); // Current position of Mouse.
		int y = evt.getY();
		prevX = x; // Remember the current position for the next call.
		prevY = y;
		Graphics g = getGraphics();
		g.setColor(Color.BLACK);
		g.drawLine(startX, startY, prevX, prevY);
	}
	public void mouseReleased(MouseEvent evt) {
		if (dragging == false ) // First, check if we are
			return; // processing a dragging gesture.
		dragging = false; // We are done dragging.
	}
	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub

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
}