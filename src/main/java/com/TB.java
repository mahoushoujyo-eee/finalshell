package com;

import java.awt.image.ColorModel;

class TB extends XM {
   private static final long[] c;
   private static final Integer[] e;

   public TB(float var1, ColorModel var2, ColorModel var3) {
      super(var1, var2, var3);
   }

   @Override
   public void G(int[] var1, int[] var2, float var3) {
      int var5 = var1.length;
      String var10000 = rA_3.c();
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
         int var15 = b(23182, 7369015157103641019L) - Math.abs(b(10069, 3777408055898881121L) - var7 - var8);
         int var16 = b(10069, 3777408055898881121L) - Math.abs(b(10069, 3777408055898881121L) - var9 - var10);
         int var17 = b(10069, 3777408055898881121L) - Math.abs(b(10069, 3777408055898881121L) - var11 - var12);
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
      long var0 = 8555992312076198292L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "Òd=VáË]\n\u0011\u000b[ÿ\u0001ç Ð";
      int var5 = "Òd=VáË]\n\u0011\u000b[ÿ\u0001ç Ð".length();
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

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 6964;
      if (e[var3] == null) {
         e[var3] = (int)(c[var3] ^ var1);
      }

      return e[var3];
   }
}





