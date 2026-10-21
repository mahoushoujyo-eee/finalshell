package com.finalshell.core;

import com.finalshell.ui.model.PI3;
import java.awt.Color;
import javax.swing.SwingConstants;

public final class C5 implements SwingConstants {
   public static int h;
   public static int Z;
   public static boolean k;
   public static Color g;
   public static boolean b;
   public static PI3 R;
   public static int d;
   public static int s;
   public static float x;
   public static float y;
   public static boolean J;
   public static boolean N;
   public static float r;
   public static boolean t;
   public static float B;
   public static boolean L;
   public static float V;

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var1 = 7780760258254787138L;
      long[] var0 = new long[4];
      int var4 = 0;
      String var5 = "øì÷.\u000bÀÒ½\b\u0015ád\u000bÀÒA";
      int var6 = "øì÷.\u000bÀÒ½\b\u0015ád\u000bÀÒA".length();
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
                     h = 0;
                     Z = 0;
                     k = true;
                     g = new Color((int)var0[0], (int)var0[2], (int)var0[2], (int)var0[3]);
                     b = true;
                     R = PI3.gradient;
                     d = (int)var0[1];
                     s = GO.FY;
                     x = 0.5F;
                     y = 0.5F;
                     J = false;
                     N = false;
                     r = 3.0F;
                     t = false;
                     B = 0.3F;
                     L = false;
                     V = 0.2F;
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var3 < var6) {
                     continue label21;
                  }

                  var5 = "ï\u0099\u001b{\u000bÀÒ½vs{õ\u000bÀÒÂ";
                  var6 = "ï\u0099\u001b{\u000bÀÒ½vs{õ\u000bÀÒÂ".length();
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





