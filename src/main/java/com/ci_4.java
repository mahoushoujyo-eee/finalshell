package com;

import java.awt.Color;
import java.awt.Insets;

public final class ci_4 {
   public static Color S;
   public static Color s;
   public static boolean I;
   public static int O;
   public static int M;
   public static Insets p;
   public static boolean H;
   public static boolean e;

   static {
      long var1 = 9106272956191526278L;
      long[] var0 = new long[2];
      int var4 = 0;
      String var5 = "»êA\u008e\u00ad\u008aÍ,ù\u0013wS\u00ad\u008aÍ,";
      int var6 = "»êA\u008e\u00ad\u008aÍ,ù\u0013wS\u00ad\u008aÍ,".length();
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

      S = Color.LIGHT_GRAY;
      s = new Color((int)var0[1], (int)var0[0], (int)var0[0]);
      I = GO.d;
      O = GO.Fx;
      M = GO.FG;
      p = GO.P;
      H = false;
      e = false;
   }
}





