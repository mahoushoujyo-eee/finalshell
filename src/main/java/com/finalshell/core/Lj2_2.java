package com.finalshell.core;

import java.awt.Color;
import java.awt.Insets;

public final class Lj2_2 {
   public static Insets U;
   public static int s;
   public static int G;
   public static int o;
   public static int H;
   public static int B;
   public static int c;
   public static int a;
   public static Color w;
   public static Color D;
   public static boolean z;
   public static int I;
   public static int r;
   public static int K;
   public static int S;
   public static boolean F;
   public static com.finalshell.ui.model.OB3 l;

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var1 = 3139518932106630126L;
      long[] var0 = new long[9];
      int var4 = 0;
      String var5 = "\rý-±¹ÔSç3\u008bb%¹ÔSê<\f±2¹ÔSêçl5\u007f¹ÔSäª¦î\u0011¹ÔSäëÏRí¹ÔSæÉ¹\u0099e¹ÔSí";
      int var6 = "\rý-±¹ÔSç3\u008bb%¹ÔSê<\f±2¹ÔSêçl5\u007f¹ÔSäª¦î\u0011¹ÔSäëÏRí¹ÔSæÉ¹\u0099e¹ÔSí".length();
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
                     U = new Insets(5, 5, 5, 5);
                     s = GO.FG;
                     G = (int)var0[8];
                     o = (int)var0[7];
                     H = (int)var0[0];
                     B = (int)var0[2];
                     c = (int)var0[5];
                     a = (int)var0[6];
                     w = Color.GRAY;
                     D = Color.LIGHT_GRAY;
                     z = true;
                     I = 0;
                     r = (int)var0[4];
                     K = (int)var0[1];
                     S = (int)var0[3];
                     F = true;
                     l = com.finalshell.ui.model.OB3.step;
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var3 < var6) {
                     continue label21;
                  }

                  var5 = "¢\u009e°\u008c¹ÔSéøq\u0000N¹ÔSà";
                  var6 = "¢\u009e°\u008c¹ÔSéøq\u0000N¹ÔSà".length();
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





