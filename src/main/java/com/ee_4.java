package com;

import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;

public final class ee_4 {
   public static boolean n;
   public static boolean X;
   public static int J;
   public static boolean k;
   public static int x;
   public static boolean u;
   public static boolean N;
   public static Color q;
   public static Color G;
   public static Color i;
   public static Color p;
   public static com.og_4 l;
   public static int O;
   public static Insets Q;
   public static Insets W;
   public static String h;
   public static Font K;
   public static Color j;
   public static int E;
   public static boolean S;

   static {
      long var1 = 6320491227543759679L;
      long[] var0 = new long[3];
      int var4 = 0;
      String var5 = "å$ù\u0010··ë\u009f=&¼z··ë\u009f?\u0011\u0083\u001b··ë5";
      int var6 = "å$ù\u0010··ë\u009f=&¼z··ë\u009f?\u0011\u0083\u001b··ë5".length();
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

      n = GO.d;
      X = GO.X;
      J = 0;
      k = GO.Fe;
      x = GO.FG;
      u = true;
      N = false;
      q = Color.WHITE;
      G = Color.BLACK;
      i = Color.BLACK;
      p = Color.GRAY;
      l = null;
      O = GO.FJ;
      Q = new Insets(0, 0, 0, 0);
      W = new Insets(2, 2, 2, 2);
      h = null;
      K = null;
      j = new Color((int)var0[1], (int)var0[0], (int)var0[0]);
      E = (int)var0[2];
      S = true;
   }
}





