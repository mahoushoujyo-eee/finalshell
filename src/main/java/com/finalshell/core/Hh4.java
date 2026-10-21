package com.finalshell.core;

import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Float;
import java.awt.image.BufferedImage;

public class Hh4 extends W5 {
   public float i = 0.5F;
   public float Y = 0.5F;
   public float D;
   public float G;
   public float n;
   public float M;
   public static String a;

   public Hh4() {
   }

   public Hh4(float var1, float var2, float var3, float var4) {
      this.D = var1;
      this.G = var2;
      this.n = var3;
      this.M = var4;
   }

   public void A(float var1) {
      this.G = var1;
   }

   public float Q() {
      return this.G;
   }

   public void x(float var1) {
      this.D = var1;
   }

   public float L() {
      return this.D;
   }

   public void p(float var1) {
      this.n = var1;
   }

   public float T() {
      return this.n;
   }

   public void Y(float var1) {
      this.M = var1;
   }

   public float x() {
      return this.M;
   }

   public void N(float var1) {
      this.i = var1;
   }

   public float z() {
      return this.i;
   }

   public void D(float var1) {
      this.Y = var1;
   }

   public float i() {
      return this.Y;
   }

   public void i(Point2D var1) {
      this.i = (float)var1.getX();
      this.Y = (float)var1.getY();
   }

   public Point2D f() {
      return new Float(this.i, this.Y);
   }

   public int K(int var1) {
      String[] var10000 = W5.q();
      int var3 = 1;
      String[] var2 = var10000;
      int var4 = 0;

      while (true) {
         if (var3 < var1) {
            var5 = var3 * 2;
            if (var2 == null) {
               break;
            }

            var3 = var5;
            var4++;
            if (var2 != null) {
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
      String[] var3 = W5.q();
      BufferedImage var10000 = var2;
      if (var3 != null) {
         if (var2 == null) {
            var2 = this.createCompatibleDestImage(var1, null);
         }

         var10000 = var1;
      }

      BufferedImage var4 = var10000;
      float var5 = (float)var1.getWidth() * this.i;
      float var6 = (float)var1.getHeight() * this.Y;
      float var7 = (float)Math.sqrt((double)(var5 * var5 + var6 * var6));
      float var8 = (float)((double)this.D * Math.cos((double)this.G));
      float var9 = (float)((double)this.D * -Math.sin((double)this.G));
      float var10 = this.M;
      float var11 = this.n;
      float var12 = this.D + Math.abs(this.n * var7) + this.M * var7;
      int var13 = this.K((int)var12);
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
               if (var3 == null) {
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
               int var24 = (var25 = this.n - 0.0F) == 0.0F ? 0 : (var25 < 0.0F ? -1 : 1);
               if (var3 != null) {
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
               if (var3 != null) {
                  continue;
               }
            }

            var10000 = var2;
            break;
         }

         return var10000;
      }
   }

   @Override
   public String toString() {
      return a;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "~T1\u001a501OL!\u001a:;?HQ+\u0006:4<IJjF4".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 50;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 50;
         var10006 = var0;
      } else {
         var6 = 50;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 50;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 14;
               break;
            case 1:
               var23 = 10;
               break;
            case 2:
               var23 = 118;
               break;
            case 3:
               var23 = 90;
               break;
            case 4:
               var23 = 40;
               break;
            case 5:
               var23 = 68;
               break;
            default:
               var23 = 98;
         }

         var10005[var10006] = (char)(var22 ^ var10 ^ var23);
         var0++;
         if (var6 == 0) {
            var10006 = var6;
            var10005 = var10002;
            var10 = var6;
         } else {
            if (var1 <= var0) {
               String var8 = new String(var10002).intern();
               byte var3 = -1;
               a = var8;
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}






