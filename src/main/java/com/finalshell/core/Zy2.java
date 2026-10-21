package com.finalshell.core;

import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Float;
import java.awt.image.BufferedImage;

public class Zy2 extends ZH {
   public float o;
   public float s;
   public float R;
   public float b;
   public float c;
   public float q;

   public Zy2() {
      this(0.0F, 0.0F, 0.0F, 0.0F);
   }

   public Zy2(float var1, float var2, float var3, float var4) {
      this(var1, var2, var3, var4, 0.5F, 0.5F);
   }

   public Zy2(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.R = var1;
      this.b = var2;
      this.c = var3;
      this.q = var4;
      this.o = var5;
      this.s = var6;
   }

   public void H(float var1) {
      this.b = var1;
   }

   public float g() {
      return this.b;
   }

   public void a(float var1) {
      this.R = var1;
   }

   public float E() {
      return this.R;
   }

   public void B(float var1) {
      this.c = var1;
   }

   public float R() {
      return this.c;
   }

   public void f(float var1) {
      this.q = var1;
   }

   public float j() {
      return this.q;
   }

   public void d(float var1) {
      this.o = var1;
   }

   public float Y() {
      return this.o;
   }

   public void S(float var1) {
      this.s = var1;
   }

   public float P() {
      return this.s;
   }

   public void a(Point2D var1) {
      this.o = (float)var1.getX();
      this.s = (float)var1.getY();
   }

   public Point2D m() {
      return new Float(this.o, this.s);
   }

   public int w(int var1) {
      String[] var10000 = ZH.U();
      int var3 = 1;
      String[] var2 = var10000;
      int var4 = 0;

      while (true) {
         if (var3 < var1) {
            var5 = var3 * 2;
            if (var2 != null) {
               break;
            }

            var3 = var5;
            var4++;
            if (var2 == null) {
      int var5;
      int var5;
               continue;
            }
         }

         var5 = var4;
         break;
      }

      return var5;
   }

   @Override
   public BufferedImage filter(BufferedImage var1, BufferedImage var2) {
      String[] var3 = ZH.U();
      BufferedImage var10000 = var2;
      if (var3 == null) {
         if (var2 == null) {
            var2 = this.createCompatibleDestImage(var1, null);
         }

         var10000 = var1;
      }

      BufferedImage var4 = var10000;
      float var5 = (float)var1.getWidth() * this.o;
      float var6 = (float)var1.getHeight() * this.s;
      float var7 = (float)Math.sqrt((double)(var5 * var5 + var6 * var6));
      float var8 = (float)((double)this.R * Math.cos((double)this.b));
      float var9 = (float)((double)this.R * -Math.sin((double)this.b));
      float var10 = this.q;
      float var11 = this.c;
      float var12 = this.R + Math.abs(this.c * var7) + this.q * var7;
      int var13 = this.w((int)var12);
      var8 /= var12;
      var9 /= var12;
      var10 /= var12;
      var11 /= var12;
      if (var13 == 0) {
         Graphics2D var22 = var2.createGraphics();
         var22.drawRenderedImage(var1, null);
         var22.dispose();
         return var2;
      } else {
         BufferedImage var14 = this.createCompatibleDestImage(var1, null);
         int var15 = 0;

         while (true) {
            if (var15 < var13) {
               var10000 = var14;
               if (var3 != null) {
                  break;
               }

               Graphics2D var16 = var14.createGraphics();
               var16.drawImage(var4, null, null);
               var16.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
               var16.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
               var16.setComposite(AlphaComposite.getInstance(3, 0.5F));
               var16.translate((double)(var5 + var8), (double)(var6 + var9));
               var16.scale(1.0001 + (double)var10, 1.0001 + (double)var10);
               float var25;
               int var24 = (var25 = this.c - 0.0F) == 0.0F ? 0 : (var25 < 0.0F ? -1 : 1);
               if (var3 == null) {
                  if (var24) {
                     var16.rotate((double)var11);
                  }

                  var16.translate((double)(-var5), (double)(-var6));
                  var16.drawImage(var2, null, null);
               }

               var16.dispose();
               BufferedImage var17 = var2;
               var2 = var14;
               var14 = var17;
               var4 = var2;
               var8 *= 2.0F;
               var9 *= 2.0F;
               var10 *= 2.0F;
               var11 *= 2.0F;
               var15++;
               if (var3 == null) {
                  continue;
               }
            }

            var10000 = var2;
            break;
         }

         return var10000;
      }
   }
}






