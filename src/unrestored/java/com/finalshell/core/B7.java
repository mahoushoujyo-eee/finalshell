package com.finalshell.core;

import com.finalshell.ui.model.PI3;
import com.finalshell.ui.model.WF;
import java.awt.Color;

public final class B7 {
   public static int r;
   public static long T;
   public static int e;
   public static int W;
   public static WF s;
   public static boolean D;
   public static int M;
   public static boolean Y;
   public static int t;
   public static int v;
   public static int U;
   public static int a;
   public static PI3 l;
   public static int j;
   public static Color b;
   public static Color z;
   public static Color E;
   public static Color I;
   public static Color d;
   public static Color o;
   public static float Z;

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var5 = 4207399181138835786L;
      long[] var4 = new long[5];
      int var8 = 0;
      String var9 = "\u008ePRÖt\f¹Rø¼J\u00adt\f¹BpY]\u0013t\f¹M";
      int var10 = "\u008ePRÖt\f¹Rø¼J\u00adt\f¹BpY]\u0013t\f¹M".length();
      byte var7 = 0;

      label21:
      while (true) {
         int var10001 = var7;
         var7 += 8;
         byte[] var11 = var9.substring(var10001, var7).getBytes("ISO-8859-1");
         long[] var10000 = var4;
         var10001 = var8++;
         long var10002 = ((long)var11[0] & 255L) << 56
            | ((long)var11[1] & 255L) << 48
            | ((long)var11[2] & 255L) << 40
            | ((long)var11[3] & 255L) << 32
            | ((long)var11[4] & 255L) << 24
            | ((long)var11[5] & 255L) << 16
            | ((long)var11[6] & 255L) << 8
            | (long)var11[7] & 255L;
         byte var10003 = -1;

         while (true) {
            long var19 = var10002 ^ var5;
            switch (var10003) {
               case 0:
                  var10000[var10001] = var19;
                  if (var7 >= var10) {
                     long var2 = 7203502841893355756L;
                     var10002 = 7203502841893355556L ^ var2;
                     byte var15 = -1;
                     long var0 = var10002;
                     r = (int)var4[0];
                     T = var0;
                     e = (int)var4[1];
                     W = (int)var4[2];
                     s = null;
                     D = true;
                     M = (int)var4[3];
                     Y = true;
                     t = GO.T;
                     v = 0;
                     U = (int)var4[4];
                     a = GO.FT;
                     l = PI3.gradient;
                     j = 0;
                     b = Color.GRAY;
                     z = null;
                     E = Color.BLACK;
                     I = Color.BLACK;
                     d = GO.Fi;
                     o = Color.BLACK;
                     Z = GO.FL;
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var19;
                  if (var7 < var10) {
                     continue label21;
                  }

                  var9 = "J\u001cè\u0014t\f¹AC\u0006\u007f\u0090t\f¹O";
                  var10 = "J\u001cè\u0014t\f¹AC\u0006\u007f\u0090t\f¹O".length();
                  var7 = 0;
            }

            byte var14 = var7;
            var7 += 8;
            var11 = var9.substring(var14, var7).getBytes("ISO-8859-1");
            var10000 = var4;
            var10001 = var8++;
            var10002 = ((long)var11[0] & 255L) << 56
               | ((long)var11[1] & 255L) << 48
               | ((long)var11[2] & 255L) << 40
               | ((long)var11[3] & 255L) << 32
               | ((long)var11[4] & 255L) << 24
               | ((long)var11[5] & 255L) << 16
               | ((long)var11[6] & 255L) << 8
               | (long)var11[7] & 255L;
            var10003 = 0;
         }
      }
   }
}





