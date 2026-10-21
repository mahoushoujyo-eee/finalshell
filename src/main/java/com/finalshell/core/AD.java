package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.awt.Color;
import java.awt.Composite;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.Image;
import java.awt.Paint;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.RenderingHints.Key;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ImageObserver;
import java.awt.image.RenderedImage;
import java.awt.image.renderable.RenderableImage;
import java.lang.reflect.InvocationTargetException;
import java.text.AttributedCharacterIterator;
import java.util.Map;

public class AD extends Graphics2D {
   public final Graphics2D n;

   public AD(Graphics2D var1) {
      this.n = var1;
   }

   @Override
   public Graphics create() {
      Object var1 = 144523399290368409L;
      return ((Graphics2D)Ref.g(144523399290368409L, var1)).create();
   }

   @Override
   public Graphics create(int var1, int var2, int var3, int var4) {
      Object var5 = 144523399290368409L;
      return ((Graphics2D)Ref.g(144523399290368409L, var5)).create(var1, var2, var3, var4);
   }

   @Override
   public Color getColor() {
      Object var1 = 144523399290368409L;
      return ((Graphics2D)Ref.g(144523399290368409L, var1)).getColor();
   }

   @Override
   public void setColor(Color var1) {
      Object var2 = 144523399290368409L;
      ((Graphics2D)Ref.g(144523399290368409L, var2)).setColor(var1);
   }

   @Override
   public void setPaintMode() {
      Object var1 = 144523399290368409L;
      ((Graphics2D)Ref.g(144523399290368409L, var1)).setPaintMode();
   }

   @Override
   public void setXORMode(Color var1) {
      Object var2 = 144523399290368409L;
      ((Graphics2D)Ref.g(144523399290368409L, var2)).setXORMode(var1);
   }

   @Override
   public Font getFont() {
      Object var1 = 144523399290368409L;
      return ((Graphics2D)Ref.g(144523399290368409L, var1)).getFont();
   }

   @Override
   public void setFont(Font var1) {
      Object var2 = 144523399290368409L;
      ((Graphics2D)Ref.g(144523399290368409L, var2)).setFont(var1);
   }

   @Override
   public FontMetrics getFontMetrics() {
      Object var1 = 144523399290368409L;
      return ((Graphics2D)Ref.g(144523399290368409L, var1)).getFontMetrics();
   }

   @Override
   public FontMetrics getFontMetrics(Font var1) {
      Object var2 = 144523399290368409L;
      return ((Graphics2D)Ref.g(144523399290368409L, var2)).getFontMetrics(var1);
   }

   @Override
   public Rectangle getClipBounds() {
      Object var1 = 144523399290368409L;
      return ((Graphics2D)Ref.g(144523399290368409L, var1)).getClipBounds();
   }

   @Override
   public void clipRect(int var1, int var2, int var3, int var4) {
      Object var5 = 144523399290368409L;
      ((Graphics2D)Ref.g(144523399290368409L, var5)).clipRect(var1, var2, var3, var4);
   }

   @Override
   public void setClip(int var1, int var2, int var3, int var4) {
      Object var5 = 144523399290368409L;
      ((Graphics2D)Ref.g(144523399290368409L, var5)).setClip(var1, var2, var3, var4);
   }

   @Override
   public Shape getClip() {
      Object var1 = 144523399290368409L;
      return ((Graphics2D)Ref.g(144523399290368409L, var1)).getClip();
   }

   @Override
   public void setClip(Shape var1) {
      Object var2 = 144523399290368409L;
      ((Graphics2D)Ref.g(144523399290368409L, var2)).setClip(var1);
   }

