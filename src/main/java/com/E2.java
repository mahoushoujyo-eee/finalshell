package com;

import java.awt.Color;

public final class E2 {
   public static boolean c;
   public static xh_4 G;
   public static Color N;
   public static Color d;
   public static int K;
   public static int M;
   public static float e;
   public static int o;
   public static float W;

   static {
      long var1 = 3442260992371452571L;
      long[] var0 = new long[4];
      int var4 = 0;
      String var5 = "é§ªVz{ê\u001b>Ãòìz{ê\u008f";
      int var6 = "é§ªVz{ê\u001b>Ãòìz{ê\u008f".length();
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
                     c = true;
                     G = xh_4.componentSide;
                     N = new Color((int)var0[0], (int)var0[3], (int)var0[3], (int)var0[3]);
                     d = Color.WHITE;
                     K = GO.FT;
                     M = (int)var0[1];
                     e = 0.75F;
                     o = (int)var0[2];
                     W = 0.95F;
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var3 < var6) {
                     continue label21;
                  }

                  var5 = "\u001a\u0091w\u008az{ê\u0091¿ò\u000eîz{ê\u001b";
                  var6 = "\u001a\u0091w\u008az{ê\u0091¿ò\u000eîz{ê\u001b".length();
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





