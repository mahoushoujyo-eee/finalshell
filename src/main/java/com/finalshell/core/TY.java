package com.finalshell.core;

import java.awt.image.ColorModel;

public class TY extends XM {
   public static long[] c;
   public static Integer[] e;

   public TY(float var1, ColorModel var2, ColorModel var3) {
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
            int var26 = var8;
            int var10001 = b(3664, 6730940233445230440L);
            if (var4 == null) {
               if (var8 < var10001) {
                  int var18 = var8 * var7 + b(8278, 7649783469021981039L);
                  var15 = 2 * ((var18 >> b(6108, 4547976378018717408L)) + var18 >> b(23778, 6048668738469041629L));
                  if (var4 == null) {
                     break label45;
                  }
               }

               var26 = (b(21112, 1487575835253447493L) - var8) * (b(9653, 2662323655478996107L) - var7);
               var10001 = b(8278, 7649783469021981039L);
            }

            int var21 = var26 + var10001;
            var15 = 2 * (b(9653, 2662323655478996107L) - ((var21 >> b(23778, 6048668738469041629L)) + var21 >> b(23778, 6048668738469041629L)));
         }

         int var16;
         label38: {
            int var27 = var10;
            int var29 = b(8278, 7649783469021981039L);
            if (var4 == null) {
               if (var10 < var29) {
                  int var22 = var10 * var9 + b(8278, 7649783469021981039L);
                  var16 = 2 * ((var22 >> b(23778, 6048668738469041629L)) + var22 >> b(23778, 6048668738469041629L));
                  if (var4 == null) {
                     break label38;
                  }
               }

               int var23 = (b(9653, 2662323655478996107L) - var10) * (b(9653, 2662323655478996107L) - var9) + b(8278, 7649783469021981039L);
               var27 = 2;
               var29 = b(9653, 2662323655478996107L) - ((var23 >> b(23778, 6048668738469041629L)) + var23 >> b(23778, 6048668738469041629L));
            }

            var16 = var27 * var29;
         }

         int var17;
         label31: {
            int var28 = var12;
            int var30 = b(8278, 7649783469021981039L);
            if (var4 == null) {
               if (var12 < var30) {
                  int var24 = var12 * var11 + b(8278, 7649783469021981039L);
                  var17 = 2 * ((var24 >> b(23778, 6048668738469041629L)) + var24 >> b(23778, 6048668738469041629L));
                  if (var4 == null) {
                     break label31;
                  }
               }

               int var25 = (b(9653, 2662323655478996107L) - var12) * (b(9653, 2662323655478996107L) - var11) + b(8278, 7649783469021981039L);
               var28 = 2;
               var30 = b(9653, 2662323655478996107L) - ((var25 >> b(23778, 6048668738469041629L)) + var25 >> b(23778, 6048668738469041629L));
            }

            var17 = var28 * var30;
         }

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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 18748;
      if (e[var3] == null) {
         e[var3] = (int)(c[var3] ^ var1);
      }

      return e[var3];
   }

   public static void __vfClinit__() {
      long var0 = 3909850653919408307L;
      long[] var6 = new long[6];
      int var3 = 0;
      String var4 = "á©]~=\u001d®[\u008eø\u0016\u0003c\rk\tÈÊaä\u0006@\u001cÇÝ·\u0082o÷Äåf";
      int var5 = "á©]~=\u001d®[\u008eø\u0016\u0003c\rk\tÈÊaä\u0006@\u001cÇÝ·\u0082o÷Äåf".length();
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
                     e = new Integer[6];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "+¨qû¥R·[\u0090Ý\u008b\u009c°\u0004\u0019\\";
                  var5 = "+¨qû¥R·[\u0090Ý\u008b\u009c°\u0004\u0019\\".length();
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





