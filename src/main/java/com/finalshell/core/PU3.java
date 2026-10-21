package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import java.awt.Font;

public class PU3 {
   public final Font s;
   public final int P;
   public final float p;
   public static int[] S;
   public static long[] a;
   public static Integer[] b;

   public PU3(Font var1, int var2, float var3) {
      T();
      super();
      this.s = var1;
      this.P = var2;
      this.p = var3;
      if (Ky4.F$arrString() != null) {
         y(new int[4]);
      }
   }

   public Font N() {
      return this.s;
   }

   public int b() {
      return this.P;
   }

   public float F() {
      return this.p;
   }

   @Override
   public boolean equals(Object var1) {
      int[] var2 = T();
      PU3 var10000 = this;
      if (var2 != null) {
         if (this == var1) {
            return true;
         }

         var10000 = (PU3)var1;
      }

      if (var2 != null) {
         if (!(var10000 instanceof PU3)) {
            return false;
         }

         var10000 = (PU3)var1;
      }

      PU3 var3;
      label59: {
         var3 = var10000;
         int var4 = Float.compare(var3.p, this.p);
         if (var2 != null) {
            if (var4 != 0) {
               return false;
            }

            var10000 = this;
            if (var2 == null) {
               break label59;
            }

            var4 = this.P;
         }

         if (var4 != var3.P) {
            return false;
         }

         var10000 = this;
      }

      Font var6 = var10000.s;
      if (var2 != null) {
         if (var10000.s == null) {
            return false;
         }

         var6 = this.s;
      }

      boolean var7 = var6.equals(var3.s);
      return var2 == null ? var7 : var7;
   }

   @Override
   public int hashCode() {
      int[] var10000 = T();
      int var2 = this.s.hashCode();
      var2 = a(20631, 4518104998748878135L) * var2 + this.P;
      int[] var1 = var10000;
      int var5 = a(16048, 6562059783773231889L) * var2;
      float var6;
      int var10001 = (var6 = this.p - 0.0F) == 0.0F ? 0 : (var6 < 0.0F ? -1 : 1);
      if (var1 != null) {
         var10001 = var10001 != 0 ? Float.floatToIntBits(this.p) : 0;
      }

      var2 = var5 + var10001;
      if (var1 == null) {
         Ky4.K(new String[2]);
      }

      return var2;
   }

   public static void y(int[] var0) {
      S = var0;
   }

   public static int[] T() {
      return S;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 9632;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 4450790435057480774L;
      long[] var6 = new long[2];
      int[] var10000 = new int[5];
      int var3 = 0;
      y(var10000);
      String var4 = "\u001d\u009a%a7\u0019An\u0012ú$\u0002åà¯H";
      int var5 = "\u001d\u009a%a7\u0019An\u0012ú$\u0002åà¯H".length();
      byte var2 = 0;

      do {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         var10001 = var3++;
         long var10004 = (
               ((long)var7[0] & 255L) << 56
                  | ((long)var7[1] & 255L) << 48
                  | ((long)var7[2] & 255L) << 40
                  | ((long)var7[3] & 255L) << 32
                  | ((long)var7[4] & 255L) << 24
                  | ((long)var7[5] & 255L) << 16
                  | ((long)var7[6] & 255L) << 8
                  | (long)var7[7] & 255L
            )
            ^ var0;
         byte var10003 = -1;
         var6[var10001] = var10004;
      } while (var2 < var5);

      a = var6;
      b = new Integer[2];
   }
}