   @Override
   public void copyArea(int var1, int var2, int var3, int var4, int var5, int var6) {
      Object var7 = 144523399290368409L;
      ((Graphics2D)Ref.g(144523399290368409L, var7)).copyArea(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void drawLine(int var1, int var2, int var3, int var4) {
      Object var5 = 144523399290368409L;
      ((Graphics2D)Ref.g(144523399290368409L, var5)).drawLine(var1, var2, var3, var4);
   }

   @Override
   public void fillRect(int var1, int var2, int var3, int var4) {
      Object var5 = 144523399290368409L;
      ((Graphics2D)Ref.g(144523399290368409L, var5)).fillRect(var1, var2, var3, var4);
   }

   @Override
   public void drawRect(int var1, int var2, int var3, int var4) {
      Object var5 = 144523399290368409L;
      ((Graphics2D)Ref.g(144523399290368409L, var5)).drawRect(var1, var2, var3, var4);
   }

   @Override
   public void clearRect(int var1, int var2, int var3, int var4) {
      Object var5 = 144523399290368409L;
      ((Graphics2D)Ref.g(144523399290368409L, var5)).clearRect(var1, var2, var3, var4);
   }

   @Override
   public void drawRoundRect(int var1, int var2, int var3, int var4, int var5, int var6) {
      Object var7 = 144523399290368409L;
      ((Graphics2D)Ref.g(144523399290368409L, var7)).drawRoundRect(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void fillRoundRect(int var1, int var2, int var3, int var4, int var5, int var6) {
      Object var7 = 144523399290368409L;
      ((Graphics2D)Ref.g(144523399290368409L, var7)).fillRoundRect(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void drawOval(int var1, int var2, int var3, int var4) {
      Object var5 = 144523399290368409L;
      ((Graphics2D)Ref.g(144523399290368409L, var5)).drawOval(var1, var2, var3, var4);
   }

   @Override
   public void fillOval(int var1, int var2, int var3, int var4) {
      Object var5 = 144523399290368409L;
      ((Graphics2D)Ref.g(144523399290368409L, var5)).fillOval(var1, var2, var3, var4);
   }

   @Override
   public void drawArc(int var1, int var2, int var3, int var4, int var5, int var6) {
      Object var7 = 144523399290368409L;
      ((Graphics2D)Ref.g(144523399290368409L, var7)).drawArc(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void fillArc(int var1, int var2, int var3, int var4, int var5, int var6) {
      Object var7 = 144523399290368409L;
      ((Graphics2D)Ref.g(144523399290368409L, var7)).fillArc(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void drawPolyline(int[] var1, int[] var2, int var3) {
      Object var4 = 144523399290368409L;
      ((Graphics2D)Ref.g(144523399290368409L, var4)).drawPolyline(var1, var2, var3);
   }

   @Override
   public void drawPolygon(int[] var1, int[] var2, int var3) {
      Object var4 = 144523399290368409L;
      ((Graphics2D)Ref.g(144523399290368409L, var4)).drawPolygon(var1, var2, var3);
   }

   @Override
   public void drawPolygon(Polygon var1) {
      Object var2 = 144523399290368409L;
      ((Graphics2D)Ref.g(144523399290368409L, var2)).drawPolygon(var1);
   }

   @Override
   public void fillPolygon(int[] var1, int[] var2, int var3) {
      Object var4 = 144523399290368409L;
      ((Graphics2D)Ref.g(144523399290368409L, var4)).fillPolygon(var1, var2, var3);
   }

   @Override
   public void fillPolygon(Polygon var1) {
      Object var2 = 144523399290368409L;
      ((Graphics2D)Ref.g(144523399290368409L, var2)).fillPolygon(var1);
   }

   @Override
   public void drawChars(char[] var1, int var2, int var3, int var4, int var5) {
      Object var6 = 144523399290368409L;
      ((Graphics2D)Ref.g(144523399290368409L, var6)).drawChars(var1, var2, var3, var4, var5);
   }

   @Override
   public void drawBytes(byte[] var1, int var2, int var3, int var4, int var5) {
      Object var6 = 144523399290368409L;
      ((Graphics2D)Ref.g(144523399290368409L, var6)).drawBytes(var1, var2, var3, var4, var5);
   }

   @Override
   public boolean drawImage(Image var1, int var2, int var3, ImageObserver var4) {
      Object var5 = 144523399290368409L;
      return ((Graphics2D)Ref.g(144523399290368409L, var5)).drawImage(var1, var2, var3, var4);
   }

   @Override
   public boolean drawImage(Image var1, int var2, int var3, int var4, int var5, ImageObserver var6) {
      Object var7 = 144523399290368409L;
      return ((Graphics2D)Ref.g(144523399290368409L, var7)).drawImage(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public boolean drawImage(Image var1, int var2, int var3, Color var4, ImageObserver var5) {
      Object var6 = 144523399290368409L;
      return ((Graphics2D)Ref.g(144523399290368409L, var6)).drawImage(var1, var2, var3, var4, var5);
   }

   @Override
   public boolean drawImage(Image var1, int var2, int var3, int var4, int var5, Color var6, ImageObserver var7) {
      Object var8 = 144523399290368409L;
      return ((Graphics2D)Ref.g(144523399290368409L, var8)).drawImage(var1, var2, var3, var4, var5, var6, var7);
   }

   @Override
   public boolean drawImage(Image var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, ImageObserver var10) {
      Object var11 = 144523399290368409L;
      return ((Graphics2D)Ref.g(144523399290368409L, var11)).drawImage(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
   }

   @Override
   public boolean drawImage(Image var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, Color var10, ImageObserver var11) {
      Object var12 = 144523399290368409L;
      return ((Graphics2D)Ref.g(144523399290368409L, var12)).drawImage(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
   }

   @Override
   public void dispose() {
      Object var1 = 144523399290368409L;
      ((Graphics2D)Ref.g(144523399290368409L, var1)).dispose();
   }

   @Override
   public String toString() {
      Object var1 = 144523399290368409L;
      return ((Graphics2D)Ref.g(144523399290368409L, var1)).toString();
   }

   @Override
   public Rectangle getClipRect() {
      Object var1 = 144523399290368409L;
      return ((Graphics2D)Ref.g(144523399290368409L, var1)).getClipRect();
   }

   @Override
   public boolean hitClip(int var1, int var2, int var3, int var4) {
      Object var5 = 144523399290368409L;
      return ((Graphics2D)Ref.g(144523399290368409L, var5)).hitClip(var1, var2, var3, var4);
   }

   @Override
   public Rectangle getClipBounds(Rectangle var1) {
      Object var2 = 144523399290368409L;
      return ((Graphics2D)Ref.g(144523399290368409L, var2)).getClipBounds(var1);
   }

   @Override
   public void draw3DRect(int var1, int var2, int var3, int var4, boolean var5) {
      Object var6 = 144523399290368409L;
      ((Graphics2D)Ref.g(144523399290368409L, var6)).draw3DRect(var1, var2, var3, var4, var5);
   }

   @Override
   public void fill3DRect(int var1, int var2, int var3, int var4, boolean var5) {
      Object var6 = 144523399290368409L;
      ((Graphics2D)Ref.g(144523399290368409L, var6)).fill3DRect(var1, var2, var3, var4, var5);
   }

   @Override
   public void draw(Shape var1) {
      Object var2 = 144523399290368409L;
      ((Graphics2D)Ref.g(144523399290368409L, var2)).draw(var1);
   }

   @Override
   public boolean drawImage(Image var1, AffineTransform var2, ImageObserver var3) {
      Object var4 = 144523399290368409L;
      return ((Graphics2D)Ref.g(144523399290368409L, var4)).drawImage(var1, var2, var3);
   }

   @Override
   public void drawImage(BufferedImage var1, BufferedImageOp var2, int var3, int var4) {
      Object var5 = 144523399290368409L;
      ((Graphics2D)Ref.g(144523399290368409L, var5)).drawImage(var1, var2, var3, var4);
   }

   @Override
   public void drawRenderedImage(RenderedImage var1, AffineTransform var2) {
      Object var3 = 144523399290368409L;
      ((Graphics2D)Ref.g(144523399290368409L, var3)).drawRenderedImage(var1, var2);
   }

   @Override
   public void drawRenderableImage(RenderableImage var1, AffineTransform var2) {
      Object var3 = 144523399290368409L;
      ((Graphics2D)Ref.g(144523399290368409L, var3)).drawRenderableImage(var1, var2);
   }

   @Override
   public void drawString(String var1, int var2, int var3) {
      Registry.packArgs(var1);
      long var4 = 139122500711711222L;
      Object var10001 = Ref.h2(139122500711711222L, var4);

      try {
         var10001 = (String)var10001;
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }

      var1 = (String)var10001;
      Object var6 = 144523399290368409L;
      ((Graphics2D)Ref.g(144523399290368409L, var6)).drawString(var1, var2, var3);
   }

   @Override
   public void drawString(String var1, float var2, float var3) {
      Registry.packArgs(var1);
      long var4 = 139122500711711222L;
      Object var10001 = Ref.h2(139122500711711222L, var4);

      try {
         var10001 = (String)var10001;
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }

      var1 = (String)var10001;
      Object var6 = 144523399290368409L;
      ((Graphics2D)Ref.g(144523399290368409L, var6)).drawString(var1, var2, var3);
   }

   @Override
   public void drawString(AttributedCharacterIterator var1, int var2, int var3) {
      Object var4 = 144523399290368409L;
      ((Graphics2D)Ref.g(144523399290368409L, var4)).drawString(var1, var2, var3);
   }

   @Override
   public void drawString(AttributedCharacterIterator var1, float var2, float var3) {
      Object var4 = 144523399290368409L;
      ((Graphics2D)Ref.g(144523399290368409L, var4)).drawString(var1, var2, var3);
   }

   @Override
   public void drawGlyphVector(GlyphVector var1, float var2, float var3) {
      Object var4 = 144523399290368409L;
      ((Graphics2D)Ref.g(144523399290368409L, var4)).drawGlyphVector(var1, var2, var3);
   }

   @Override
   public void fill(Shape var1) {
      Object var2 = 144523399290368409L;
      ((Graphics2D)Ref.g(144523399290368409L, var2)).fill(var1);
   }

   @Override
   public boolean hit(Rectangle var1, Shape var2, boolean var3) {
      Object var4 = 144523399290368409L;
      return ((Graphics2D)Ref.g(144523399290368409L, var4)).hit(var1, var2, var3);
   }

   @Override
   public GraphicsConfiguration getDeviceConfiguration() {
      Object var1 = 144523399290368409L;
      return ((Graphics2D)Ref.g(144523399290368409L, var1)).getDeviceConfiguration();
   }

   @Override
   public void setComposite(Composite var1) {
      Object var2 = 144523399290368409L;
      ((Graphics2D)Ref.g(144523399290368409L, var2)).setComposite(var1);
   }

   @Override
   public void setPaint(Paint var1) {
      Object var2 = 144523399290368409L;
      ((Graphics2D)Ref.g(144523399290368409L, var2)).setPaint(var1);
   }

   @Override
   public void setStroke(Stroke var1) {
      Object var2 = 144523399290368409L;
      ((Graphics2D)Ref.g(144523399290368409L, var2)).setStroke(var1);
   }

   @Override
   public void setRenderingHint(Key var1, Object var2) {
      Object var3 = 144523399290368409L;
      ((Graphics2D)Ref.g(144523399290368409L, var3)).setRenderingHint(var1, var2);
   }

   @Override
   public Object getRenderingHint(Key var1) {
      Object var2 = 144523399290368409L;
      return ((Graphics2D)Ref.g(144523399290368409L, var2)).getRenderingHint(var1);
   }

   @Override
   public void setRenderingHints(Map var1) {
      Object var2 = 144523399290368409L;
      ((Graphics2D)Ref.g(144523399290368409L, var2)).setRenderingHints(var1);
   }

   @Override
   public void addRenderingHints(Map var1) {
      Object var2 = 144523399290368409L;
      ((Graphics2D)Ref.g(144523399290368409L, var2)).addRenderingHints(var1);
   }

   @Override
   public RenderingHints getRenderingHints() {
      Object var1 = 144523399290368409L;
      return ((Graphics2D)Ref.g(144523399290368409L, var1)).getRenderingHints();
   }

   @Override
   public void translate(int var1, int var2) {
      Object var3 = 144523399290368409L;
      ((Graphics2D)Ref.g(144523399290368409L, var3)).translate(var1, var2);
   }

   @Override
   public void translate(double var1, double var3) {
      Object var5 = 144523399290368409L;
      ((Graphics2D)Ref.g(144523399290368409L, var5)).translate(var1, var3);
   }

   @Override
   public void rotate(double var1) {
      Object var3 = 144523399290368409L;
      ((Graphics2D)Ref.g(144523399290368409L, var3)).rotate(var1);
   }

   @Override
   public void rotate(double var1, double var3, double var5) {
      Object var7 = 144523399290368409L;
      ((Graphics2D)Ref.g(144523399290368409L, var7)).rotate(var1, var3, var5);
   }

   @Override
   public void scale(double var1, double var3) {
      Object var5 = 144523399290368409L;
      ((Graphics2D)Ref.g(144523399290368409L, var5)).scale(var1, var3);
   }

   @Override
   public void shear(double var1, double var3) {
      Object var5 = 144523399290368409L;
      ((Graphics2D)Ref.g(144523399290368409L, var5)).shear(var1, var3);
   }

   @Override
   public void transform(AffineTransform var1) {
      Object var2 = 144523399290368409L;
      ((Graphics2D)Ref.g(144523399290368409L, var2)).transform(var1);
   }

   @Override
   public void setTransform(AffineTransform var1) {
      Object var2 = 144523399290368409L;
      ((Graphics2D)Ref.g(144523399290368409L, var2)).setTransform(var1);
   }

   @Override
   public AffineTransform getTransform() {
      Object var1 = 144523399290368409L;
      return ((Graphics2D)Ref.g(144523399290368409L, var1)).getTransform();
   }

   @Override
   public Paint getPaint() {
      Object var1 = 144523399290368409L;
      return ((Graphics2D)Ref.g(144523399290368409L, var1)).getPaint();
   }

   @Override
   public Composite getComposite() {
      Object var1 = 144523399290368409L;
      return ((Graphics2D)Ref.g(144523399290368409L, var1)).getComposite();
   }

   @Override
   public void setBackground(Color var1) {
      Object var2 = 144523399290368409L;
      ((Graphics2D)Ref.g(144523399290368409L, var2)).setBackground(var1);
   }

   @Override
   public Color getBackground() {
      Object var1 = 144523399290368409L;
      return ((Graphics2D)Ref.g(144523399290368409L, var1)).getBackground();
   }

   @Override
   public Stroke getStroke() {
      Object var1 = 144523399290368409L;
      return ((Graphics2D)Ref.g(144523399290368409L, var1)).getStroke();
   }

   @Override
   public void clip(Shape var1) {
      Object var2 = 144523399290368409L;
      ((Graphics2D)Ref.g(144523399290368409L, var2)).clip(var1);
   }

   @Override
   public FontRenderContext getFontRenderContext() {
      Object var1 = 144523399290368409L;
      return ((Graphics2D)Ref.g(144523399290368409L, var1)).getFontRenderContext();
   }
}





