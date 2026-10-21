package com;

import java.awt.Polygon;

public class _x_2 extends Polygon {
   private static int Z;

   public _x_2(int var1, int var2, int var3, int var4, int var5) {
      this(var1, var2, var3, var4, var5, 0.0);
   }

   public _x_2(int var1, int var2, int var3, int var4, int var5, double var6) {
      super(T(var1, var2, var3, var4, var5, var6), u(var1, var2, var3, var4, var5, var6), var5 * 2);
   }

   protected static int[] T(int var0, int var1, int var2, int var3, int var4, double var5) {
      int[] var8 = new int[var4 * 2];
      double var9 = (Math.PI * 2) / (double)var4;
      int var10000 = w();
      double var11 = var5;
      double var13 = var5 + Math.PI / (double)var4;
      int var7 = var10000;
      int var15 = 0;

      while (true) {
         if (var15 < var4) {
            var8[var15 * 2] = (int)Math.round((double)var2 * Math.cos(var11)) + var0;
            var11 += var9;
            var17 = var8;
            if (var7 != 0) {
               break;
            }

            var8[var15 * 2 + 1] = (int)Math.round((double)var3 * Math.cos(var13)) + var0;
            var13 += var9;
            var15++;
            if (var7 == 0) {
               continue;
            }
         }

         var17 = var8;
         break;
      }

      if (com.ky_4.F() != null) {
         p(++var7);
      }

      return var17;
   }

   protected static int[] u(int var0, int var1, int var2, int var3, int var4, double var5) {
      int[] var8 = new int[var4 * 2];
      double var9 = (Math.PI * 2) / (double)var4;
      int var10000 = a();
      double var11 = var5;
      int var7 = var10000;
      double var13 = var5 + Math.PI / (double)var4;
      int var15 = 0;

      while (true) {
         if (var15 < var4) {
            var8[var15 * 2] = (int)Math.round((double)var2 * Math.sin(var11)) + var1;
            var11 += var9;
            var16 = var8;
            if (var7 == 0) {
               break;
            }

            var8[var15 * 2 + 1] = (int)Math.round((double)var3 * Math.sin(var13)) + var1;
            var13 += var9;
            var15++;
            if (var7 != 0) {
               continue;
            }

            com.ky_4.K(new String[4]);
         }

         var16 = var8;
         break;
      }

      return var16;
   }

   public static void p(int var0) {
      Z = var0;
   }

   public static int w() {
      return Z;
   }

   public static int a() {
      int var0 = w();
      return var0 == 0 ? 6 : 0;
   }

   static {
      if (w() != 0) {
         p(125);
      }
   }
}





