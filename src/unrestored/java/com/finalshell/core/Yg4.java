package com.finalshell.core;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;

public class Yg4 extends GT3 {
   public Hr2 L;
   public Hr2 F;
   public int v = 1;
   public BufferedImage s;
   public float t;
   public static String a;

   public Yg4() {
   }

   public Yg4(Hr2 var1, Hr2 var2) {
      this.L = var1;
      this.F = var2;
   }

   public void x(Hr2 var1) {
      this.L = var1;
   }

   public Hr2 y() {
      return this.L;
   }

   public void i(Hr2 var1) {
      this.F = var1;
   }

   public Hr2 c() {
      return this.F;
   }

   public void e(int var1) {
      this.v = var1;
   }

   public int n() {
      return this.v;
   }

   public void P(BufferedImage var1) {
      this.s = var1;
   }

   public BufferedImage r() {
      return this.s;
   }

   public void T(float var1) {
      this.t = var1;
   }

   public float a() {
      return this.t;
   }

   @Override
   public void J(Rectangle var1) {
      var1.width = var1.width * this.v;
   }

   @Override
   public int[] K(int var1, int var2, int[] var3, Rectangle var4) {
      String[] var10000 = W5.q();
      int[] var6 = new int[var1 * var2];
      String[] var5 = var10000;
      Yg4 var11 = this;
      if (var5 != null) {
         if (this.s != null) {
            int[] var7 = this.l(this.s, 0, 0, var1, var2, null);
            this.s(var3, var7, var6, this.L, this.F, var1, var2, this.t);
            if (var5 != null) {
               return var6;
            }
         }

         var11 = this;
      }

      label28: {
         if (var5 != null) {
            if (var11.v > 1) {
               break label28;
            }

            var11 = this;
         }

         var11.L.l(var3, var1, var2, this.L, this.F, var6);
         if (var5 != null) {
            return var6;
         }
      }

      Hr2 var10 = new Hr2(this.L.d, this.L.F, var1, var2);
      int var8 = 0;

      while (var8 < this.v) {
         float var9 = (float)var8 / (float)(this.v - 1);
         this.L.O(var9, this.F, var10);
         this.L.l(var3, var1, var2, this.L, var10, var6);
         var8++;
         if (var5 == null) {
            break;
         }
      }

      return var6;
   }

   public void s(int[] var1, int[] var2, int[] var3, Hr2 var4, Hr2 var5, int var6, int var7, float var8) {
      Hr2 var9 = new Hr2(var4.d, var4.F, var6, var7);
      var4.O(var8, var5, var9);
      var4.l(var1, var6, var7, var4, var9, var3);
      int[] var10 = new int[var6 * var7];
      var5.l(var2, var6, var7, var5, var9, var10);
      this.Y(var3, var10, var6, var7, var8);
   }

   public void Y(int[] var1, int[] var2, int var3, int var4, float var5) {
      String[] var10000 = W5.q();
      int var7 = 0;
      String[] var6 = var10000;
      int var8 = 0;

      while (var8 < var4) {
         int var9 = 0;

         while (true) {
            if (var9 < var3) {
               var1[var7] = NM.n(var5, var1[var7], var2[var7]);
               var7++;
               var9++;
               if (var6 == null) {
                  break;
               }

               if (var6 != null) {
                  continue;
               }
            }

            var8++;
            break;
         }

         if (var6 == null) {
            break;
         }
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
      char[] var10003 = "!>GR\b*tJ\u001aQU\u000fxW\u0004%D\bIv".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 24;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 24;
         var10006 = var0;
      } else {
         var6 = 24;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 24;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 125;
               break;
            case 1:
               var23 = 79;
               break;
            case 2:
               var23 = 44;
               break;
            case 3:
               var23 = 62;
               break;
            case 4:
               var23 = 127;
               break;
            case 5:
               var23 = 64;
               break;
            default:
               var23 = 24;
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





