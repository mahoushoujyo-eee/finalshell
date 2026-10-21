package com.finalshell.core;

import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;

public final class Lv4 {
   public static Insets G;
   public static String n;
   public static Font U;
   public static Color m;
   public static int q;
   public static int K;
   public static boolean V;
   public static Og4 R;
   public static Color o;
   public static Color k;
   public static Color P;
   public static Color g;

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var1 = 2215293657539704676L;
      long[] var0 = new long[2];
      int var4 = 0;
      String var5 = "Ö×\u008b\u0094*ÔwÄ êËÁ*ÔwÄ";
      int var6 = "Ö×\u008b\u0094*ÔwÄ êËÁ*ÔwÄ".length();
      byte var3 = 0;

      do {
         int var10001 = var3;
         var3 += 8;
         byte[] var7 = var5.substring(var10001, var3).getBytes("ISO-8859-1");
         var10001 = var4++;
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
            ^ var1;
         byte var10003 = -1;
         var0[var10001] = var10004;
      } while (var3 < var6);

      G = new Insets(2, 2, 2, 2);
      n = null;
      U = null;
      m = new Color((int)var0[1], (int)var0[0], (int)var0[0]);
      q = 0;
      K = 0;
      V = true;
      R = null;
      o = Color.WHITE;
      k = Color.BLACK;
      P = Color.BLACK;
      g = Color.GRAY;
   }
}





