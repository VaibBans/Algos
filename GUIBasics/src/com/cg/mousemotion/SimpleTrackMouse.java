package com.cg.mousemotion;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

import com.cg.mousemotion.SimpleTrackMousePanel.MouseHandler;

/**
 * This stand-alone application opens window that contains a
 * SimpleMouseTrackPanel.  The panel displays information about
 * mouse events on the panel.  The program ends when the user
 * closes the window.
 */
public class SimpleTrackMouse {
   
   public static void main(String[] args) {
      JFrame window = new JFrame("Simple Mouse Tracker");
      SimpleTrackMousePanel content = new SimpleTrackMousePanel();
      window.setContentPane(content);
      window.setSize(500,400);
      window.setLocation(100,100);
      
      MouseHandler listener = content.new MouseHandler();
      
      window.addMouseListener(listener);
      window.addMouseMotionListener(listener);
      
      window.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      window.setVisible(true);
   }
   
}

class MouseCoordii implements MouseListener,MouseMotionListener{

	CoordinateTracker p = new CoordinateTracker();
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {

		p.draw(arg0);
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		p.draw(arg0);
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		p.draw(arg0);
	}
	
}
