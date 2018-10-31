package com.cg.mousecoordinates;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SimpleStamperPanel extends JPanel implements MouseListener {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new SimpleStamperPanel();
		
		frame.setSize(500, 500);
		frame.setContentPane(panel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	}

	public SimpleStamperPanel() {
		setBackground(Color.BLACK);
		addMouseListener(this);
	}
	public void mousePressed(MouseEvent evt) {
		if ( evt.isShiftDown() ) {
			repaint();
			return;
		}
		int x = evt.getX(); // x-coordinate where user clicked.
		int y = evt.getY(); // y-coordinate where user clicked.
		Graphics g = getGraphics(); // Graphics context for drawing directly.
		// NOTE: This is considered to be bad style!
		System.out.println("X "+x+" Y "+y);
		
		if ( evt.isMetaDown() ) {
			g.setColor(Color.BLUE); // Blue interior.
			g.fillOval( x - 30, y - 15, 60, 30 );
			g.setColor(Color.BLACK); // Black outline.
			g.drawOval( x - 30, y - 15, 60, 30 );
		}
		else {
			g.setColor(Color.RED); // Red interior.
			g.fillRect( x - 30, y - 15, 60, 30 );
			g.setColor(Color.BLACK); // Black outline.
			g.drawRect( x - 30, y - 15, 60, 30 );
		}
		g.dispose(); // We are finished with the graphics context, so dispose of it.
	}
	public void mouseEntered(MouseEvent evt) { }
	public void mouseExited(MouseEvent evt) { }
	public void mouseClicked(MouseEvent evt) { }
	public void mouseReleased(MouseEvent evt) { }
} // end class SimpleStamperPanel