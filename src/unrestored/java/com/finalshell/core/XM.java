package com.finalshell.core;

import java.awt.CompositeContext;
import java.awt.image.ColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;

public abstract class XM implements CompositeContext {
   public float a;
   public ColorModel b;
   public ColorModel H;
   public static long[] d;
   public static Integer[] f;

   public XM(float var1, ColorModel var2, ColorModel var3) {
      this.a = var1;
      this.b = var2;
      this.H = var3;
   }

   @Override
   public void dispose() {
   }

   public static int U(int var0, int var1) {
      int var2 = var0 * var1 + a(29649, 5911693692162933165L);
      return (var2 >> a(1433, 331256653831534564L)) + var2 >> a(24853, 5482750089917076330L);
   }

   public static int c(int var0) {
      String var1 = RA3.c();
      int var10000 = var0;
      if (var1 == null) {
         if (var0 < 0) {
            return 0;
         }

         var10000 = var0;
      }

      if (var1 == null) {
         var10000 = var10000 > a(13415, 454637809669391897L) ? a(8852, 7670995858735059183L) : var0;
      }

      return var10000;
   }

   public abstract void G(int[] var1, int[] var2, float var3);

   @Override
   public void compose(Raster var1, Raster var2, WritableRaster var3) {
      String var10000 = RA3.c();
      float var5 = this.a;
      String var4 = var10000;
      int[] var6 = null;
      int[] var7 = null;
      int var8 = var3.getMinX();
      int var9 = var3.getWidth();
      int var10 = var3.getMinY();
      int var11 = var10 + var3.getHeight();
      int var12 = var10;

      while (var12 < var11) {
         var6 = var1.getPixels(var8, var12, var9, 1, var6);
         var7 = var2.getPixels(var8, var12, var9, 1, var7);
         this.G(var6, var7, var5);
         var3.setPixels(var8, var12, var9, 1, var7);
         var12++;
         if (var4 != null) {
            break;
         }
      }
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 29311;
      if (f[var3] == null) {
         f[var3] = (int)(d[var3] ^ var1);
      }

      return f[var3];
   }

   public static void __vfClinit__() {
      long var0 = 8973208339514803828L;
      long[] var6 = new long[5];
      int var3 = 0;
      String var4 = "@\f$É9åÕ\u0016ëA\u0017û\u008e\u0094\u0000\u0092\u001c4\u0096\b¹F±\u0098";
      int var5 = "@\f$É9åÕ\u0016ëA\u0017û\u008e\u0094\u0000\u0092\u001c4\u0096\b¹F±\u0098".length();
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
                     d = var6;
                     f = new Integer[5];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "\b y\u0096:\u0010GYìÐpô\u0015?\u0016d";
                  var5 = "\b y\u0096:\u0010GYìÐpô\u0015?\u0016d".length();
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





