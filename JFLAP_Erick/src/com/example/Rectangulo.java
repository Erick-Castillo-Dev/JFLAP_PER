package com.example;
 
import java.awt.Color;
import java.awt.Graphics;
 
public class Rectangulo implements InterfaceFigura{
   private int x;
   private int y;
   private int ancho;
   private int alto;
   private Color color;
 
   public Rectangulo(int x, int y, int alto, int ancho, Color color)
   {
     this.x = x;
     this.y = y;
     this.ancho = ancho;
     this.alto = alto;
     this.color = color;
   }
 
   public void dibujate(Graphics g)
   {
     g.setColor(this.color);
     g.fillRect(this.x, this.y, this.ancho, this.alto);
   }
 
   public boolean estaDentro(int x, int y)
   {
     return (x > this.x) && (x < this.x + this.ancho) && (y > this.y) && 
       (y < this.y + this.alto);
   }
 
   public void setPosicion(int x, int y)
   {
     this.x = x;
     this.y = y;
   }
 
   public int getX()
   {
     return this.x;
   }
 
   public int getY()
   {
     return this.y;
   }
 }