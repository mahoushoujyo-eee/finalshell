package com.finalshell.core;

import com.finalshell.ui.model.Ij4;
import com.finalshell.ui.model.So2;
import java.awt.Color;
import java.awt.Insets;

public final class E_2_2 {
   public static Ij4 V;
   public static Color s;
   public static Color Y;
   public static Color g;
   public static Color l;
   public static int b;
   public static int Z;
   public static boolean C;
   public static Insets j;
   public static Insets r;
   public static Og4 h;
   public static int R;
   public static int U;
   public static So2 u;
   public static Color f;
   public static Color m;
   public static boolean P;
   public static boolean k;
   public static Color e;
   public static boolean O;

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var1 = 6034722658978188568L;
      long[] var0 = new long[4];
      int var4 = 0;
      String var5 = "\u008f\u0011*âöeMÈ\u009aø=9öeMÈ";
      int var6 = "\u008f\u0011*âöeMÈ\u009aø=9öeMÈ".length();
      byte var3 = 0;

      label21:
      while (true) {
         int var10001 = var3;
         var3 += 8;
         byte[] var7 = var5.substring(var10001, var3).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
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
                     V = Ij4.standalone;
                     s = new Color((int)var0[2], (int)var0[3], (int)var0[3]);
                     Y = new Color((int)var0[0], (int)var0[1], (int)var0[1]);
                     g = Color.WHITE;
                     l = GO.R;
                     b = GO.Fx;
                     Z = GO.FG;
                     C = false;
                     j = new Insets(0, 0, 0, 0);
                     r = new Insets(3, 4, 3, 4);
                     h = null;
                     R = 0;
                     U = 1;
                     u = So2.multiline;
                     f = GO.Ff;
                     m = Color.GRAY;
                     P = false;
                     k = false;
                     e = GO.R;
                     O = false;
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var3 < var6) {
                     continue label21;
                  }

                  var5 = "#$c\u0019öeMûº\u009bªàöeMû";
                  var6 = "#$c\u0019öeMûº\u009bªàöeMû".length();
                  var3 = 0;
            }

            byte var10 = var3;
            var3 += 8;
            var7 = var5.substring(var10, var3).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
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





