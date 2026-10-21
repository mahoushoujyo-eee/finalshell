package com;

import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Float;
import java.awt.image.BufferedImage;

public class gE_3 extends gy_4 {
   private float x = 10.0F;
   private float c = 20.0F;
   private float h = 0.0F;
   private float v = (float) Math.PI;
   private float G = 0.5F;
   private float Z = 0.5F;
   private float b;
   private float M;
   private float N;
   private float w;
   private static final String a;

   public gE_3() {
      this.Y(0);
   }

   public void K(float var1) {
      this.c = var1;
   }

   public float V() {
      return this.c;
   }

   public void R(float var1) {
      this.h = var1;
   }

   public float F() {
      return this.h;
   }

   public void D(float var1) {
      this.v = var1;
   }

   public float f() {
      return this.v;
   }

   public void l(float var1) {
      this.x = var1;
   }

   public float W() {
      return this.x;
   }

   public void L(float var1) {
      this.G = var1;
   }

   public float B() {
      return this.G;
   }

   public void V(float var1) {
      this.Z = var1;
   }

   public float h() {
      return this.Z;
   }

   public void N(Point2D var1) {
      this.G = (float)var1.getX();
      this.Z = (float)var1.getY();
   }

   public Point2D b() {
      return new Float(this.G, this.Z);
   }

   @Override
   public BufferedImage filter(BufferedImage var1, BufferedImage var2) {
      this.N = (float)var1.getWidth();
      this.w = (float)var1.getHeight();
      this.b = this.N * this.G;
      this.M = this.w * this.Z;
      this.N--;
      return super.filter(var1, var2);
   }

   @Override
   protected void h(int var1, int var2, float[] var3) {
      float var4 = (float)var1 - this.b;
      float var5 = (float)var2 - this.M;
      float var6 = (float)Math.atan2((double)(-var5), (double)(-var4)) + this.h;
      float var7 = (float)Math.sqrt((double)(var4 * var4 + var5 * var5));
      var6 = NM.i(var6, (float) (Math.PI * 2));
      var3[0] = this.N * var6 / (this.v + 1.0E-5F);
      var3[1] = this.w * (1.0F - (var7 - this.x) / (this.c + 1.0E-5F));
   }

   @Override
   public String toString() {
      return a;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "5N\u0003&3 ^^d\u0019 ?>O_\t^".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 127;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 127;
         var10006 = var0;
      } else {
         var6 = 127;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 127;
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
               var23 = 88;
               break;
            case 2:
               var23 = 15;
               break;
            case 3:
               var23 = 45;
               break;
            case 4:
               var23 = 35;
               break;
            case 5:
               var23 = 45;
               break;
            default:
               var23 = 85;
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





