package com.finalshell.core;

import java.awt.Color;

public final class Wl2 {
   public static Color X;
   public static Color T;
   public static Color m;
   public static Color k;
   public static Color V;
   public static Color E;
   public static Color K;
   public static Color N;
   public static Color Y;
   public static int A;
   public static int h;
   public static int R;
   public static boolean U;
   public static int c;

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var1 = 8490524912463927515L;
      long[] var0 = new long[10];
      int var4 = 0;
      String var5 = "°3º\u000fT\u0004X$;\u000bqBT\u0004X)¾\u00137yT\u0004X)EÝª[T\u0004X\u0004\b\u001cÕ\u0098T\u0004X\t\u0006|É\tT\u0004X+1÷8uT\u0004X$:Îù\u001aT\u0004X\t";
      int var6 = "°3º\u000fT\u0004X$;\u000bqBT\u0004X)¾\u00137yT\u0004X)EÝª[T\u0004X\u0004\b\u001cÕ\u0098T\u0004X\t\u0006|É\tT\u0004X+1÷8uT\u0004X$:Îù\u001aT\u0004X\t"
         .length();
      byte var3 = 0;

      label21:
      while (true) {
         int var10001 = var3;
         var3 += 8;
         byte[] var7 = var5.substring(var10001, var3).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
         long[] var10000 = var0;
         var10001 = var4++;
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
            long var13 = var10002 ^ var1;
            switch (var10003) {
               case 0:
                  var10000[var10001] = var13;
                  if (var3 >= var6) {
                     X = new Color((int)var0[2], (int)var0[1], (int)var0[1]);
                     T = new Color((int)var0[8], (int)var0[3], (int)var0[3]);
                     m = Color.WHITE;
                     k = new Color((int)var0[3], (int)var0[3], (int)var0[3]);
                     V = Color.GRAY;
                     E = Color.LIGHT_GRAY;
                     K = new Color((int)var0[6], (int)var0[0], (int)var0[0], (int)var0[9]);
                     N = new Color((int)var0[0], (int)var0[0], (int)var0[0], (int)var0[4]);
                     Y = new Color((int)var0[7], (int)var0[7], (int)var0[7]);
                     A = GO.FT;
                     h = GO.Fx;
                     R = GO.FG;
                     U = true;
                     c = (int)var0[5];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var3 < var6) {
                     continue label21;
                  }

                  var5 = "\u0092{F\u000fT\u0004X\u0004«\u009c0\u0081T\u0004Xo";
                  var6 = "\u0092{F\u000fT\u0004X\u0004«\u009c0\u0081T\u0004Xo".length();
                  var3 = 0;
            }

            byte var10 = var3;
            var3 += 8;
            var7 = var5.substring(var10, var3).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
            var10000 = var0;
            var10001 = var4++;
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





