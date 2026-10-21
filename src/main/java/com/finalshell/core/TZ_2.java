package com.finalshell.core;

import java.awt.image.ColorModel;

public class TZ_2 extends XM {
   public static long[] c;
   public static Integer[] e;

   public TZ_2(float var1, ColorModel var2, ColorModel var3) {
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
            int var10001 = b(2011, 3277840925875532657L);
            if (var4 == null) {
               if (var7 > var10001) {
                  var15 = b(26392, 5314250651222086576L) - 2 * U(b(29342, 260001062946375221L) - var7, b(29342, 260001062946375221L) - var8);
                  if (var4 == null) {
                     break label45;
                  }
               }

               var20 = 2;
               var10001 = U(var7, var8);
            }

            var15 = var20 * var10001;
         }

         int var16;
         label38: {
            int var21 = var9;
            int var23 = b(30461, 4961901585517052500L);
            if (var4 == null) {
               if (var9 > var23) {
                  var16 = b(29342, 260001062946375221L) - 2 * U(b(29342, 260001062946375221L) - var9, b(29342, 260001062946375221L) - var10);
                  if (var4 == null) {
                     break label38;
                  }
               }

               var21 = 2;
               var23 = U(var9, var10);
            }

            var16 = var21 * var23;
         }

         int var17;
         label31: {
            int var22 = var11;
            int var24 = b(30461, 4961901585517052500L);
            if (var4 == null) {
               if (var11 > var24) {
                  var17 = b(29342, 260001062946375221L) - 2 * U(b(29342, 260001062946375221L) - var11, b(29342, 260001062946375221L) - var12);
                  if (var4 == null) {
                     break label31;
                  }
               }

               var22 = 2;
               var24 = U(var11, var12);
            }

            var17 = var22 * var24;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 29866;
      if (e[var3] == null) {
         e[var3] = (int)(c[var3] ^ var1);
      }

      return e[var3];
   }

   public static void __vfClinit__() {
      long var0 = 8189101713035110550L;
      long[] var6 = new long[4];
      int var3 = 0;
      String var4 = "@\u008f\u0001®Z\f[\u0098Ø\u001a\u009eY\u001d$®\\";
      int var5 = "@\u008f\u0001®Z\f[\u0098Ø\u001a\u009eY\u001d$®\\".length();
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

                  var4 = "2Æ+\u0088b{;Ù§J{\u0001,1*½";
                  var5 = "2Æ+\u0088b{;Ù§J{\u0001,1*½".length();
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





