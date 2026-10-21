package com.finalshell.core;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;

public final class IA {
   public static int t;
   public static int i;
   public static Dimension Y;
   public static Insets X;
   public static boolean W;
   public static Font G;
   public static Color x;

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var1 = 7815911595721060150L;
      long[] var0 = new long[3];
      int var4 = 0;
      String var5 = "Ñ)c&\u0092Ïo=¨~\u009d \u0092Ïo%\u0088è¡o\u0092Ïo\"";
      int var6 = "Ñ)c&\u0092Ïo=¨~\u009d \u0092Ïo%\u0088è¡o\u0092Ïo\"".length();
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

      t = GO.FG;
      i = (int)var0[2];
      Y = new Dimension((int)var0[0], (int)var0[1]);
      X = GO.P;
      W = true;
      G = A9.zD.deriveFont(10.0F);
      x = Color.BLACK;
   }
}





