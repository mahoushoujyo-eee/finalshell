package com.finalshell.core;

import java.awt.Color;
import java.awt.Insets;

public final class SG {
   public static Color Y;
   public static Color k;
   public static Color K;
   public static Color h;
   public static Color S;
   public static boolean P;
   public static Color N;
   public static boolean j;
   public static boolean q;
   public static boolean F;
   public static boolean e;
   public static int t;
   public static int T;
   public static int d;
   public static Insets Z;
   public static Color p;
   public static int Q;
   public static Color f;
   public static Color J;
   public static int H;
   public static int M;
   public static boolean C;
   public static float U;
   public static boolean G;
   public static boolean i;
   public static boolean w;
   public static boolean g;
   public static Og4 B;
   public static boolean m;

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var1 = 4536603926221419544L;
      long[] var0 = new long[4];
      int var4 = 0;
      String var5 = "E'7ú%\u0011ôÊÁ\u0097FÆ%\u0011ô¬";
      int var6 = "E'7ú%\u0011ôÊÁ\u0097FÆ%\u0011ô¬".length();
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
                     Y = GO.FR;
                     k = GO.Q;
                     K = GO.Ft;
                     h = new Color((int)var0[0], (int)var0[2], (int)var0[2]);
                     S = GO.O;
                     P = false;
                     N = GO.s;
                     j = GO.F2;
                     q = GO.Fe;
                     F = GO.Fb;
                     e = GO.w;
                     t = 0;
                     T = GO.Fx;
                     d = GO.FG;
                     Z = GO.P;
                     p = GO.r;
                     Q = GO.f;
                     f = GO.FB;
                     J = new Color((int)var0[3], (int)var0[1], (int)var0[1]);
                     H = GO.I;
                     M = 0;
                     C = GO.H;
                     U = GO.U;
                     G = GO.X;
                     i = GO.Fg;
                     w = GO.k;
                     g = GO.Fl;
                     B = null;
                     m = true;
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var3 < var6) {
                     continue label21;
                  }

                  var5 = "<|¤\u0006%\u0011ôÊW¸&a%\u0011ô¬";
                  var6 = "<|¤\u0006%\u0011ôÊW¸&a%\u0011ô¬".length();
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





