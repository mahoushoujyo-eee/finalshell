package com.finalshell.core;

import java.awt.image.ColorModel;

public class TQ extends XM {
   public static long[] c;
   public static Integer[] e;

   public TQ(float var1, ColorModel var2, ColorModel var3) {
      super(var1, var2, var3);
   }

   @Override
   public void G(int[] var1, int[] var2, float var3) {
      String var10000 = RA3.c();
      int var5 = var1.length;
      String var4 = var10000;
      byte var6 = 0;

      while (var6 < var5) {
         int var8;
         int var9;
         int var10;
         int var11;
         int var12;
         int var13;
         int var14;
         label42: {
            int var7 = var1[var6];
            var8 = var2[var6];
            var9 = var1[var6 + 1];
            var10 = var2[var6 + 1];
            var11 = var1[var6 + 2];
            var12 = var2[var6 + 2];
            var13 = var1[var6 + 3];
            var14 = var2[var6 + 3];
            int var20 = var7;
            int var10001 = b(15135, 2806817836720972409L);
            if (var4 == null) {
               if (var7 > var10001) {
                  var21 = Math.max(var7, var8);
                  break label42;
               }

               var20 = var7;
               var10001 = var8;
            }

            var21 = Math.min(var20, var10001);
         }

         int var15;
         label36: {
            var15 = var21;
            int var22 = var9;
            int var26 = b(9098, 4152576233581542125L);
            if (var4 == null) {
               if (var9 > var26) {
                  var23 = Math.max(var9, var10);
                  break label36;
               }

               var22 = var9;
               var26 = var10;
            }

            var23 = Math.min(var22, var26);
         }

         int var16;
         label30: {
            var16 = var23;
            int var24 = var11;
            int var27 = b(9098, 4152576233581542125L);
            if (var4 == null) {
               if (var11 > var27) {
                  var25 = Math.max(var11, var12);
                  break label30;
               }

               var24 = var11;
               var27 = var12;
            }

            var25 = Math.min(var24, var27);
         }

         int var17 = var25;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 22887;
      if (e[var3] == null) {
         e[var3] = (int)(c[var3] ^ var1);
      }

      return e[var3];
   }

   public static void __vfClinit__() {
      long var0 = 3896533788173633122L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "ß1~ü¢>üðrg(`a\u009edd";
      int var5 = "ß1~ü¢>üðrg(`a\u009edd".length();
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

      c = var6;
      e = new Integer[2];
   }
}





