package com.cg.test;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SimpleStamperPanel extends JPanel {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new SimpleStamperPanel();
		
		frame.setSize(500, 500);
		frame.setContentPane(panel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	}

	public SimpleStamperPanel() {
		
		MouseActivityHandler listener = new MouseActivityHandler();
		setBackground(Color.BLACK);
		this.addMouseListener(listener);
	}
	
	public void mouseEntered(MouseEvent evt) { }
	public void mouseExited(MouseEvent evt) { }
	public void mouseClicked(MouseEvent evt) { }
	public void mouseReleased(MouseEvent evt) { }
} // end class SimpleStamperPanel

class MouseActivityHandler implements MouseListener{

	int i = 0;
	
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
	public void mousePressed(MouseEvent evt) {
		
		String arr[] = {"H","E","L","L","O"};
		Component src = (Component)evt.getSource();
		Graphics g = src.getGraphics();
		g.setColor(Color.WHITE);
		
		while(i>=0) {
			g.drawString("H",20+10*i,20+10*i);
			i++;
		}
		
		if(i<arr.length) {
		g.drawString(arr[i],20+10*i,20+10*i);
		i++;
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}