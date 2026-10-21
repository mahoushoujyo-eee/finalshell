package com.finalshell.core;

import java.awt.Color;
import java.awt.Stroke;

public final class Eb2 {
   public static Color M;
   public static Stroke L;
   public static int m;
   public static int i;

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var1 = 2936010967133830468L;
      long[] var0 = new long[4];
      int var4 = 0;
      String var5 = "\u0016\u0083GP@©½A\u0082 ³Ý@©½\u0098";
      int var6 = "\u0016\u0083GP@©½A\u0082 ³Ý@©½\u0098".length();
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
                     M = new Color((int)var0[2], (int)var0[1], (int)var0[1]);
                     L = null;
                     m = (int)var0[0];
                     i = (int)var0[3];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var3 < var6) {
                     continue label21;
                  }

                  var5 = "^\u0096ó\u0010@©½\u0098ÍâçÄ@©½@";
                  var6 = "^\u0096ó\u0010@©½\u0098ÍâçÄ@©½@".length();
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





