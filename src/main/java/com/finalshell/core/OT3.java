package com.finalshell.core;

import com.finalshell.ui.model.PI3;
import java.awt.Color;
import java.awt.Insets;

public final class OT3 {
   public static int U;
   public static PI3 Q;
   public static int E;
   public static Color g;
   public static Color e;
   public static Color c;
   public static Color T;
   public static Color O;
   public static Insets o;
   public static boolean F;

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var1 = 1197747482719638445L;
      long[] var0 = new long[2];
      int var4 = 0;
      String var5 = "\u0014%\u008d<V\u001fS¥ÞNè_V\u001fS©";
      int var6 = "\u0014%\u008d<V\u001fS¥ÞNè_V\u001fS©".length();
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

      U = (int)var0[0];
      Q = PI3.gradient;
      E = (int)var0[1];
      g = GO.Ff;
      e = GO.FX;
      c = GO.FR;
      T = GO.Q;
      O = GO.Ft;
      o = new Insets(2, 5, 2, 5);
      F = false;
   }
}





