package com;

import java.awt.Color;

public final class xu_4 {
   public static boolean L;
   public static boolean m;
   public static boolean e;
   public static Color H;
   public static Color T;

   static {
      long var1 = 6090014267733229659L;
      long[] var0 = new long[2];
      int var4 = 0;
      String var5 = "!\t\bNÑLÀ?\u007f\tð\u008dÑLÀ\u0093";
      int var6 = "!\t\bNÑLÀ?\u007f\tð\u008dÑLÀ\u0093".length();
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

      L = true;
      m = false;
      e = true;
      H = new Color(0, 0, (int)var0[1]);
      T = new Color((int)var0[0], 0, 0);
   }
}





