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
import java.lang.reflect.Method;
import java.text.AttributedCharacterIterator;
import java.util.Map;

public class aD extends Graphics2D {
   private final Graphics2D n;

   public aD(Graphics2D var1) {
      this.n = var1;
   }

   @Override
   public Graphics create() {
      return ((Graphics2D)com.c.c(144523399290368409L).get(this)).create();
   }

   @Override
   public Graphics create(int var1, int var2, int var3, int var4) {
      return ((Graphics2D)com.c.c(144523399290368409L).get(this)).create(var1, var2, var3, var4);
   }

   @Override
   public Color getColor() {
      return ((Graphics2D)com.c.c(144523399290368409L).get(this)).getColor();
   }

   @Override
   public void setColor(Color var1) {
      ((Graphics2D)com.c.c(144523399290368409L).get(this)).setColor(var1);
   }

   @Override
   public void setPaintMode() {
      ((Graphics2D)com.c.c(144523399290368409L).get(this)).setPaintMode();
   }

   @Override
   public void setXORMode(Color var1) {
      ((Graphics2D)com.c.c(144523399290368409L).get(this)).setXORMode(var1);
   }

   @Override
   public Font getFont() {
      return ((Graphics2D)com.c.c(144523399290368409L).get(this)).getFont();
   }

   @Override
   public void setFont(Font var1) {
      ((Graphics2D)com.c.c(144523399290368409L).get(this)).setFont(var1);
   }

   @Override
   public FontMetrics getFontMetrics() {
      return ((Graphics2D)com.c.c(144523399290368409L).get(this)).getFontMetrics();
   }

   @Override
   public FontMetrics getFontMetrics(Font var1) {
      return ((Graphics2D)com.c.c(144523399290368409L).get(this)).getFontMetrics(var1);
   }

   @Override
   public Rectangle getClipBounds() {
      return ((Graphics2D)com.c.c(144523399290368409L).get(this)).getClipBounds();
   }

   @Override
   public void clipRect(int var1, int var2, int var3, int var4) {
      ((Graphics2D)com.c.c(144523399290368409L).get(this)).clipRect(var1, var2, var3, var4);
   }

   @Override
   public void setClip(int var1, int var2, int var3, int var4) {
      ((Graphics2D)com.c.c(144523399290368409L).get(this)).setClip(var1, var2, var3, var4);
   }

   @Override
   public Shape getClip() {
      return ((Graphics2D)com.c.c(144523399290368409L).get(this)).getClip();
   }

   @Override
   public void setClip(Shape var1) {
      ((Graphics2D)com.c.c(144523399290368409L).get(this)).setClip(var1);
   }

