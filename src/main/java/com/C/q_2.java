package com.C;

import com.GO;
import java.awt.Color;

public final class q_2 {
   public static com.C.M k;
   public static Color V;
   public static int o;
   public static int n;
   public static float w;
   public static int W;
   public static float L;

   static {
      long var1 = 5864627057702841633L;
      long[] var0 = new long[4];
      int var4 = 0;
      String var5 = "ì»âÓ¢\u0085\u00ad'\u0094#ÙÑ¢\u0085\u00ad-";
      int var6 = "ì»âÓ¢\u0085\u00ad'\u0094#ÙÑ¢\u0085\u00ad-".length();
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
                     k = com.C.M.dropdown;
                     V = new Color((int)var0[2], (int)var0[3], (int)var0[3], (int)var0[3]);
                     o = GO.FT;
                     n = (int)var0[1];
                     w = 0.75F;
                     W = (int)var0[0];
                     L = 0.95F;
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var3 < var6) {
                     continue label21;
                  }

                  var5 = "Èl\u008f¡¢\u0085\u00ad¡¦\u0004\u0011\u009a¢\u0085\u00ad¡";
                  var6 = "Èl\u008f¡¢\u0085\u00ad¡¦\u0004\u0011\u009a¢\u0085\u00ad¡".length();
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





