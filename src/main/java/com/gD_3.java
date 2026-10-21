package com;

import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Float;
import java.awt.image.BufferedImage;

public class gD_3 extends gy_4 {
   private float O = 0.0F;
   private float f = 0.0F;
   private float S = 0.0F;
   private float y = 0.0F;
   private float V = 0.5F;
   private float N = 0.5F;
   private float c = 1.5F;
   private float Z;
   private float I;
   private static final String a;

   public gD_3() {
      this.Y(1);
      this.V(100.0F);
   }

   public void r(float var1) {
      this.c = var1;
   }

   public float E() {
      return this.c;
   }

   public void V(float var1) {
      this.O = var1;
      this.f = var1;
   }

   public float O() {
      return this.O;
   }

   public void c(float var1) {
      this.V = var1;
   }

   public float l() {
      return this.V;
   }

   public void t(float var1) {
      this.N = var1;
   }

   public float s() {
      return this.N;
   }

   public void W(Point2D var1) {
      this.V = (float)var1.getX();
      this.N = (float)var1.getY();
   }

   public Point2D i() {
      return new Float(this.V, this.N);
   }

   @Override
   public BufferedImage filter(BufferedImage var1, BufferedImage var2) {
      String[] var10000 = com.W5.q();
      int var4 = var1.getWidth();
      String[] var3 = var10000;
      int var5 = var1.getHeight();
      this.Z = (float)var4 * this.V;
      this.I = (float)var5 * this.N;
      float var8;
      int var6 = (var8 = this.O - 0.0F) == 0.0F ? 0 : (var8 < 0.0F ? -1 : 1);
      if (var3 != null) {
         if (!var6) {
            this.O = (float)(var4 / 2);
         }

         if (var3 == null) {
            return super.filter(var1, var2);
         }

         float var9;
         var6 = (var9 = this.f - 0.0F) == 0.0F ? 0 : (var9 < 0.0F ? -1 : 1);
      }

      if (!var6) {
         this.f = (float)(var5 / 2);
      }

      this.S = this.O * this.O;
      this.y = this.f * this.f;
      return super.filter(var1, var2);
   }

   @Override
   protected void h(int var1, int var2, float[] var3) {
      String[] var10000 = com.W5.q();
      float var5 = (float)var1 - this.Z;
      float var6 = (float)var2 - this.I;
      float var7 = var5 * var5;
      float var8 = var6 * var6;
      String[] var4 = var10000;
      float var20 = var8;
      float var10001 = this.y - this.y * var7 / this.S;
      if (var4 != null) {
         if (var8 >= var10001) {
            var3[0] = (float)var1;
            var3[1] = (float)var2;
            if (var4 != null) {
               return;
            }
         }

         var20 = 1.0F;
         var10001 = this.c;
      }

      float var9 = var20 / var10001;
      float var10 = (float)Math.sqrt((double)((1.0F - var7 / this.S - var8 / this.y) * this.O * this.f));
      float var11 = var10 * var10;
      float var12 = (float)Math.acos((double)var5 / Math.sqrt((double)(var7 + var11)));
      float var13 = (float) (Math.PI / 2) - var12;
      float var14 = (float)Math.asin(Math.sin((double)var13) * (double)var9);
      var14 = (float) (Math.PI / 2) - var12 - var14;
      var3[0] = (float)var1 - (float)Math.tan((double)var14) * var10;
      float var15 = (float)Math.acos((double)var6 / Math.sqrt((double)(var8 + var11)));
      var13 = (float) (Math.PI / 2) - var15;
      var14 = (float)Math.asin(Math.sin((double)var13) * (double)var9);
      var14 = (float) (Math.PI / 2) - var15 - var14;
      var3[1] = (float)var2 - (float)Math.tan((double)var14) * var10;
   }

   @Override
   public String toString() {
      return a;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "[}\t!F~\n0G\n=L~\u001b1:T".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 37;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 37;
         var10006 = var0;
      } else {
         var6 = 37;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 37;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 58;
               break;
            case 1:
               var23 = 49;
               break;
            case 2:
               var23 = 95;
               break;
            case 3:
               var23 = 112;
               break;
            case 4:
               var23 = 12;
               break;
            case 5:
               var23 = 41;
               break;
            default:
               var23 = 91;
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





