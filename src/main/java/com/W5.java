package com;

import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Point2D.Double;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ColorModel;

public abstract class W5 implements BufferedImageOp, Cloneable {
   private static String[] q;

   @Override
   public BufferedImage createCompatibleDestImage(BufferedImage var1, ColorModel var2) {
      String[] var3 = q();
      ColorModel var10000 = var2;
      if (var3 != null) {
         if (var2 != null) {
            return new BufferedImage(var2, var2.createCompatibleWritableRaster(var1.getWidth(), var1.getHeight()), var2.isAlphaPremultiplied(), null);
         }

         var10000 = var1.getColorModel();
      }

      var2 = var10000;
      return new BufferedImage(var2, var2.createCompatibleWritableRaster(var1.getWidth(), var1.getHeight()), var2.isAlphaPremultiplied(), null);
   }

   @Override
   public Rectangle2D getBounds2D(BufferedImage var1) {
      return new Rectangle(0, 0, var1.getWidth(), var1.getHeight());
   }

   @Override
   public Point2D getPoint2D(Point2D var1, Point2D var2) {
      String[] var3 = q();
      Object var10000 = var2;
      if (var3 != null) {
         if (var2 == null) {
            var2 = new Double();
         }

         var2.setLocation(var1.getX(), var1.getY());
         var10000 = var2;
      }

      return (Point2D)var10000;
   }

   @Override
   public RenderingHints getRenderingHints() {
      return null;
   }

   public int[] l(BufferedImage var1, int var2, int var3, int var4, int var5, int[] var6) {
      String[] var10000 = q();
      int var8 = var1.getType();
      String[] var7 = var10000;
      int var9 = var8;
      byte var10001 = 2;
      if (var7 != null) {
         if (var8 == 2) {
            return (int[])var1.getRaster().getDataElements(var2, var3, var4, var5, var6);
         }

         var9 = var8;
         var10001 = 1;
      }

      return var9 != var10001 ? var1.getRGB(var2, var3, var4, var5, var6, 0, var4) : (int[])var1.getRaster().getDataElements(var2, var3, var4, var5, var6);
   }

   public void E(BufferedImage var1, int var2, int var3, int var4, int var5, int[] var6) {
      label18: {
         String[] var10000 = q();
         int var8 = var1.getType();
         String[] var7 = var10000;
         if (var7 != null) {
            if (var8 != 2 && var8 != 1) {
               break label18;
            }

            var1.getRaster().setDataElements(var2, var3, var4, var5, var6);
         }

         if (var7 != null) {
            return;
         }
      }

      var1.setRGB(var2, var3, var4, var5, var6, 0, var4);
   }

   @Override
   public Object clone() {
      try {
         return super.clone();
      } catch (CloneNotSupportedException var2) {
         return null;
      }
   }

   public static void b(String[] var0) {
      q = var0;
   }

   public static String[] q() {
      return q;
   }

   static {
      if (q() == null) {
         b(new String[3]);
      }
   }
}





