package com.finalshell.core;

import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Float;
import java.awt.image.BufferedImage;

public class Gw4 extends Gy4 {
   public float j = 16.0F;
   public float l = 10.0F;
   public float R = 0.0F;
   public float w = 0.5F;
   public float N = 0.5F;
   public float T = 50.0F;
   public float B = 0.0F;
   public float s;
   public float I;
   public static String a;

   public Gw4() {
      this.Y(1);
   }

   public void f(float var1) {
      this.j = var1;
   }

   public float k() {
      return this.j;
   }

   public void D(float var1) {
      this.l = var1;
   }

   public float q() {
      return this.l;
   }

   public void x(float var1) {
      this.R = var1;
   }

   public float u() {
      return this.R;
   }

   public void K(float var1) {
      this.w = var1;
   }

   public float G() {
      return this.w;
   }

   public void F(float var1) {
      this.N = var1;
   }

   public float m() {
      return this.N;
   }

   public void B(Point2D var1) {
      this.w = (float)var1.getX();
      this.N = (float)var1.getY();
   }

   public Point2D b() {
      return new Float(this.w, this.N);
   }

   public void V(float var1) {
      this.T = var1;
   }

   public float g() {
      return this.T;
   }

   public boolean M(int var1, int var2, int var3) {
      String[] var4 = W5.q();
      int var10000 = var2;
      int var10001 = var1;
      if (var4 != null) {
         if (var2 > var1) {
            return 0 != 0;
         }

         var10000 = var1;
         if (var4 == null) {
            return var1 != 0;
         }

         var10001 = var3;
      }

      return ((var10000 <= var10001 ? 1 : 0) != 0);
   }

   @Override
   public BufferedImage filter(BufferedImage var1, BufferedImage var2) {
      String[] var10000 = W5.q();
      this.s = (float)var1.getWidth() * this.w;
      String[] var3 = var10000;
      this.I = (float)var1.getHeight() * this.N;
      Gw4 var4 = this;
      if (var3 != null) {
         if (this.T == 0.0F) {
            this.T = Math.min(this.s, this.I);
         }

         this.B = this.T * this.T;
         var4 = this;
      }

      return var4.filter(var1, var2);
   }

   @Override
   public void h(int var1, int var2, float[] var3) {
      float var5 = (float)var1 - this.s;
      String[] var10000 = W5.q();
      float var6 = (float)var2 - this.I;
      String[] var4 = var10000;
      float var7 = var5 * var5 + var6 * var6;
      float var11 = var7;
      if (var4 != null) {
         if (var7 > this.B) {
            var3[0] = (float)var1;
            var3[1] = (float)var2;
            if (var4 != null) {
               return;
            }
         }

         var11 = (float)Math.sqrt((double)var7);
      }

      float var8 = var11;
      float var9 = this.l * (float)Math.sin((double)(var8 / this.j * (float) (Math.PI * 2) - this.R));
      var9 *= (this.T - var8) / this.T;
      if (var4 != null) {
         if (var8 != 0.0F) {
            var9 *= this.j / var8;
         }

         var3[0] = (float)var1 + var5 * var9;
      }

      var3[1] = (float)var2 + var6 * var9;
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
      char[] var10003 = "g5H<t\u0004^\f\u000bZ<~\u0004\nq5K8w\u0013Y\rr\u0015".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 120;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 120;
         var10006 = var0;
      } else {
         var6 = 120;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 120;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 91;
               break;
            case 1:
               var23 = 36;
               break;
            case 2:
               var23 = 67;
               break;
            case 3:
               var23 = 48;
               break;
            case 4:
               var23 = 99;
               break;
            case 5:
               var23 = 14;
               break;
            default:
               var23 = 82;
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





