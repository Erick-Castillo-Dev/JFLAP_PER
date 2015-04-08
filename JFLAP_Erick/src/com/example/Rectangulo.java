/*     */ package com.example;
/*     */ 
/*     */ import java.awt.Color;
/*     */ import java.awt.Graphics;
/*     */ 
/*     */ public class Rectangulo
/*     */   implements InterfaceFigura
/*     */ {
/*     */   private int x;
/*     */   private int y;
/*     */   private int ancho;
/*     */   private int alto;
/*     */   private Color color;
/*     */ 
/*     */   public Rectangulo(int x, int y, int alto, int ancho, Color color)
/*     */   {
/*  56 */     this.x = x;
/*  57 */     this.y = y;
/*  58 */     this.ancho = ancho;
/*  59 */     this.alto = alto;
/*  60 */     this.color = color;
/*     */   }
/*     */ 
/*     */   public void dibujate(Graphics g)
/*     */   {
/*  70 */     g.setColor(this.color);
/*  71 */     g.fillRect(this.x, this.y, this.ancho, this.alto);
/*     */   }
/*     */ 
/*     */   public boolean estaDentro(int x, int y)
/*     */   {
/*  88 */     return (x > this.x) && (x < this.x + this.ancho) && (y > this.y) && 
/*  86 */       (y < this.y + this.alto);
/*     */   }
/*     */ 
/*     */   public void setPosicion(int x, int y)
/*     */   {
/* 102 */     this.x = x;
/* 103 */     this.y = y;
/*     */   }
/*     */ 
/*     */   public int getX()
/*     */   {
/* 113 */     return this.x;
/*     */   }
/*     */ 
/*     */   public int getY()
/*     */   {
/* 123 */     return this.y;
/*     */   }
/*     */ }

/* Location:           D:\arrastrar_graficos-1.0.jar
 * Qualified Name:     chuidiang.ejemplos.arrastrar_grafico.Rectangulo
 * JD-Core Version:    0.6.0
 */