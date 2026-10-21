package com.finalshell.core;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Float;
import java.awt.image.BufferedImage;
import java.util.Random;

public class GH3 extends W5 {
   public float b = 0.5F;
   public float B = 0.5F;
   public float P;
   public float V;
   public float u;
   public float T;
   public float i = 1.0F;
   public float W = 1.0F;
   public int e;
   public int z;
   public static String a;
   public static long c;

   public GH3() {
      this.e = (int)c;
   }

   public void P(float var1) {
      this.V = var1;
   }

   public float Y() {
      return this.V;
   }

   public void N(float var1) {
      this.P = var1;
   }

   public float V() {
      return this.P;
   }

   public void i(float var1) {
      this.u = var1;
   }

   public float p() {
      return this.u;
   }

   public void M(float var1) {
      this.T = var1;
   }

   public float c() {
      return this.T;
   }

   public void R(float var1) {
      this.i = var1;
   }

   public float D() {
      return this.i;
   }

   public void F(float var1) {
      this.W = var1;
   }

   public float C() {
      return this.W;
   }

   public void z(float var1) {
      this.b = var1;
   }

   public float A$float() {
      return this.b;
   }

   public void f(float var1) {
      this.B = var1;
   }

   public float B() {
      return this.B;
   }

   public void Y(Point2D var1) {
      this.b = (float)var1.getX();
      this.B = (float)var1.getY();
   }

   public Point2D n$Point2D() {
      return new Float(this.b, this.B);
   }

   public void Y(int var1) {
      this.e = var1;
   }

   public int A$int() {
      return this.e;
   }

   public void G(int var1) {
      this.z = var1;
   }

   public int n$int() {
      return this.z;
   }

