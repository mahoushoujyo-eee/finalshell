package com.finalshell.core;

import java.awt.image.ColorModel;

public class Tx2 extends XM {
   public static long[] c;
   public static Integer[] e;

   public Tx2(float var1, ColorModel var2, ColorModel var3) {
      super(var1, var2, var3);
   }

   @Override
   public void G(int[] var1, int[] var2, float var3) {
      String var10000 = RA3.c();
      int var5 = var1.length;
      String var4 = var10000;
      byte var6 = 0;

      while (var6 < var5) {
         int var7 = var1[var6];
         int var8 = var2[var6];
         int var9 = var1[var6 + 1];
         int var10 = var2[var6 + 1];
         int var11 = var1[var6 + 2];
         int var12 = var2[var6 + 2];
         int var13 = var1[var6 + 3];
         int var14 = var2[var6 + 3];
         int var18 = U(var7, var8);
         int var15 = var18 + U(var8, b(26613, 6101662419421654436L) - U(b(5201, 1936960066046795265L) - var8, b(5201, 1936960066046795265L) - var7) - var18);
         var18 = U(var9, var10);
         int var16 = var18 + U(var10, b(5201, 1936960066046795265L) - U(b(5201, 1936960066046795265L) - var10, b(5201, 1936960066046795265L) - var9) - var18);
         var18 = U(var11, var12);
         int var17 = var18 + U(var12, b(5201, 1936960066046795265L) - U(b(5201, 1936960066046795265L) - var12, b(5201, 1936960066046795265L) - var11) - var18);
         float var19 = var3 * (float)var13 / 255.0F;
         float var20 = 1.0F - var19;
         var2[var6] = (int)(var19 * (float)var15 + var20 * (float)var8);
         var2[var6 + 1] = (int)(var19 * (float)var16 + var20 * (float)var10);
         var2[var6 + 2] = (int)(var19 * (float)var17 + var20 * (float)var12);
         var2[var6 + 3] = (int)((float)var13 * var3 + (float)var14 * var20);
         var6 += 4;
         if (var4 != null) {
            break;
         }
      }
   }

   static {
      __vfClinit__();
   }

   public static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 2640;
      if (e[var3] == null) {
         e[var3] = (int)(c[var3] ^ var1);
      }

      return e[var3];
   }

   public static void __vfClinit__() {
      long var0 = 8027603294097638260L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "nñ\u0011D\u001e¤\u001d\u008a9\u009fÐÕ\u008e\u0088n/";
      int var5 = "nñ\u0011D\u001e¤\u001d\u008a9\u009fÐÕ\u008e\u0088n/".length();
      byte var2 = 0;

      do {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
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

      c = var6;
      e = new Integer[2];
   }
}





