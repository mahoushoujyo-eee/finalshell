package com;

import java.awt.image.ColorModel;

class Tq_2 extends XM {
   private static final long[] c;
   private static final Integer[] e;

   public Tq_2(float var1, ColorModel var2, ColorModel var3) {
      super(var1, var2, var3);
   }

   @Override
   public void G(int[] var1, int[] var2, float var3) {
      String var10000 = rA_3.c();
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
         int var18 = var8 * var7 + b(31157, 3011848525729318946L);
         int var15 = (var18 >> b(7226, 2711678499303337390L)) + var18 >> b(8874, 7043744542547415868L);
         var18 = var10 * var9 + b(17335, 5732703899481797154L);
         int var16 = (var18 >> b(8874, 7043744542547415868L)) + var18 >> b(8874, 7043744542547415868L);
         var18 = var12 * var11 + b(17335, 5732703899481797154L);
         int var17 = (var18 >> b(8874, 7043744542547415868L)) + var18 >> b(8874, 7043744542547415868L);
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
      long var0 = 1023630062358976017L;
      long[] var6 = new long[4];
      int var3 = 0;
      String var4 = "\u0005îÜ¼\u009d0\u001e³=\u0092\u0016\u0084ÛsÅ%";
      int var5 = "\u0005îÜ¼\u009d0\u001e³=\u0092\u0016\u0084ÛsÅ%".length();
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

                  var4 = "HúÊÒ\u0083J¤³\u0014(\u0001Å([{·";
                  var5 = "HúÊÒ\u0083J¤³\u0014(\u0001Å([{·".length();
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

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 12695;
      if (e[var3] == null) {
         e[var3] = (int)(c[var3] ^ var1);
      }

      return e[var3];
   }
}





