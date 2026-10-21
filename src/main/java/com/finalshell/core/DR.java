package com.finalshell.core;

import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;

public final class DR {
   public static boolean u;
   public static boolean t;
   public static int C;
   public static boolean g;
   public static int L;
   public static boolean Z;
   public static boolean P;
   public static Og4 H;
   public static int b;
   public static Insets r;
   public static Insets A;
   public static String Y;
   public static Font W;
   public static Color G;
   public static int y;
   public static boolean K;

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var1 = 4164159327288047597L;
      long[] var0 = new long[3];
      int var4 = 0;
      String var5 = "ó\u0003{Us\"7Mº\u009c'\u008ds\"7M\u0099Ü\t\u0017s\"7ç";
      int var6 = "ó\u0003{Us\"7Mº\u009c'\u008ds\"7M\u0099Ü\t\u0017s\"7ç".length();
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

      u = GO.d;
      t = GO.X;
      C = GO.Fx;
      g = GO.Fe;
      L = GO.FG;
      Z = true;
      P = false;
      H = null;
      b = GO.FJ;
      r = new Insets(0, 0, 0, 0);
      A = new Insets(2, 2, 2, 2);
      Y = null;
      W = null;
      G = new Color((int)var0[1], (int)var0[0], (int)var0[0]);
      y = (int)var0[2];
      K = true;
   }
}





