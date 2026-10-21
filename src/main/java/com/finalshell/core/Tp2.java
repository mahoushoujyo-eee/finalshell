package com.finalshell.core;

import java.awt.image.ColorModel;

public class Tp2 extends XM {
   public static long[] c;
   public static Integer[] e;

   public Tp2(float var1, ColorModel var2, ColorModel var3) {
      super(var1, var2, var3);
   }

   @Override
   public void G(int[] var1, int[] var2, float var3) {
      String var10000 = RA3.c();
      int var5 = var1.length;
      byte var6 = 0;
      String var4 = var10000;

      while (var6 < var5) {
         int var8;
         int var9;
         int var10;
         int var11;
         int var12;
         int var13;
         int var14;
         int var15;
         label45: {
            int var7 = var1[var6];
            var8 = var2[var6];
            var9 = var1[var6 + 1];
            var10 = var2[var6 + 1];
            var11 = var1[var6 + 2];
            var12 = var2[var6 + 2];
            var13 = var1[var6 + 3];
            var14 = var2[var6 + 3];
            int var20 = var7;
            if (var4 == null) {
               if (var7 != b(17100, 8260888752962153602L)) {
                  var15 = Math.min((var8 << b(29944, 4876849918020000437L)) / (b(5364, 1553565865533700792L) - var7), b(5364, 1553565865533700792L));
                  if (var4 == null) {
                     break label45;
                  }
               }

               var20 = var7;
            }

            var15 = var20;
         }

         int var16;
         label38: {
            int var21 = var9;
            if (var4 == null) {
               if (var9 != b(5364, 1553565865533700792L)) {
                  var16 = Math.min((var10 << b(32133, 5162521361070232522L)) / (b(5364, 1553565865533700792L) - var9), b(5364, 1553565865533700792L));
                  if (var4 == null) {
                     break label38;
                  }
               }

               var21 = var9;
            }

            var16 = var21;
         }

         int var17;
         label31: {
            int var22 = var11;
            if (var4 == null) {
               if (var11 != b(5364, 1553565865533700792L)) {
                  var17 = Math.min((var12 << b(32133, 5162521361070232522L)) / (b(5364, 1553565865533700792L) - var11), b(5364, 1553565865533700792L));
                  if (var4 == null) {
                     break label31;
                  }
               }

               var22 = var11;
            }

            var17 = var22;
         }

         float var18 = var3 * (float)var13 / 255.0F;
         float var19 = 1.0F - var18;
         var2[var6] = (int)(var18 * (float)var15 + var19 * (float)var8);
         var2[var6 + 1] = (int)(var18 * (float)var16 + var19 * (float)var10);
         var2[var6 + 2] = (int)(var18 * (float)var17 + var19 * (float)var12);
         var2[var6 + 3] = (int)((float)var13 * var3 + (float)var14 * var19);
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 28238;
      if (e[var3] == null) {
         e[var3] = (int)(c[var3] ^ var1);
      }

      return e[var3];
   }

   public static void __vfClinit__() {
      long var0 = 8507461729964107450L;
      long[] var6 = new long[4];
      int var3 = 0;
      String var4 = "\u0002/\u0098\u001eóé\u008aÇÔ\u009cG\u008c-Hµx";
      int var5 = "\u0002/\u0098\u001eóé\u008aÇÔ\u009cG\u008c-Hµx".length();
      byte var2 = 0;

      label20:
      while (true) {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
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
                     e = new Integer[4];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "*.\u0011\u0095\u001có\\ýÐYÃ\u0001\u0018Ä<\u0007";
                  var5 = "*.\u0011\u0095\u001có\\ýÐYÃ\u0001\u0018Ä<\u0007".length();
                  var2 = 0;
            }

            byte var10 = var2;
            var2 += 8;
            var7 = var4.substring(var10, var2).getBytes("ISO-8859-1");
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