   @Override
   public BufferedImage filter(BufferedImage var1, BufferedImage var2) {
      int var37;
      String[] var3 = W5.q();
      BufferedImage var10000 = var2;
      if (var3 != null) {
         if (var2 == null) {
            var2 = this.createCompatibleDestImage(var1, null);
         }

         var10000 = var1;
      }

      float var4 = (float)var10000.getWidth();
      float var5 = (float)var1.getHeight();
      float var6 = (float)var1.getWidth() * this.b;
      float var7 = (float)var1.getHeight() * this.B;
      float var8 = (float)Math.sqrt((double)(var6 * var6 + var7 * var7));
      int var9 = this.e * this.e;
      W12[] var10 = new W12[var9];
      float[] var11 = new float[var9];
      float[] var12 = new float[var9];
      float[] var13 = new float[var9];
      Graphics2D var14 = var2.createGraphics();
      Random var15 = new Random(0L);
      float var16 = 0.0F;
      float var17 = 0.0F;
      int var18 = 0;

      while (true) {
         if (var18 < this.e) {
            int var19 = (int)var5 * var18 / this.e;
            int var20 = (int)var5 * (var18 + 1) / this.e;
            var37 = 0;
            if (var3 == null) {
               break;
            }

            int var21 = 0;

            label49: {
               while (var21 < this.e) {
                  int var22 = var18 * this.e + var21;
                  int var23 = (int)var4 * var21 / this.e;
                  int var24 = (int)var4 * (var21 + 1) / this.e;
                  var11[var22] = (float)this.z * var15.nextFloat();
                  var12[var22] = (float)this.z * var15.nextFloat();
                  var11[var22] = 0.0F;
                  var12[var22] = 0.0F;
                  var13[var22] = (float)this.z * (2.0F * var15.nextFloat() - 1.0F);
                  Rectangle var25 = new Rectangle(var23, var19, var24 - var23, var20 - var19);
                  var10[var22] = new W12();
                  var10[var22].e = var25;
                  var10[var22].i = (float)(var23 + var24) * 0.5F;
                  var10[var22].H = (float)(var19 + var20) * 0.5F;
                  var10[var22].p = var4 - (var6 - (float)var21);
                  var10[var22].I = var5 - (var7 - (float)var18);
                  var10[var22].u = (float)(var24 - var23);
                  var10[var22].Q = (float)(var20 - var19);
                  var21++;
                  if (var3 == null) {
                     break label49;
                  }

                  if (var3 == null) {
                     break;
                  }
               }

               var18++;
            }

            if (var3 != null) {
               continue;
            }
         }

         var37 = 0;
         break;
      }

      var18 = var37;

      while (true) {
         if (var18 < var9) {
            float var29 = (float)var18 / (float)var9;
            double var30 = (double)(var29 * 2.0F) * Math.PI;
            float var31 = this.V * var4 * (float)Math.cos(var30);
            float var33 = this.V * var5 * (float)Math.sin(var30);
            W12 var35 = var10[var18];
            Rectangle var36 = var35.e.getBounds();
            AffineTransform var26 = var14.getTransform();
            var31 = var35.i + this.V * var35.p;
            var33 = var35.H + this.V * var35.I;
            var14.translate((double)var31, (double)var33);
            var14.rotate((double)(this.V * var13[var18]));
            var14.setColor(Color.getHSBColor(var29, 1.0F, 1.0F));
            Shape var27 = var14.getClip();
            var14.clip(var35.e);
            var14.drawImage(var1, 0, 0, null);
            var14.setClip(var27);
            var14.setTransform(var26);
            var18++;
            if (var3 == null) {
               break;
            }

            if (var3 != null) {
               continue;
            }
         }

         var14.dispose();
         break;
      }

      return var2;
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
      char[] var10003 = "dq9D#!{Yl6\u0005\u0003 nDw=X~f!".toCharArray();
      int var10004 = var10003.length;
      int var2 = 0;
      byte var13 = 21;
      char[] var10002 = var10003;
      int var4 = var10004;
      char[] var17;
      byte var21;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var17 = var10003;
         var10005 = var2;
         char var10008 = var10003[var2];
         var10007 = 21;
         var10006 = var10008;
         switch (var2 % 7) {
            case 0:
               var21 = 37;
               break;
            case 1:
               var21 = 22;
               break;
            case 2:
               var21 = 77;
               break;
            case 3:
               var21 = 63;
               break;
            case 4:
               var21 = 69;
               break;
            case 5:
               var21 = 93;
               break;
            default:
               var21 = 26;
         }
      } else {
         var13 = 21;
         var4 = var10004;
         if (var10004 <= var2) {
            String var16 = new String(var10003).intern();
            byte var8 = -1;
            a = var16;
            long var3 = 8260201356131734083L;
            long var12 = 7862618368139760198L ^ var3;
            var8 = -1;
            c = var12;
            return;
         }

         var17 = var10003;
         var10005 = var2;
         char var22 = var10003[var2];
         var10007 = 21;
         var10006 = var22;
         switch (var2 % 7) {
            case 0:
               var21 = 37;
               break;
            case 1:
               var21 = 22;
               break;
            case 2:
               var21 = 77;
               break;
            case 3:
               var21 = 63;
               break;
            case 4:
               var21 = 69;
               break;
            case 5:
               var21 = 93;
               break;
            default:
               var21 = 26;
         }
      }

      while (true) {
         var17[var10005] = (char)(var10006 ^ var10007 ^ var21);
         var2++;
         if (var13 == 0) {
            var17 = var10002;
            var10005 = var13;
            char var24 = var10002[var13];
            var10007 = var13;
            var10006 = var24;
            switch (var2 % 7) {
               case 0:
                  var21 = 37;
                  break;
               case 1:
                  var21 = 22;
                  break;
               case 2:
                  var21 = 77;
                  break;
               case 3:
                  var21 = 63;
                  break;
               case 4:
                  var21 = 69;
                  break;
               case 5:
                  var21 = 93;
                  break;
               default:
                  var21 = 26;
            }
         } else {
            if (var4 <= var2) {
               String var15 = new String(var10002).intern();
               byte var6 = -1;
               a = var15;
               long var0 = 8260201356131734083L;
               long var11 = 7862618368139760198L ^ var0;
               var6 = -1;
               c = var11;
               return;
            }

            var17 = var10002;
            var10005 = var2;
            char var23 = var10002[var2];
            var10007 = var13;
            var10006 = var23;
            switch (var2 % 7) {
               case 0:
                  var21 = 37;
                  break;
               case 1:
                  var21 = 22;
                  break;
               case 2:
                  var21 = 77;
                  break;
               case 3:
                  var21 = 63;
                  break;
               case 4:
                  var21 = 69;
                  break;
               case 5:
                  var21 = 93;
                  break;
               default:
                  var21 = 26;
            }
         }
      }
   }
}





