package com.finalshell.ui.model;

import com.finalshell.core.XP;

public final class Pg4 extends PG3 {
   public static long[] c;
   public static Integer[] d;

   public Pg4(String var1, int var2, int[] var3) {
      super(var1, var2, var3, null);
   }

   @Override
   public int Q(int var1) {
      int[] var2 = XP.j();
      int var10000 = var1;
      if (var2 == null) {
         if (var1 >= 0) {
            if (var2 != null) {
               return var1;
            }

            if (var1 < b(16144, 8994744429341408166L)) {
               return var1 + b(10461, 5023130324026158186L);
            }
         }

         var10000 = -1;
      }

      return var10000;
   }

   static {
      __vfClinit__();
   }

   public static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 17590;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   public static void __vfClinit__() {
      long var0 = 2447578143541855401L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "\u000eîø\u0084q\u0083ÿO\u008aØ6\u0019\rÀèc";
      int var5 = "\u000eîø\u0084q\u0083ÿO\u008aØ6\u0019\rÀèc".length();
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

      c = var6;
      d = new Integer[2];
   }
}





