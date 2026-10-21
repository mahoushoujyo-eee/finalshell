package com.finalshell.core;

import java.awt.Rectangle;

public class Gc4 extends Gy4 {
   public float W = 5.0F;
   public float L = 0.0F;
   public float o;
   public float B;
   public int m;
   public static String a;

   public Gc4() {
      this.o = this.B = 16.0F;
   }

   public void K(float var1) {
      this.W = var1;
   }

   public float j() {
      return this.W;
   }

   public void Y(float var1) {
      this.o = var1;
   }

   public float O() {
      return this.o;
   }

   public void W(float var1) {
      this.L = var1;
   }

   public float J() {
      return this.L;
   }

   public void G(float var1) {
      this.B = var1;
   }

   public float v() {
      return this.B;
   }

   public void H(int var1) {
      this.m = var1;
   }

   public int c() {
      return this.m;
   }

   @Override
   protected void T(Rectangle var1) {
      String[] var2 = W5.q();
      if (var2 != null) {
         if (this.t != 0) {
            return;
         }

         var1.x = var1.x - (int)this.W;
         var1.width = var1.width + (int)(2.0F * this.W);
         var1.y = var1.y - (int)this.L;
      }

      var1.height = var1.height + (int)(2.0F * this.L);
   }

   @Override
   protected void h(int var1, int var2, float[] var3) {
      String[] var10000 = W5.q();
      float var5 = (float)var2 / this.o;
      String[] var4 = var10000;
      float var6 = (float)var1 / this.B;
      float var7;
      float var8;
      switch (this.m) {
         case 0:
         default:
            var7 = (float)Math.sin((double)var5);
            var8 = (float)Math.sin((double)var6);
            if (var4 != null) {
               break;
            }
         case 1:
            var7 = NM.i(var5, 1.0F);
            var8 = NM.i(var6, 1.0F);
            if (var4 != null) {
               break;
            }
         case 2:
            var7 = NM.l(var5);
            var8 = NM.l(var6);
            if (var4 != null) {
               break;
            }
         case 3:
            var7 = UZ.x(var5);
            var8 = UZ.x(var6);
      }

      var3[0] = (float)var1 + this.W * var7;
      var3[1] = (float)var2 + this.L * var8;
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
      char[] var10003 = "NmF\u001c!\t\u001a%V\\\u0018>\u0017\u000b$*\u001b".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 16;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 16;
         var10006 = var0;
      } else {
         var6 = 16;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 16;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 26;
               break;
            case 1:
               var23 = 20;
               break;
            case 2:
               var23 = 37;
               break;
            case 3:
               var23 = 120;
               break;
            case 4:
               var23 = 94;
               break;
            case 5:
               var23 = 107;
               break;
            default:
               var23 = 126;
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





