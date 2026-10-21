package com.finalshell.core;

import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Float;

public class HR3 extends HN3 {
   public int h;
   public float k;
   public float e;
   public float v;
   public float W;
   public int t;
   public int F;
   public int U;
   public float C;
   public float Y;
   public float r;
   public float s;
   public float b;
   public float X;
   public float V;
   public float P;
   public float p;
   public float B;
   public static String a;
   public static long c;

   public HR3() {
      this.h = (int)c;
      this.e = 1.0F;
      this.v = 0.2F;
      this.W = 0.1F;
      this.t = -1;
      this.C = 0.5F;
      this.Y = 0.5F;
      this.r = 1.6F;
      this.s = 0.03F;
      this.b = 0.006F;
      this.X = 0.5F;
      this.V = 6.0F;
      this.f(50.0F);
   }

   public void k(int var1) {
      this.t = var1;
   }

   public int M() {
      return this.t;
   }

   public void P(float var1) {
      this.r = var1;
   }

   public float J() {
      return this.r;
   }

   public void D(float var1) {
      this.e = var1;
   }

   public float s() {
      return this.e;
   }

   public void V(float var1) {
      this.v = var1;
   }

   public float V() {
      return this.v;
   }

   public void s(float var1) {
      this.W = var1;
   }

   public float U() {
      return this.W;
   }

   public void F(Point2D var1) {
      this.C = (float)var1.getX();
      this.Y = (float)var1.getY();
   }

   public Point2D h() {
      return new Float(this.C, this.Y);
   }

   public void f(float var1) {
      this.k = var1;
      this.P = var1 / 3.0F;
   }

   public float P() {
      return this.k;
   }

   @Override
   public void C(int var1, int var2) {
      this.F = var1;
      this.U = var2;
      this.p = this.C * (float)var1;
      this.B = this.Y * (float)var2;
      super.C(var1, var2);
   }

   @Override
   public int C(int var1, int var2, int var3) {
      float var5;
      float var6;
      float var7;
      float var9;
      float var12;
      label35: {
         float var23;
         float var10001;
         label34: {
            label33: {
               String[] var4;
               label37: {
                  var5 = (float)var1 - this.p;
                  var6 = (float)var2 - this.B;
                  String[] var10000 = W5.q();
                  var7 = (float)Math.sqrt((double)(var5 * var5 + var6 * var6));
                  var12 = (float)Math.exp((double)(-var7 * var7 * this.b)) * this.X + (float)Math.exp((double)(-var7 * this.s)) * (1.0F - this.X);
                  var12 *= this.e;
                  var4 = var10000;
                  float var24;
                  int var21 = (var24 = var7 - (this.k + this.r)) == 0.0F ? 0 : (var24 < 0.0F ? -1 : 1);
                  if (var4 != null) {
                     if (var21 > 0) {
                        var12 = NM.J((var7 - (this.k + this.r)) / this.V, var12, 0.0F);
                     }

                     var23 = var7;
                     if (var4 == null) {
                        break label37;
                     }

                     float var25;
                     var21 = (var25 = var7 - (this.k - this.r)) == 0.0F ? 0 : (var25 < 0.0F ? -1 : 1);
                  }

                  if (var21 >= 0) {
                     var23 = var7;
                     var10001 = this.k + this.r;
                     if (var4 == null) {
                        break label34;
                     }

                     if (!(var7 > var10001)) {
                        break label33;
                     }
                  }

                  var23 = 0.0F;
               }

               var9 = var23;
               if (var4 != null) {
                  break label35;
               }
            }

            var23 = Math.abs(var7 - this.k);
            var10001 = this.r;
         }

         var9 = var23 / var10001;
         var9 = 1.0F - var9 * var9 * (3.0F - 2.0F * var9);
         var9 *= this.v;
      }

      var12 += var9;
      float var10 = (float)Math.atan2((double)var5, (double)var6) + (float) Math.PI;
      var10 = (NM.i(var10 / (float) Math.PI * 17.0F + 1.0F + UZ.x(var10 * 10.0F), 1.0F) - 0.5F) * 2.0F;
      var10 = Math.abs(var10);
      var10 = (float)Math.pow((double)var10, 5.0);
      float var11 = this.W * var10 / (1.0F + var7 * 0.1F);
      var12 += var11;
      var12 = NM.X(var12, 0.0F, 1.0F);
      return NM.n(var12, var3, this.t);
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
      char[] var10003 = "#\n; \u001a?X_8.-\u0001 \u0013^P".toCharArray();
      int var10004 = var10003.length;
      int var2 = 0;
      byte var13 = 39;
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
         var10007 = 39;
         var10006 = var10008;
         switch (var2 % 7) {
            case 0:
               var21 = 87;
               break;
            case 1:
               var21 = 89;
               break;
            case 2:
               var21 = 101;
               break;
            case 3:
               var21 = 107;
               break;
            case 4:
               var21 = 84;
               break;
            case 5:
               var21 = 98;
               break;
            default:
               var21 = 26;
         }
      } else {
         var13 = 39;
         var4 = var10004;
         if (var10004 <= var2) {
            String var16 = new String(var10003).intern();
            byte var8 = -1;
            a = var16;
            long var3 = 2128575396354611125L;
            long var12 = 7460620979003873159L ^ var3;
            var8 = -1;
            c = var12;
            return;
         }

         var17 = var10003;
         var10005 = var2;
         char var22 = var10003[var2];
         var10007 = 39;
         var10006 = var22;
         switch (var2 % 7) {
            case 0:
               var21 = 87;
               break;
            case 1:
               var21 = 89;
               break;
            case 2:
               var21 = 101;
               break;
            case 3:
               var21 = 107;
               break;
            case 4:
               var21 = 84;
               break;
            case 5:
               var21 = 98;
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
                  var21 = 87;
                  break;
               case 1:
                  var21 = 89;
                  break;
               case 2:
                  var21 = 101;
                  break;
               case 3:
                  var21 = 107;
                  break;
               case 4:
                  var21 = 84;
                  break;
               case 5:
                  var21 = 98;
                  break;
               default:
                  var21 = 26;
            }
         } else {
            if (var4 <= var2) {
               String var15 = new String(var10002).intern();
               byte var6 = -1;
               a = var15;
               long var0 = 2128575396354611125L;
               long var11 = 7460620979003873159L ^ var0;
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
                  var21 = 87;
                  break;
               case 1:
                  var21 = 89;
                  break;
               case 2:
                  var21 = 101;
                  break;
               case 3:
                  var21 = 107;
                  break;
               case 4:
                  var21 = 84;
                  break;
               case 5:
                  var21 = 98;
                  break;
               default:
                  var21 = 26;
            }
         }
      }
   }
}





