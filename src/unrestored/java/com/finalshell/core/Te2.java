package com.finalshell.core;

import java.awt.image.ColorModel;

public class Te2 extends XM {
   public static long[] c;
   public static Integer[] e;

   public Te2(float var1, ColorModel var2, ColorModel var3) {
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
         int var18 = (b(2157, 2707633846231914238L) - var8) * (b(7444, 1165573058385593222L) - var7) + b(25186, 2792082941933698294L);
         int var15 = b(7444, 1165573058385593222L) - ((var18 >> b(14817, 8394250381264775024L)) + var18 >> b(30367, 6972892515718932495L));
         var18 = (b(7444, 1165573058385593222L) - var10) * (b(7444, 1165573058385593222L) - var9) + b(31889, 323620260321337860L);
         int var16 = b(7444, 1165573058385593222L) - ((var18 >> b(30367, 6972892515718932495L)) + var18 >> b(30367, 6972892515718932495L));
         var18 = (b(7444, 1165573058385593222L) - var12) * (b(7444, 1165573058385593222L) - var11) + b(31889, 323620260321337860L);
         int var17 = b(7444, 1165573058385593222L) - ((var18 >> b(30367, 6972892515718932495L)) + var18 >> b(30367, 6972892515718932495L));
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 24208;
      if (e[var3] == null) {
         e[var3] = (int)(c[var3] ^ var1);
      }

      return e[var3];
   }

   public static void __vfClinit__() {
      long var0 = 1139314928574003848L;
      long[] var6 = new long[6];
      int var3 = 0;
      String var4 = "¢Ë2V´\u009bÒ\u008fó\u0096Ö^f\n\u009dðñX^ñL%9ñ O\u0095X\u0016\u0089¬\u0089";
      int var5 = "¢Ë2V´\u009bÒ\u008fó\u0096Ö^f\n\u009dðñX^ñL%9ñ O\u0095X\u0016\u0089¬\u0089".length();
      byte var2 = 0;

      label20:
      while (true) {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
         long[] var10000 = var6;
         var10001 = var3++;
         long var10002 = ((long)var7[0] & 255L) << 56
            | ((long)var7[1] & 255L) << 48
            | ((long)var7[2] & 255L) << 40
            | ((long)var7[3] & 255L) << 32
            | ((long)var7[4] & 255L) << 24
            | ((long)var7[5] & 255L) << 16
            | ((long)var7[6] & 255L) << 8
            | (long)var7[7] & 255L;
         byte var10003 = -1;

         while (true) {
            long var13 = var10002 ^ var0;
            switch (var10003) {
               case 0:
                  var10000[var10001] = var13;
                  if (var2 >= var5) {
                     c = var6;
                     e = new Integer[6];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "\u0006\u0013AÌ¥\u0091Fþ\u008d1ÙD¦aX\f";
                  var5 = "\u0006\u0013AÌ¥\u0091Fþ\u008d1ÙD¦aX\f".length();
                  var2 = 0;
            }

            byte var10 = var2;
            var2 += 8;
            var7 = var4.substring(var10, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
            var10000 = var6;
            var10001 = var3++;
            var10002 = ((long)var7[0] & 255L) << 56
               | ((long)var7[1] & 255L) << 48
               | ((long)var7[2] & 255L) << 40
               | ((long)var7[3] & 255L) << 32
               | ((long)var7[4] & 255L) << 24
               | ((long)var7[5] & 255L) << 16
               | ((long)var7[6] & 255L) << 8
               | (long)var7[7] & 255L;
            var10003 = 0;
         }
      }
   }
}





