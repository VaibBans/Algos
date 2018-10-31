package com.cg.mousemotion;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

public class PaintDemo extends JPanel{
	
	int mouseX, mouseY;
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	}

	int returnXCoordinate(MouseEvent evt) {
		
		mouseX = evt.getX();
		return mouseX;
	}
	
	int returnYCoordinate(MouseEvent evt) {
		
		mouseY = evt.getY();
		return mouseY;
	}
	
	boolean draggedFalse(boolean flag) {
		boolean bool = flag;
		
		return bool;
	}
	
	private class MousePaint implements MouseMotionListener, MouseListener{

		boolean flag;
		
		@Override
		public void mouseClicked(MouseEvent e) {

			boolean flag = true;
			draggedFalse(flag);
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

		@Override
		public void mouseDragged(MouseEvent arg0) {

			
		}

		@Override
		public void mouseMoved(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
