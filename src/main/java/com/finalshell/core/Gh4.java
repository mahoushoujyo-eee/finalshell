package com.finalshell.core;

import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Float;
import java.awt.image.BufferedImage;

public class Gh4 extends Gy4 {
   public float b = 0.0F;
   public float i = 0.0F;
   public float H = 0.5F;
   public float p = 0.5F;
   public int V;
   public float B;
   public float T;
   public float u;
   public static String a;
   public static long c;

   public Gh4() {
      this.V = (int)c;
      this.B = 0.0F;
      this.Y(1);
   }

   public void y(int var1) {
      this.V = var1;
   }

   public int W() {
      return this.V;
   }

   public void e(float var1) {
      this.b = var1;
   }

   public float l() {
      return this.b;
   }

   public void H(float var1) {
      this.i = var1;
   }

   public float j() {
      return this.i;
   }

   public void l(float var1) {
      this.H = var1;
   }

   public float L() {
      return this.H;
   }

   public void U(float var1) {
      this.p = var1;
   }

   public float t() {
      return this.p;
   }

   public void s(Point2D var1) {
      this.H = (float)var1.getX();
      this.p = (float)var1.getY();
   }

   public Point2D O() {
      return new Float(this.H, this.p);
   }

   public void m(float var1) {
      this.B = var1;
   }

   public float M() {
      return this.B;
   }

   @Override
   public BufferedImage filter(BufferedImage var1, BufferedImage var2) {
      this.T = (float)var1.getWidth() * this.H;
      this.u = (float)var1.getHeight() * this.p;
      return super.filter(var1, var2);
   }

   @Override
   protected void h(int var1, int var2, float[] var3) {
      double var5 = (double)((float)var1 - this.T);
      double var7 = (double)((float)var2 - this.u);
      String[] var10000 = W5.q();
      double var9 = Math.sqrt(var5 * var5 + var7 * var7);
      String[] var4 = var10000;
      double var11 = Math.atan2(var7, var5) - (double)this.b - (double)this.i;
      var11 = (double)NM.l((float)(var11 / Math.PI * (double)this.V * 0.5));
      if (var4 != null) {
         if (this.B != 0.0F) {
            double var13 = Math.cos(var11);
            double var15 = (double)this.B / var13;
            var9 = var15 * (double)NM.l((float)(var9 / var15));
         }

         var11 += (double)this.b;
         var3[0] = (float)((double)this.T + var9 * Math.cos(var11));
         var3[1] = (float)((double)this.u + var9 * Math.sin(var11));
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
      char[] var10003 = "N_\u000f\u001e\f4e%}\u001d\u0006\u0006/ueE\u001f\u0005\u0013#?$\u0018".toCharArray();
      int var10004 = var10003.length;
      int var2 = 0;
      byte var13 = 40;
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
         var10007 = 40;
         var10006 = var10008;
         switch (var2 % 7) {
            case 0:
               var21 = 34;
               break;
            case 1:
               var21 = 30;
               break;
            case 2:
               var21 = 84;
               break;
            case 3:
               var21 = 66;
               break;
            case 4:
               var21 = 75;
               break;
            case 5:
               var21 = 110;
               break;
            default:
               var21 = 57;
         }
      } else {
         var13 = 40;
         var4 = var10004;
         if (var10004 <= var2) {
            String var16 = new String(var10003).intern();
            byte var8 = -1;
            a = var16;
            long var3 = 6287151486166661281L;
            long var12 = 6655859524991744162L ^ var3;
            var8 = -1;
            c = var12;
            return;
         }

         var17 = var10003;
         var10005 = var2;
         char var22 = var10003[var2];
         var10007 = 40;
         var10006 = var22;
         switch (var2 % 7) {
            case 0:
               var21 = 34;
               break;
            case 1:
               var21 = 30;
               break;
            case 2:
               var21 = 84;
               break;
            case 3:
               var21 = 66;
               break;
            case 4:
               var21 = 75;
               break;
            case 5:
               var21 = 110;
               break;
            default:
               var21 = 57;
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
                  var21 = 34;
                  break;
               case 1:
                  var21 = 30;
                  break;
               case 2:
                  var21 = 84;
                  break;
               case 3:
                  var21 = 66;
                  break;
               case 4:
                  var21 = 75;
                  break;
               case 5:
                  var21 = 110;
                  break;
               default:
                  var21 = 57;
            }
         } else {
            if (var4 <= var2) {
               String var15 = new String(var10002).intern();
               byte var6 = -1;
               a = var15;
               long var0 = 6287151486166661281L;
               long var11 = 6655859524991744162L ^ var0;
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
                  var21 = 34;
                  break;
               case 1:
                  var21 = 30;
                  break;
               case 2:
                  var21 = 84;
                  break;
               case 3:
                  var21 = 66;
                  break;
               case 4:
                  var21 = 75;
                  break;
               case 5:
                  var21 = 110;
                  break;
               default:
                  var21 = 57;
            }
         }
      }
   }
}