   @Override
   public void copyArea(int var1, int var2, int var3, int var4, int var5, int var6) {
      ((Graphics2D)com.c.c(144523399290368409L).get(this)).copyArea(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void drawLine(int var1, int var2, int var3, int var4) {
      ((Graphics2D)com.c.c(144523399290368409L).get(this)).drawLine(var1, var2, var3, var4);
   }

   @Override
   public void fillRect(int var1, int var2, int var3, int var4) {
      ((Graphics2D)com.c.c(144523399290368409L).get(this)).fillRect(var1, var2, var3, var4);
   }

   @Override
   public void drawRect(int var1, int var2, int var3, int var4) {
      ((Graphics2D)com.c.c(144523399290368409L).get(this)).drawRect(var1, var2, var3, var4);
   }

   @Override
   public void clearRect(int var1, int var2, int var3, int var4) {
      ((Graphics2D)com.c.c(144523399290368409L).get(this)).clearRect(var1, var2, var3, var4);
   }

   @Override
   public void drawRoundRect(int var1, int var2, int var3, int var4, int var5, int var6) {
      ((Graphics2D)com.c.c(144523399290368409L).get(this)).drawRoundRect(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void fillRoundRect(int var1, int var2, int var3, int var4, int var5, int var6) {
      ((Graphics2D)com.c.c(144523399290368409L).get(this)).fillRoundRect(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void drawOval(int var1, int var2, int var3, int var4) {
      ((Graphics2D)com.c.c(144523399290368409L).get(this)).drawOval(var1, var2, var3, var4);
   }

   @Override
   public void fillOval(int var1, int var2, int var3, int var4) {
      ((Graphics2D)com.c.c(144523399290368409L).get(this)).fillOval(var1, var2, var3, var4);
   }

   @Override
   public void drawArc(int var1, int var2, int var3, int var4, int var5, int var6) {
      ((Graphics2D)com.c.c(144523399290368409L).get(this)).drawArc(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void fillArc(int var1, int var2, int var3, int var4, int var5, int var6) {
      ((Graphics2D)com.c.c(144523399290368409L).get(this)).fillArc(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void drawPolyline(int[] var1, int[] var2, int var3) {
      ((Graphics2D)com.c.c(144523399290368409L).get(this)).drawPolyline(var1, var2, var3);
   }

   @Override
   public void drawPolygon(int[] var1, int[] var2, int var3) {
      ((Graphics2D)com.c.c(144523399290368409L).get(this)).drawPolygon(var1, var2, var3);
   }

   @Override
   public void drawPolygon(Polygon var1) {
      ((Graphics2D)com.c.c(144523399290368409L).get(this)).drawPolygon(var1);
   }

   @Override
   public void fillPolygon(int[] var1, int[] var2, int var3) {
      ((Graphics2D)com.c.c(144523399290368409L).get(this)).fillPolygon(var1, var2, var3);
   }

   @Override
   public void fillPolygon(Polygon var1) {
      ((Graphics2D)com.c.c(144523399290368409L).get(this)).fillPolygon(var1);
   }

   @Override
   public void drawChars(char[] var1, int var2, int var3, int var4, int var5) {
      ((Graphics2D)com.c.c(144523399290368409L).get(this)).drawChars(var1, var2, var3, var4, var5);
   }

   @Override
   public void drawBytes(byte[] var1, int var2, int var3, int var4, int var5) {
      ((Graphics2D)com.c.c(144523399290368409L).get(this)).drawBytes(var1, var2, var3, var4, var5);
   }

   @Override
   public boolean drawImage(Image var1, int var2, int var3, ImageObserver var4) {
      return ((Graphics2D)com.c.c(144523399290368409L).get(this)).drawImage(var1, var2, var3, var4);
   }

   @Override
   public boolean drawImage(Image var1, int var2, int var3, int var4, int var5, ImageObserver var6) {
      return ((Graphics2D)com.c.c(144523399290368409L).get(this)).drawImage(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public boolean drawImage(Image var1, int var2, int var3, Color var4, ImageObserver var5) {
      return ((Graphics2D)com.c.c(144523399290368409L).get(this)).drawImage(var1, var2, var3, var4, var5);
   }

   @Override
   public boolean drawImage(Image var1, int var2, int var3, int var4, int var5, Color var6, ImageObserver var7) {
      return ((Graphics2D)com.c.c(144523399290368409L).get(this)).drawImage(var1, var2, var3, var4, var5, var6, var7);
   }

   @Override
   public boolean drawImage(Image var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, ImageObserver var10) {
      return ((Graphics2D)com.c.c(144523399290368409L).get(this)).drawImage(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
   }

   @Override
   public boolean drawImage(Image var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, Color var10, ImageObserver var11) {
      return ((Graphics2D)com.c.c(144523399290368409L).get(this)).drawImage(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
   }

   @Override
   public void dispose() {
      ((Graphics2D)com.c.c(144523399290368409L).get(this)).dispose();
   }

   @Override
   public String toString() {
      return ((Graphics2D)com.c.c(144523399290368409L).get(this)).toString();
   }

   @Override
   public Rectangle getClipRect() {
      return ((Graphics2D)com.c.c(144523399290368409L).get(this)).getClipRect();
   }

   @Override
   public boolean hitClip(int var1, int var2, int var3, int var4) {
      return ((Graphics2D)com.c.c(144523399290368409L).get(this)).hitClip(var1, var2, var3, var4);
   }

   @Override
   public Rectangle getClipBounds(Rectangle var1) {
      return ((Graphics2D)com.c.c(144523399290368409L).get(this)).getClipBounds(var1);
   }

   @Override
   public void draw3DRect(int var1, int var2, int var3, int var4, boolean var5) {
      ((Graphics2D)com.c.c(144523399290368409L).get(this)).draw3DRect(var1, var2, var3, var4, var5);
   }

   @Override
   public void fill3DRect(int var1, int var2, int var3, int var4, boolean var5) {
      ((Graphics2D)com.c.c(144523399290368409L).get(this)).fill3DRect(var1, var2, var3, var4, var5);
   }

   @Override
   public void draw(Shape var1) {
      ((Graphics2D)com.c.c(144523399290368409L).get(this)).draw(var1);
   }

   @Override
   public boolean drawImage(Image var1, AffineTransform var2, ImageObserver var3) {
      return ((Graphics2D)com.c.c(144523399290368409L).get(this)).drawImage(var1, var2, var3);
   }

   @Override
   public void drawImage(BufferedImage var1, BufferedImageOp var2, int var3, int var4) {
      ((Graphics2D)com.c.c(144523399290368409L).get(this)).drawImage(var1, var2, var3, var4);
   }

   @Override
   public void drawRenderedImage(RenderedImage var1, AffineTransform var2) {
      ((Graphics2D)com.c.c(144523399290368409L).get(this)).drawRenderedImage(var1, var2);
   }

   @Override
   public void drawRenderableImage(RenderableImage var1, AffineTransform var2) {
      ((Graphics2D)com.c.c(144523399290368409L).get(this)).drawRenderableImage(var1, var2);
   }

   @Override
   public void drawString(String var1, int var2, int var3) {
      Object[] var10000 = com.c.a(var1);
      Method var6 = com.c.d(139122500711711222L);
      Object[] var9 = var10000;
      Object var8 = null;

      try {
         var10000 = (String)var6.invoke(var8, var9);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      var1 = var10000;
      ((Graphics2D)com.c.c(144523399290368409L).get(this)).drawString(var1, var2, var3);
   }

   @Override
   public void drawString(String var1, float var2, float var3) {
      Object[] var10000 = com.c.a(var1);
      Method var6 = com.c.d(139122500711711222L);
      Object[] var9 = var10000;
      Object var8 = null;

      try {
         var10000 = (String)var6.invoke(var8, var9);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      var1 = var10000;
      ((Graphics2D)com.c.c(144523399290368409L).get(this)).drawString(var1, var2, var3);
   }

   @Override
   public void drawString(AttributedCharacterIterator var1, int var2, int var3) {
      ((Graphics2D)com.c.c(144523399290368409L).get(this)).drawString(var1, var2, var3);
   }

   @Override
   public void drawString(AttributedCharacterIterator var1, float var2, float var3) {
      ((Graphics2D)com.c.c(144523399290368409L).get(this)).drawString(var1, var2, var3);
   }

   @Override
   public void drawGlyphVector(GlyphVector var1, float var2, float var3) {
      ((Graphics2D)com.c.c(144523399290368409L).get(this)).drawGlyphVector(var1, var2, var3);
   }

   @Override
   public void fill(Shape var1) {
      ((Graphics2D)com.c.c(144523399290368409L).get(this)).fill(var1);
   }

   @Override
   public boolean hit(Rectangle var1, Shape var2, boolean var3) {
      return ((Graphics2D)com.c.c(144523399290368409L).get(this)).hit(var1, var2, var3);
   }

   @Override
   public GraphicsConfiguration getDeviceConfiguration() {
      return ((Graphics2D)com.c.c(144523399290368409L).get(this)).getDeviceConfiguration();
   }

   @Override
   public void setComposite(Composite var1) {
      ((Graphics2D)com.c.c(144523399290368409L).get(this)).setComposite(var1);
   }

   @Override
   public void setPaint(Paint var1) {
      ((Graphics2D)com.c.c(144523399290368409L).get(this)).setPaint(var1);
   }

   @Override
   public void setStroke(Stroke var1) {
      ((Graphics2D)com.c.c(144523399290368409L).get(this)).setStroke(var1);
   }

   @Override
   public void setRenderingHint(Key var1, Object var2) {
      ((Graphics2D)com.c.c(144523399290368409L).get(this)).setRenderingHint(var1, var2);
   }

   @Override
   public Object getRenderingHint(Key var1) {
      return ((Graphics2D)com.c.c(144523399290368409L).get(this)).getRenderingHint(var1);
   }

   @Override
   public void setRenderingHints(Map var1) {
      ((Graphics2D)com.c.c(144523399290368409L).get(this)).setRenderingHints(var1);
   }

   @Override
   public void addRenderingHints(Map var1) {
      ((Graphics2D)com.c.c(144523399290368409L).get(this)).addRenderingHints(var1);
   }

   @Override
   public RenderingHints getRenderingHints() {
      return ((Graphics2D)com.c.c(144523399290368409L).get(this)).getRenderingHints();
   }

   @Override
   public void translate(int var1, int var2) {
      ((Graphics2D)com.c.c(144523399290368409L).get(this)).translate(var1, var2);
   }

   @Override
   public void translate(double var1, double var3) {
      ((Graphics2D)com.c.c(144523399290368409L).get(this)).translate(var1, var3);
   }

   @Override
   public void rotate(double var1) {
      ((Graphics2D)com.c.c(144523399290368409L).get(this)).rotate(var1);
   }

   @Override
   public void rotate(double var1, double var3, double var5) {
      ((Graphics2D)com.c.c(144523399290368409L).get(this)).rotate(var1, var3, var5);
   }

   @Override
   public void scale(double var1, double var3) {
      ((Graphics2D)com.c.c(144523399290368409L).get(this)).scale(var1, var3);
   }

   @Override
   public void shear(double var1, double var3) {
      ((Graphics2D)com.c.c(144523399290368409L).get(this)).shear(var1, var3);
   }

   @Override
   public void transform(AffineTransform var1) {
      ((Graphics2D)com.c.c(144523399290368409L).get(this)).transform(var1);
   }

   @Override
   public void setTransform(AffineTransform var1) {
      ((Graphics2D)com.c.c(144523399290368409L).get(this)).setTransform(var1);
   }

   @Override
   public AffineTransform getTransform() {
      return ((Graphics2D)com.c.c(144523399290368409L).get(this)).getTransform();
   }

   @Override
   public Paint getPaint() {
      return ((Graphics2D)com.c.c(144523399290368409L).get(this)).getPaint();
   }

   @Override
   public Composite getComposite() {
      return ((Graphics2D)com.c.c(144523399290368409L).get(this)).getComposite();
   }

   @Override
   public void setBackground(Color var1) {
      ((Graphics2D)com.c.c(144523399290368409L).get(this)).setBackground(var1);
   }

   @Override
   public Color getBackground() {
      return ((Graphics2D)com.c.c(144523399290368409L).get(this)).getBackground();
   }

   @Override
   public Stroke getStroke() {
      return ((Graphics2D)com.c.c(144523399290368409L).get(this)).getStroke();
   }

   @Override
   public void clip(Shape var1) {
      ((Graphics2D)com.c.c(144523399290368409L).get(this)).clip(var1);
   }

   @Override
   public FontRenderContext getFontRenderContext() {
      return ((Graphics2D)com.c.c(144523399290368409L).get(this)).getFontRenderContext();
   }
}





