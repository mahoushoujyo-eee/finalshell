package com.finalshell.core;
import com.finalshell.reflect.Ref;

import com.finalshell.reflect.Registry;

public class FI3 {
   public int O;
   public int J;
   public int p;
   public static long[] a;
   public static Integer[] b;

   public FI3() {
      Ref.setInt(159182436745269625L, this, a(24154, 1811965513138010724L));
      Ref.s(338712996592055778L, this, 1);
      Ref.setInt(624230168042117742L, this, a(23512, 4554476906064281575L));
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 9278;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 832076526935242639L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "r\u0080ÔÔæ(z«÷6Û0ÞD\bm";
      int var5 = "r\u0080ÔÔæ(z«÷6Û0ÞD\bm".length();
      byte var2 = 0;

      do {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
         var10001 = var3++;
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
            ^ var0;
         byte var10003 = -1;
         var6[var10001] = var10004;
      } while (var2 < var5);

      a = var6;
      b = new Integer[2];
   }
}





