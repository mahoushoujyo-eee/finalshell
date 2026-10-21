package com.finalshell.core;

import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Float;
import java.awt.image.BufferedImage;

public class G42 extends Gy4 {
   public float h = 0.0F;
   public float l = 0.5F;
   public float p = 0.5F;
   public float o = 100.0F;
   public float m = 0.5F;
   public float v = 0.0F;
   public float a;
   public float J;
   public float E;
   public float y;
   public static String b;

   public void G(float var1) {
      this.h = var1;
   }

   public float p() {
      return this.h;
   }

   public void w(float var1) {
      this.l = var1;
   }

   public float K() {
      return this.l;
   }

   public void s(float var1) {
      this.p = var1;
   }

   public float s() {
      return this.p;
   }

   public void o(Point2D var1) {
      this.l = (float)var1.getX();
      this.p = (float)var1.getY();
   }

   public Point2D E() {
      return new Float(this.l, this.p);
   }

   public void n(float var1) {
      this.o = var1;
   }

   public float d() {
      return this.o;
   }

   public void T(float var1) {
      this.m = var1;
   }

   public float z() {
      return this.m;
   }

   @Override
   public BufferedImage filter(BufferedImage var1, BufferedImage var2) {
      String[] var10000 = W5.q();
      this.E = (float)var1.getWidth();
      String[] var3 = var10000;
      this.y = (float)var1.getHeight();
      this.a = this.E * this.l;
      this.J = this.y * this.p;
      G42 var4 = this;
      if (var3 != null) {
         if (this.o == 0.0F) {
            this.o = Math.min(this.a, this.J);
         }

         this.v = this.o * this.o;
         var4 = this;
      }

      return var4.filter(var1, var2);
   }

   @Override
   protected void h(int var1, int var2, float[] var3) {
      float var5;
      float var6;
      float var16;
      float var10001;
      label24: {
         float var7;
         label23: {
            String[] var10000 = W5.q();
            var5 = (float)var1 - this.a;
            var6 = (float)var2 - this.J;
            var7 = var5 * var5 + var6 * var6;
            String[] var4 = var10000;
            if (var4 != null) {
               if (!(var7 > this.v)) {
                  var16 = var7;
                  var10001 = 0.0F;
                  if (var4 == null) {
                     break label24;
                  }

                  if (var7 != 0.0F) {
                     break label23;
                  }
               }

               var3[0] = (float)var1;
               var3[1] = (float)var2;
            }

            if (var4 != null) {
               return;
            }
         }

         var16 = var7;
         var10001 = this.v;
      }

      float var8 = (float)Math.sqrt((double)(var16 / var10001));
      float var9 = (float)Math.pow(Math.sin((Math.PI / 2) * (double)var8), (double)(-this.m));
      var5 *= var9;
      var6 *= var9;
      float var10 = 1.0F - var8;
      float var11 = this.h * var10 * var10;
      float var12 = (float)Math.sin((double)var11);
      float var13 = (float)Math.cos((double)var11);
      var3[0] = this.a + var13 * var5 - var12 * var6;
      var3[1] = this.J + var12 * var5 + var13 * var6;
   }

   @Override
   public String toString() {
      return b;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "oQ$\u0017w\u0002*\u0004h>\r{\u0018p\u0005\u0016".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 71;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 71;
         var10006 = var0;
      } else {
         var6 = 71;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            b = var9;
            return;
         }

         var10005 = var10003;
         var10 = 71;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 108;
               break;
            case 1:
               var23 = 127;
               break;
            case 2:
               var23 = 16;
               break;
            case 3:
               var23 = 36;
               break;
            case 4:
               var23 = 95;
               break;
            case 5:
               var23 = 55;
               break;
            default:
               var23 = 25;
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
               b = var8;
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}





