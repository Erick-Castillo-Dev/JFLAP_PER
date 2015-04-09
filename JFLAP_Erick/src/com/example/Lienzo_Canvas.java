package com.example;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.LinkedList;

import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

public class Lienzo_Canvas extends Canvas implements MouseListener, MouseMotionListener{
	
	private LinkedList<InterfaceFigura> listaFiguras = new LinkedList();
	private InterfaceFigura figuraArrastrandose = null;
	private int xAnteriorRaton;
	private int yAnteriorRaton;
	public JPopupMenu pmenu;
	
	public void createPopupMenu() {

        pmenu = new JPopupMenu();
        
        JMenuItem maxMi = new JMenuItem("Maximize");
        maxMi.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {

               System.out.println("Maximize");

            }
        });

        pmenu.add(maxMi);

        JMenuItem quitMi = new JMenuItem("Quit");
        quitMi.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        pmenu.add(quitMi);
    }
	
	public Lienzo_Canvas() {
		addMouseMotionListener(this);
		addMouseListener(this);
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
		if (e.getButton() == MouseEvent.BUTTON3) {
			this.figuraArrastrandose = dameFigura(e);
			if(this.figuraArrastrandose == null){
				
			}else{
            pmenu.show(e.getComponent(), e.getX(), e.getY());
			}
        }
		
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
