package com.example;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.LinkedList;

public class Lienzo_Canvas extends Canvas implements MouseListener, MouseMotionListener{
	
	private LinkedList<InterfaceFigura> listaFiguras = new LinkedList();
	private InterfaceFigura figuraArrastrandose = null;
	private int xAnteriorRaton;
	private int yAnteriorRaton;
	
	public Lienzo_Canvas() {
		addMouseMotionListener(this);
	}
	
	public void removeFigura(InterfaceFigura figura){
	    this.listaFiguras.remove(figura);
	}
	
	public void addFigura(InterfaceFigura figura){
	     this.listaFiguras.add(figura);
	}
	
	public Dimension getPreferredSize(){
	     return new Dimension(1000, 1000);
	}
	
	public void paint(Graphics g){
		for (InterfaceFigura figura : this.listaFiguras){
		       figura.dibujate(g);
		     }
    }
	
	private InterfaceFigura dameFigura(MouseEvent e){
	     for (InterfaceFigura figura : this.listaFiguras){
	       if (figura.estaDentro(e.getX(), e.getY())){
	         return figura;
	       }
	     } 
	     return null;
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

	@Override
	public void mouseDragged(MouseEvent e) {
		if (this.figuraArrastrandose == null){
		       this.xAnteriorRaton = e.getX();
		       this.yAnteriorRaton = e.getY(); 
		       this.figuraArrastrandose = dameFigura(e);
		   }else{
	         this.figuraArrastrandose.setPosicion(
	         this.figuraArrastrandose.getX() + (e.getX() - this.xAnteriorRaton), 
	         this.figuraArrastrandose.getY() + (e.getY() - this.yAnteriorRaton)); 
	       this.xAnteriorRaton = e.getX();
	       this.yAnteriorRaton = e.getY(); 
	       repaint();
	     }
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		this.figuraArrastrandose = null;		
	}

}
