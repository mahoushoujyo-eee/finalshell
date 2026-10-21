package com.finalshell.core;

import java.awt.image.ColorModel;

public class Xn2 extends XM {
   public static long[] c;
   public static Integer[] e;

   public Xn2(float var1, ColorModel var2, ColorModel var3) {
      super(var1, var2, var3);
   }

   @Override
   public void G(int[] var1, int[] var2, float var3) {
      String var10000 = RA3.c();
      int var5 = var1.length;
      byte var6 = 0;
      String var4 = var10000;

      while (var6 < var5) {
         int var7 = var1[var6];
         int var8 = var2[var6];
         int var9 = var1[var6 + 1];
         int var10 = var2[var6 + 1];
         int var11 = var1[var6 + 2];
         int var12 = var2[var6 + 2];
         int var13 = var1[var6 + 3];
         int var14 = var2[var6 + 3];
         int var15 = var8 + var7;
         int var20 = var15;
         int var10001 = b(24816, 6031740720206631332L);
         if (var4 == null) {
            if (var15 > var10001) {
               var15 = b(19215, 8587522932618984026L);
            }

            var20 = var10;
            var10001 = var9;
         }

         int var16 = var20 + var10001;
         int var21 = var16;
         var10001 = b(19215, 8587522932618984026L);
         if (var4 == null) {
            if (var16 > var10001) {
               var16 = b(19215, 8587522932618984026L);
            }

            var21 = var12;
            var10001 = var11;
         }

         int var17;
         label32: {
            var17 = var21 + var10001;
            int var22 = var17;
            if (var4 == null) {
               if (var17 <= b(19215, 8587522932618984026L)) {
                  break label32;
               }

               var22 = b(19215, 8587522932618984026L);
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 12629;
      if (e[var3] == null) {
         e[var3] = (int)(c[var3] ^ var1);
      }

      return e[var3];
   }

   public static void __vfClinit__() {
      long var0 = 1975184607467749404L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "Ò\u0080Rò¶©:¹æ\u0086\u001dc@Ã\u0091G";
      int var5 = "Ò\u0080Rò¶©:¹æ\u0086\u001dc@Ã\u0091G".length();
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





