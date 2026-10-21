package com.finalshell.core;

import java.awt.Color;
import java.awt.image.ColorModel;

public class TX_2 extends XM {
   public float[] c = new float[3];
   public float[] W = new float[3];
   public static long[] e;
   public static Integer[] g;

   public TX_2(float var1, ColorModel var2, ColorModel var3) {
      super(var1, var2, var3);
   }

   @Override
   public void G(int[] var1, int[] var2, float var3) {
      int var5 = var1.length;
      String var10000 = RA3.c();
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
         Color.RGBtoHSB(var7, var9, var11, this.c);
         Color.RGBtoHSB(var8, var10, var12, this.W);
         this.W[0] = this.c[0];
         int var18 = Color.HSBtoRGB(this.W[0], this.W[1], this.W[2]);
         int var15 = (var18 & b(31006, 6143023173494371528L)) >> b(12938, 1241702702093320029L);
         int var16 = (var18 & b(2049, 4661819275116709333L)) >> b(3650, 5904975953761633168L);
         int var17 = var18 & b(762, 8112551033732304687L);
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 3542;
      if (g[var3] == null) {
         g[var3] = (int)(e[var3] ^ var1);
      }

      return g[var3];
   }

   public static void __vfClinit__() {
      long var0 = 1645038390566171920L;
      long[] var6 = new long[5];
      int var3 = 0;
      String var4 = "\u009exñ«8sAØ_\u0012¥x\u0015y\u008a]\b\u0098jq#õÏÅ";
      int var5 = "\u009exñ«8sAØ_\u0012¥x\u0015y\u008a]\b\u0098jq#õÏÅ".length();
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
                     e = var6;
                     g = new Integer[5];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "I<\u008d\n\u0094D:ÀyL\u0000@\\¼6\u0088";
                  var5 = "I<\u008d\n\u0094D:ÀyL\u0000@\\¼6\u0088".length();
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





