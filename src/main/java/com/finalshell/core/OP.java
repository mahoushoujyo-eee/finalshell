package com.finalshell.core;

import java.awt.Color;
import java.awt.Insets;

public final class OP {
   public static Insets c;
   public static int L;
   public static int b;
   public static int T;
   public static Color l;
   public static Color G;
   public static Color I;
   public static Color x;
   public static Color R;
   public static Color S;
   public static Color M;
   public static int v;
   public static int E;
   public static boolean o;
   public static int J;
   public static Og4 P;

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var1 = 2031567432404528262L;
      long[] var0 = new long[18];
      int var4 = 0;
      String var5 = "ëýÛ9é¹lVº7¸Òé¹l<Ã\u0096k~é¹lN+ÀjÙé¹l`W\u008e±\u0003é¹lB\"mj\u001aé¹l,\u0081\bèaé¹l\u0089Á\\Üàé¹lÜÀ\u001eA2é¹l\u0081`Ð¡]é¹l,\r\u0006\u009dFé¹l`ÜFì¨é¹lÜÿìÓ¬é¹l@jµ}\u009bé¹lysX\u0084Úé¹lZÊGø!é¹lB";
      int var6 = "ëýÛ9é¹lVº7¸Òé¹l<Ã\u0096k~é¹lN+ÀjÙé¹l`W\u008e±\u0003é¹lB\"mj\u001aé¹l,\u0081\bèaé¹l\u0089Á\\Üàé¹lÜÀ\u001eA2é¹l\u0081`Ð¡]é¹l,\r\u0006\u009dFé¹l`ÜFì¨é¹lÜÿìÓ¬é¹l@jµ}\u009bé¹lysX\u0084Úé¹lZÊGø!é¹lB"
         .length();
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
                     c = GO.P;
                     L = Cq4.N;
                     b = GO.Fx;
                     T = GO.FG;
                     l = Color.LIGHT_GRAY;
                     G = new Color((int)var0[3], (int)var0[10], (int)var0[14]);
                     I = new Color((int)var0[17], (int)var0[0], (int)var0[12]);
                     x = new Color((int)var0[15], (int)var0[4], (int)var0[1]);
                     R = new Color((int)var0[11], (int)var0[7], (int)var0[7]);
                     S = new Color((int)var0[5], (int)var0[9], (int)var0[9]);
                     M = new Color((int)var0[16], (int)var0[13], (int)var0[13], (int)var0[2]);
                     v = (int)var0[8];
                     E = (int)var0[6];
                     o = true;
                     J = 0;
                     P = null;
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var3 < var6) {
                     continue label21;
                  }

                  var5 = "û}Ë[é¹ly\u0093\u009aC©é¹lV";
                  var6 = "û}Ë[é¹ly\u0093\u009aC©é¹lV".length();
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





