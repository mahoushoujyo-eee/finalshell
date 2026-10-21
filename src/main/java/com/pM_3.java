package com;

import java.awt.Color;

public final class pM_3 {
   public static Color h;
   public static Color a;
   public static int r;
   public static int J;
   public static int G;
   public static boolean D;
   public static Color R;
   public static Color g;
   public static Color c;
   public static int S;
   public static int b;
   public static boolean p;
   public static Color j;
   public static Color Z;
   public static int t;
   public static int n;
   public static int u;
   public static int e;
   public static boolean o;
   public static boolean X;
   public static int F;
   public static boolean q;
   public static boolean K;
   public static boolean s;

   static {
      long var1 = 3263091840001865782L;
      long[] var0 = new long[6];
      int var4 = 0;
      String var5 = "\u0085éÅ¨hÉx2þÔÅ$hÉx? ¨»\u0006hÉxé\u0006\u009eÎNhÉx>";
      int var6 = "\u0085éÅ¨hÉx2þÔÅ$hÉx? ¨»\u0006hÉxé\u0006\u009eÎNhÉx>".length();
      byte var3 = 0;

      label21:
      while (true) {
         int var10001 = var3;
         var3 += 8;
         byte[] var7 = var5.substring(var10001, var3).getBytes("ISO-8859-1");
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
                     h = GO.Fz;
                     a = GO.Q;
                     r = (int)var0[1];
                     J = GO.FT;
                     G = GO.FG;
                     D = true;
                     R = Color.WHITE;
                     g = new Color((int)var0[2], (int)var0[5], (int)var0[5]);
                     c = GO.Ff;
                     S = GO.Fx;
                     b = GO.FG;
                     p = true;
                     j = GO.FR;
                     Z = GO.Q;
                     t = (int)var0[3];
                     n = (int)var0[4];
                     u = GO.Fx;
                     e = GO.FG;
                     o = true;
                     X = true;
                     F = (int)var0[0];
                     q = GO.k;
                     K = GO.F2;
                     s = false;
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var3 < var6) {
                     continue label21;
                  }

                  var5 = "| ×/hÉx$ö\u0085\\ºhÉxé";
                  var6 = "| ×/hÉx$ö\u0085\\ºhÉxé".length();
                  var3 = 0;
            }

            byte var10 = var3;
            var3 += 8;
            var7 = var5.substring(var10, var3).getBytes("ISO-8859-1");
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





