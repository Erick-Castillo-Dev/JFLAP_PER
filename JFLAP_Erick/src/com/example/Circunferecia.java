/*     */ package com.example;
/*     */ 
/*     */ import java.awt.Color;
/*     */ import java.awt.Graphics;
/*     */ 
/*     */ public class Circunferecia
/*     */   implements InterfaceFigura
/*     */ {
/*     */   private int x;
/*     */   private int y;
/*     */   private Color color;
/*     */   private int radio;
/*     */ 
/*     */   public Circunferecia(int x, int y, int radio, Color color)
/*     */   {
/*  50 */     this.x = x;
/*  51 */     this.y = y;
/*  52 */     this.color = color;
/*  53 */     this.radio = radio;
/*     */   }
/*     */ 
/*     */   public void dibujate(Graphics g)
/*     */   {
/*  63 */     g.setColor(this.color);
/*  64 */     g.drawOval(this.x - this.radio, this.y - this.radio, 2 * this.radio, 2 * this.radio);
/*     */   }
/*     */ 
/*     */   public boolean estaDentro(int x, int y)
/*     */   {
/*  83 */     return Math.sqrt(
/*  80 */       (this.x - x) * (this.x - x) + 
/*  81 */       (this.y - y) * (this.y - y)) < this.radio;
/*     */   }
/*     */ 
/*     */   public void setPosicion(int x, int y)
/*     */   {
/*  97 */     this.x = x;
/*  98 */     this.y = y;
/*     */   }
/*     */ 
/*     */   public int getX()
/*     */   {
/* 108 */     return this.x;
/*     */   }
/*     */ 
/*     */   public int getY()
/*     */   {
/* 118 */     return this.y;
/*     */   }
/*     */ }

/* Location:           D:\arrastrar_graficos-1.0.jar
 * Qualified Name:     chuidiang.ejemplos.arrastrar_grafico.Circunferecia
 * JD-Core Version:    0.6.0
 */