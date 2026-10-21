package com.finalshell.core;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Insets;
import java.awt.Stroke;

public final class C_Q {
   public static Color r;
   public static Color X;
   public static Color B;
   public static Color Q;
   public static Color D;
   public static Color d;
   public static Color H;
   public static int l;
   public static int a;
   public static Insets I;
   public static boolean v;
   public static boolean L;
   public static Stroke t;
   public static int S;
   public static int Y;

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var1 = 7781003669659131827L;
      long[] var0 = new long[2];
      int var4 = 0;
      String var5 = "Ñq\u0088¥®\u000b\u001f£P7\u0015+®\u000b\u001f£";
      int var6 = "Ñq\u0088¥®\u000b\u001f£P7\u0015+®\u000b\u001f£".length();
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

      r = GO.N;
      X = GO.Ff;
      B = GO.FX;
      Q = GO.FR;
      D = GO.Q;
      d = GO.Fm;
      H = GO.Fo;
      l = GO.Fx;
      a = GO.FG;
      I = GO.P;
      v = GO.k;
      L = GO.F2;
      t = new BasicStroke(1.5F);
      S = (int)var0[1];
      Y = (int)var0[0];
   }
}





