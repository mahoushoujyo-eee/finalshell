/*
 * Decompiled with CFR 0.152.
 */
import com.c;
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

public class aD
extends Graphics2D {
    private final Graphics2D n;

    public aD(Graphics2D graphics2D) {
        this.n = graphics2D;
    }

    @Override
    public Graphics create() {
        return ((Graphics2D)this.n).create();
    }

    @Override
    public Graphics create(int n10, int n11, int n12, int n13) {
        return ((Graphics2D)this.n).create(n10, n11, n12, n13);
    }

    @Override
    public Color getColor() {
        return ((Graphics2D)this.n).getColor();
    }

    @Override
    public void setColor(Color color) {
        ((Graphics2D)this.n).setColor(color);
    }

    @Override
    public void setPaintMode() {
        ((Graphics2D)this.n).setPaintMode();
    }

    @Override
    public void setXORMode(Color color) {
        ((Graphics2D)this.n).setXORMode(color);
    }

    @Override
    public Font getFont() {
        return ((Graphics2D)this.n).getFont();
    }

    @Override
    public void setFont(Font font) {
        ((Graphics2D)this.n).setFont(font);
    }

    @Override
    public FontMetrics getFontMetrics() {
        return ((Graphics2D)this.n).getFontMetrics();
    }

    @Override
    public FontMetrics getFontMetrics(Font font) {
        return ((Graphics2D)this.n).getFontMetrics(font);
    }

    @Override
    public Rectangle getClipBounds() {
        return ((Graphics2D)this.n).getClipBounds();
    }

    @Override
    public void clipRect(int n10, int n11, int n12, int n13) {
        ((Graphics2D)this.n).clipRect(n10, n11, n12, n13);
    }

    @Override
    public void setClip(int n10, int n11, int n12, int n13) {
        ((Graphics2D)this.n).setClip(n10, n11, n12, n13);
    }

    @Override
    public Shape getClip() {
        return ((Graphics2D)this.n).getClip();
    }

    @Override
    public void setClip(Shape shape) {
        ((Graphics2D)this.n).setClip(shape);
    }

    @Override
    public void copyArea(int n10, int n11, int n12, int n13, int n14, int n15) {
        ((Graphics2D)this.n).copyArea(n10, n11, n12, n13, n14, n15);
    }

    @Override
    public void drawLine(int n10, int n11, int n12, int n13) {
        ((Graphics2D)this.n).drawLine(n10, n11, n12, n13);
    }

    @Override
    public void fillRect(int n10, int n11, int n12, int n13) {
        ((Graphics2D)this.n).fillRect(n10, n11, n12, n13);
    }

    @Override
    public void drawRect(int n10, int n11, int n12, int n13) {
        ((Graphics2D)this.n).drawRect(n10, n11, n12, n13);
    }

    @Override
    public void clearRect(int n10, int n11, int n12, int n13) {
        ((Graphics2D)this.n).clearRect(n10, n11, n12, n13);
    }

    @Override
    public void drawRoundRect(int n10, int n11, int n12, int n13, int n14, int n15) {
        ((Graphics2D)this.n).drawRoundRect(n10, n11, n12, n13, n14, n15);
    }

    @Override
    public void fillRoundRect(int n10, int n11, int n12, int n13, int n14, int n15) {
        ((Graphics2D)this.n).fillRoundRect(n10, n11, n12, n13, n14, n15);
    }

    @Override
    public void drawOval(int n10, int n11, int n12, int n13) {
        ((Graphics2D)this.n).drawOval(n10, n11, n12, n13);
    }

    @Override
    public void fillOval(int n10, int n11, int n12, int n13) {
        ((Graphics2D)this.n).fillOval(n10, n11, n12, n13);
    }

    @Override
    public void drawArc(int n10, int n11, int n12, int n13, int n14, int n15) {
        ((Graphics2D)this.n).drawArc(n10, n11, n12, n13, n14, n15);
    }

    @Override
    public void fillArc(int n10, int n11, int n12, int n13, int n14, int n15) {
        ((Graphics2D)this.n).fillArc(n10, n11, n12, n13, n14, n15);
    }

    @Override
    public void drawPolyline(int[] nArray, int[] nArray2, int n10) {
        ((Graphics2D)this.n).drawPolyline(nArray, nArray2, n10);
    }

    @Override
    public void drawPolygon(int[] nArray, int[] nArray2, int n10) {
        ((Graphics2D)this.n).drawPolygon(nArray, nArray2, n10);
    }

    @Override
    public void drawPolygon(Polygon polygon) {
        ((Graphics2D)this.n).drawPolygon(polygon);
    }

    @Override
    public void fillPolygon(int[] nArray, int[] nArray2, int n10) {
        ((Graphics2D)this.n).fillPolygon(nArray, nArray2, n10);
    }

    @Override
    public void fillPolygon(Polygon polygon) {
        ((Graphics2D)this.n).fillPolygon(polygon);
    }

    @Override
    public void drawChars(char[] cArray, int n10, int n11, int n12, int n13) {
        ((Graphics2D)this.n).drawChars(cArray, n10, n11, n12, n13);
    }

    @Override
    public void drawBytes(byte[] byArray, int n10, int n11, int n12, int n13) {
        ((Graphics2D)this.n).drawBytes(byArray, n10, n11, n12, n13);
    }

    @Override
    public boolean drawImage(Image image, int n10, int n11, ImageObserver imageObserver) {
        return ((Graphics2D)this.n).drawImage(image, n10, n11, imageObserver);
    }

    @Override
    public boolean drawImage(Image image, int n10, int n11, int n12, int n13, ImageObserver imageObserver) {
        return ((Graphics2D)this.n).drawImage(image, n10, n11, n12, n13, imageObserver);
    }

    @Override
    public boolean drawImage(Image image, int n10, int n11, Color color, ImageObserver imageObserver) {
        return ((Graphics2D)this.n).drawImage(image, n10, n11, color, imageObserver);
    }

    @Override
    public boolean drawImage(Image image, int n10, int n11, int n12, int n13, Color color, ImageObserver imageObserver) {
        return ((Graphics2D)this.n).drawImage(image, n10, n11, n12, n13, color, imageObserver);
    }

    @Override
    public boolean drawImage(Image image, int n10, int n11, int n12, int n13, int n14, int n15, int n16, int n17, ImageObserver imageObserver) {
        return ((Graphics2D)this.n).drawImage(image, n10, n11, n12, n13, n14, n15, n16, n17, imageObserver);
    }

    @Override
    public boolean drawImage(Image image, int n10, int n11, int n12, int n13, int n14, int n15, int n16, int n17, Color color, ImageObserver imageObserver) {
        return ((Graphics2D)this.n).drawImage(image, n10, n11, n12, n13, n14, n15, n16, n17, color, imageObserver);
    }

    @Override
    public void dispose() {
        ((Graphics2D)this.n).dispose();
    }

    @Override
    public String toString() {
        return ((Graphics2D)this.n).toString();
    }

    @Override
    public Rectangle getClipRect() {
        return ((Graphics2D)this.n).getClipRect();
    }

    @Override
    public boolean hitClip(int n10, int n11, int n12, int n13) {
        return ((Graphics2D)this.n).hitClip(n10, n11, n12, n13);
    }

    @Override
    public Rectangle getClipBounds(Rectangle rectangle) {
        return ((Graphics2D)this.n).getClipBounds(rectangle);
    }

    @Override
    public void draw3DRect(int n10, int n11, int n12, int n13, boolean bl) {
        ((Graphics2D)this.n).draw3DRect(n10, n11, n12, n13, bl);
    }

    @Override
    public void fill3DRect(int n10, int n11, int n12, int n13, boolean bl) {
        ((Graphics2D)this.n).fill3DRect(n10, n11, n12, n13, bl);
    }

    @Override
    public void draw(Shape shape) {
        ((Graphics2D)this.n).draw(shape);
    }

    @Override
    public boolean drawImage(Image image, AffineTransform affineTransform, ImageObserver imageObserver) {
        return ((Graphics2D)this.n).drawImage(image, affineTransform, imageObserver);
    }

    @Override
    public void drawImage(BufferedImage bufferedImage, BufferedImageOp bufferedImageOp, int n10, int n11) {
        ((Graphics2D)this.n).drawImage(bufferedImage, bufferedImageOp, n10, n11);
    }

    @Override
    public void drawRenderedImage(RenderedImage renderedImage, AffineTransform affineTransform) {
        ((Graphics2D)this.n).drawRenderedImage(renderedImage, affineTransform);
    }

    @Override
    public void drawRenderableImage(RenderableImage renderableImage, AffineTransform affineTransform) {
        ((Graphics2D)this.n).drawRenderableImage(renderableImage, affineTransform);
    }

    @Override
    public void drawString(String string, int n10, int n11) {
        String string2;
        try {
            string2 = (String)lk_0.a(string);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        string = string2;
        ((Graphics2D)this.n).drawString(string, n10, n11);
    }

    @Override
    public void drawString(String string, float f10, float f11) {
        String string2;
        try {
            string2 = (String)lk_0.a(string);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        string = string2;
        ((Graphics2D)this.n).drawString(string, f10, f11);
    }

    @Override
    public void drawString(AttributedCharacterIterator attributedCharacterIterator, int n10, int n11) {
        ((Graphics2D)this.n).drawString(attributedCharacterIterator, n10, n11);
    }

    @Override
    public void drawString(AttributedCharacterIterator attributedCharacterIterator, float f10, float f11) {
        ((Graphics2D)this.n).drawString(attributedCharacterIterator, f10, f11);
    }

    @Override
    public void drawGlyphVector(GlyphVector glyphVector, float f10, float f11) {
        ((Graphics2D)this.n).drawGlyphVector(glyphVector, f10, f11);
    }

    @Override
    public void fill(Shape shape) {
        ((Graphics2D)this.n).fill(shape);
    }

    @Override
    public boolean hit(Rectangle rectangle, Shape shape, boolean bl) {
        return ((Graphics2D)this.n).hit(rectangle, shape, bl);
    }

    @Override
    public GraphicsConfiguration getDeviceConfiguration() {
        return ((Graphics2D)this.n).getDeviceConfiguration();
    }

    @Override
    public void setComposite(Composite composite) {
        ((Graphics2D)this.n).setComposite(composite);
    }

    @Override
    public void setPaint(Paint paint) {
        ((Graphics2D)this.n).setPaint(paint);
    }

    @Override
    public void setStroke(Stroke stroke) {
        ((Graphics2D)this.n).setStroke(stroke);
    }

    @Override
    public void setRenderingHint(RenderingHints.Key key, Object object) {
        ((Graphics2D)this.n).setRenderingHint(key, object);
    }

    @Override
    public Object getRenderingHint(RenderingHints.Key key) {
        return ((Graphics2D)this.n).getRenderingHint(key);
    }

    public void setRenderingHints(Map map) {
        ((Graphics2D)this.n).setRenderingHints(map);
    }

    public void addRenderingHints(Map map) {
        ((Graphics2D)this.n).addRenderingHints(map);
    }

    @Override
    public RenderingHints getRenderingHints() {
        return ((Graphics2D)this.n).getRenderingHints();
    }

    @Override
    public void translate(int n10, int n11) {
        ((Graphics2D)this.n).translate(n10, n11);
    }

    @Override
    public void translate(double d2, double d3) {
        ((Graphics2D)this.n).translate(d2, d3);
    }

    @Override
    public void rotate(double d2) {
        ((Graphics2D)this.n).rotate(d2);
    }

    @Override
    public void rotate(double d2, double d3, double d4) {
        ((Graphics2D)this.n).rotate(d2, d3, d4);
    }

    @Override
    public void scale(double d2, double d3) {
        ((Graphics2D)this.n).scale(d2, d3);
    }

    @Override
    public void shear(double d2, double d3) {
        ((Graphics2D)this.n).shear(d2, d3);
    }

    @Override
    public void transform(AffineTransform affineTransform) {
        ((Graphics2D)this.n).transform(affineTransform);
    }

    @Override
    public void setTransform(AffineTransform affineTransform) {
        ((Graphics2D)this.n).setTransform(affineTransform);
    }

    @Override
    public AffineTransform getTransform() {
        return ((Graphics2D)this.n).getTransform();
    }

    @Override
    public Paint getPaint() {
        return ((Graphics2D)this.n).getPaint();
    }

    @Override
    public Composite getComposite() {
        return ((Graphics2D)this.n).getComposite();
    }

    @Override
    public void setBackground(Color color) {
        ((Graphics2D)this.n).setBackground(color);
    }

    @Override
    public Color getBackground() {
        return ((Graphics2D)this.n).getBackground();
    }

    @Override
    public Stroke getStroke() {
        return ((Graphics2D)this.n).getStroke();
    }

    @Override
    public void clip(Shape shape) {
        ((Graphics2D)this.n).clip(shape);
    }

    @Override
    public FontRenderContext getFontRenderContext() {
        return ((Graphics2D)this.n).getFontRenderContext();
    }
}

