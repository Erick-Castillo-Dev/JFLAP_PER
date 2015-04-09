package com.example;
 import java.awt.Color;
 import java.awt.Graphics;
 
 public class Circunferecia implements InterfaceFigura{
   private int x;
   private int y;
   private Color color;
   private int radio;
 
   public Circunferecia(int x, int y, int radio, Color color)
   {
     this.x = x;
     this.y = y;
     this.color = color;
     this.radio = radio;
   }
 
   public void dibujate(Graphics g)
   {
     g.setColor(this.color);
     g.drawOval(this.x - this.radio, this.y - this.radio, 2 * this.radio, 2 * this.radio);
   }
 
   public boolean estaDentro(int x, int y)
   {
     return Math.sqrt(
       (this.x - x) * (this.x - x) + 
       (this.y - y) * (this.y - y)) < this.radio;
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