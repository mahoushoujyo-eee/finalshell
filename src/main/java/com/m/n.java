package com.m;

import com.GO;
import java.awt.BasicStroke;
import java.awt.Color;

public final class n {
   public static boolean o;
   public static boolean a;
   public static Color r;
   public static boolean y;
   public static Color g;
   public static boolean A;
   public static Color x;
   public static com.m.T Y;
   public static int Q;
   public static int O;
   public static boolean G;
   public static Color E;
   public static Color W;
   public static int j;
   public static BasicStroke D;
   public static int U;
   public static int F;

   static {
      long var1 = 2306466989437600228L;
      long[] var0 = new long[8];
      int var4 = 0;
      String var5 = "hc\u001fã·\u0097Á\n!\u007f²q·\u0097Á,ÃC\u008dH·\u0097ÁÖ©Á\u0081ê·\u0097Á\u001bÆ,f,·\u0097Á,ú%:{·\u0097Á\n";
      int var6 = "hc\u001fã·\u0097Á\n!\u007f²q·\u0097Á,ÃC\u008dH·\u0097ÁÖ©Á\u0081ê·\u0097Á\u001bÆ,f,·\u0097Á,ú%:{·\u0097Á\n".length();
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
                     o = false;
                     a = true;
                     r = new Color((int)var0[1], (int)var0[4], (int)var0[4]);
                     y = true;
                     g = new Color((int)var0[5], (int)var0[0], (int)var0[0]);
                     A = true;
                     x = Color.GRAY;
                     Y = com.m.T.line;
                     Q = GO.Fx;
                     O = GO.FG;
                     G = true;
                     E = new Color(0, 0, (int)var0[3], (int)var0[2]);
                     W = Color.GRAY;
                     j = GO.Fx;
                     D = new BasicStroke(1.0F, 1, 1, 0.0F, new float[]{3.0F, 3.0F}, 0.0F);
                     U = (int)var0[6];
                     F = (int)var0[7];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var3 < var6) {
                     continue label21;
                  }

                  var5 = "\u0016ñJ\u0089·\u0097Áìþy\u001bÎ·\u0097Áè";
                  var6 = "\u0016ñJ\u0089·\u0097Áìþy\u001bÎ·\u0097Áè".length();
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





