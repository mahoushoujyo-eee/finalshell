package com.finalshell.core;

import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Float;
import java.awt.image.BufferedImage;

public class GP3 extends Gy4 {
   public float T = 0.0F;
   public float n = 0.5F;
   public float v = 0.5F;
   public float D = 100.0F;
   public float z = 0.0F;
   public float f;
   public float K;
   public static String a;

   public GP3() {
      this.Y(1);
   }

   public void w(float var1) {
      this.T = var1;
   }

   public float C() {
      return this.T;
   }

   public void o(float var1) {
      this.n = var1;
   }

   public float z() {
      return this.n;
   }

   public void t(float var1) {
      this.v = var1;
   }

   public float T() {
      return this.v;
   }

   public void C(Point2D var1) {
      this.n = (float)var1.getX();
      this.v = (float)var1.getY();
   }

   public Point2D y() {
      return new Float(this.n, this.v);
   }

   public void h(float var1) {
      this.D = var1;
   }

   public float P() {
      return this.D;
   }

   @Override
   public BufferedImage filter(BufferedImage var1, BufferedImage var2) {
      String[] var10000 = W5.q();
      this.f = (float)var1.getWidth() * this.n;
      String[] var3 = var10000;
      this.K = (float)var1.getHeight() * this.v;
      GP3 var4 = this;
      if (var3 != null) {
         if (this.D == 0.0F) {
            this.D = Math.min(this.f, this.K);
         }

         this.z = this.D * this.D;
         var4 = this;
      }

      return var4.filter(var1, var2);
   }

   @Override
   public void h(int var1, int var2, float[] var3) {
      String[] var10000 = W5.q();
      float var5 = (float)var1 - this.f;
      float var6 = (float)var2 - this.K;
      float var7 = var5 * var5 + var6 * var6;
      String[] var4 = var10000;
      float var9 = var7;
      float var10001 = this.z;
      if (var4 != null) {
         if (var7 > this.z) {
            var3[0] = (float)var1;
            var3[1] = (float)var2;
            if (var4 != null) {
               return;
            }
         }

         var7 = (float)Math.sqrt((double)var7);
         var9 = (float)Math.atan2((double)var6, (double)var5);
         var10001 = this.T * (this.D - var7) / this.D;
      }

      float var8 = var9 + var10001;
      var3[0] = this.f + var7 * (float)Math.cos((double)var8);
      var3[1] = this.K + var7 * (float)Math.sin((double)var8);
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
      char[] var10003 = "/as\u001cK\f'D\\w\u0001V\u0012}E&".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 121;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 121;
         var10006 = var0;
      } else {
         var6 = 121;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 121;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 18;
               break;
            case 1:
               var23 = 113;
               break;
            case 2:
               var23 = 121;
               break;
            case 3:
               var23 = 17;
               break;
            case 4:
               var23 = 93;
               break;
            case 5:
               var23 = 7;
               break;
            default:
               var23 = 42;
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





