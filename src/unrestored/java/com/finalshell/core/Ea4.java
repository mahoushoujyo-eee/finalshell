package com.finalshell.core;

import com.finalshell.ui.model.Bj2;
import java.awt.Color;

public final class Ea4 {
   public static Color k;
   public static Color E;
   public static boolean V;
   public static int g;
   public static int b;
   public static Bj2 x;
   public static Color d;

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var1 = 955669292193814778L;
      long[] var0 = new long[2];
      int var4 = 0;
      String var5 = "\u008ag²Úkö\u0018\u0011½ë9\u007fkö\u0018\u0011";
      int var6 = "\u008ag²Úkö\u0018\u0011½ë9\u007fkö\u0018\u0011".length();
      byte var3 = 0;

      do {
         int var10001 = var3;
         var3 += 8;
         byte[] var7 = var5.substring(var10001, var3).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
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

      k = GO.FR;
      E = new Color((int)var0[0], (int)var0[1], (int)var0[1]);
      V = false;
      g = GO.FT;
      b = 0;
      x = Bj2.attached;
      d = GO.N;
   }
}





