/*     */ package com.example;
/*     */ 
/*     */ import java.awt.Canvas;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.Graphics;
/*     */ import java.awt.event.MouseEvent;
/*     */ import java.awt.event.MouseMotionListener;
/*     */ import java.util.LinkedList;
/*     */ 
/*     */ public class LienzoParaArrastrarFiguras extends Canvas
/*     */   implements MouseMotionListener
/*     */ {
/*     */   private static final long serialVersionUID = -4273648398171436938L;
/*  33 */   private LinkedList<InterfaceFigura> listaFiguras = new LinkedList();
/*     */ 
/*  38 */   private InterfaceFigura figuraArrastrandose = null;
/*     */   private int xAnteriorRaton;
/*     */   private int yAnteriorRaton;
/*     */ 
/*     */   public LienzoParaArrastrarFiguras()
/*     */   {
/*  55 */     addMouseMotionListener(this);
/*     */   }
/*     */ 
/*     */   public void addFigura(InterfaceFigura figura)
/*     */   {
/*  65 */     this.listaFiguras.add(figura);
/*     */   }
/*     */ 
/*     */   public void removeFigura(InterfaceFigura figura)
/*     */   {
/*  75 */     this.listaFiguras.remove(figura);
/*     */   }
/*     */ 
/*     */   public Dimension getPreferredSize()
/*     */   {
/*  86 */     return new Dimension(500, 500);
/*     */   }
/*     */ 
/*     */   public void paint(Graphics g)
/*     */   {
/*  98 */     for (InterfaceFigura figura : this.listaFiguras)
/*     */     {
/* 100 */       figura.dibujate(g);
/*     */     }
/*     */   }
/*     */ 
/*     */   public void mouseDragged(MouseEvent e)
/*     */   {
/* 118 */     if (this.figuraArrastrandose == null)
/*     */     {
/* 121 */       this.xAnteriorRaton = e.getX();
/* 122 */       this.yAnteriorRaton = e.getY();
/*     */ 
/* 124 */       this.figuraArrastrandose = dameFigura(e);
/*     */     }
/*     */     else
/*     */     {
/* 130 */       this.figuraArrastrandose.setPosicion(
/* 131 */         this.figuraArrastrandose.getX() + (e.getX() - this.xAnteriorRaton), 
/* 132 */         this.figuraArrastrandose.getY() + (e.getY() - this.yAnteriorRaton));
/*     */ 
/* 135 */       this.xAnteriorRaton = e.getX();
/* 136 */       this.yAnteriorRaton = e.getY();
/*     */ 
/* 139 */       repaint();
/*     */     }
/*     */   }
/*     */ 
/*     */   private InterfaceFigura dameFigura(MouseEvent e)
/*     */   {
/* 153 */     for (InterfaceFigura figura : this.listaFiguras)
/*     */     {
/* 155 */       if (figura.estaDentro(e.getX(), e.getY()))
/*     */       {
/* 157 */         return figura;
/*     */       }
/*     */     }
/*     */ 
/* 161 */     return null;
/*     */   }
/*     */ 
/*     */   public void mouseMoved(MouseEvent e)
/*     */   {
/* 171 */     this.figuraArrastrandose = null;
/*     */   }
/*     */ }

/* Location:           D:\arrastrar_graficos-1.0.jar
 * Qualified Name:     chuidiang.ejemplos.arrastrar_grafico.LienzoParaArrastrarFiguras
 * JD-Core Version:    0.6.0
 */