package com.finalshell.core;

import com.finalshell.ui.model.LS;
import java.awt.Color;
import java.awt.Insets;

public final class NJ3 {
   public static Color m;
   public static Color o;
   public static Color I;
   public static Color r;
   public static boolean i;
   public static int f;
   public static int k;
   public static Insets s;
   public static int R;
   public static LS x;
   public static Og4 t;

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var1 = 6273336424357238553L;
      long[] var0 = new long[6];
      int var4 = 0;
      String var5 = "À7èç\u008aU\u0017ü\u0086G\u0092\u0095\u008aU\u0017\u008eô\u0085Py\u008aU\u0017ð¬©\u0096\u0081\u008aU\u0017\u0089";
      int var6 = "À7èç\u008aU\u0017ü\u0086G\u0092\u0095\u008aU\u0017\u008eô\u0085Py\u008aU\u0017ð¬©\u0096\u0081\u008aU\u0017\u0089".length();
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
                     m = Color.WHITE;
                     o = new Color((int)var0[0], (int)var0[2], (int)var0[4]);
                     I = new Color((int)var0[5], (int)var0[3], (int)var0[1]);
                     r = GO.FX;
                     i = false;
                     f = GO.Y;
                     k = GO.FG;
                     s = new Insets(1, 1, 1, 1);
                     R = GO.FV;
                     x = LS.standalone;
                     t = null;
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var3 < var6) {
                     continue label21;
                  }

                  var5 = "\u000e\u0002\u008fÀ\u008aU\u0017÷ÎÉÉ\u0092\u008aU\u0017\u0092";
                  var6 = "\u000e\u0002\u008fÀ\u008aU\u0017÷ÎÉÉ\u0092\u008aU\u0017\u0092".length();
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





