package com.finalshell.core;

public final class Cl4 {
   public static String K;
   public static long[] a;
   public static Integer[] b;

   public static byte[] M(short var0, byte[] var1, int var2) {
      var1[var2] = (byte)(var0 >> a(2129, 368463105497322389L));
      var1[var2 + 1] = (byte)(var0 >> 0);
      return var1;
   }

   public static short N(byte[] var0, int var1) {
      return (short)(var0[var1] << a(4796, 5086392563023726970L) | var0[var1 + 1] & a(6757, 3199289524427342242L));
   }

   public static byte[] T(int var0, byte[] var1, int var2) {
      var1[var2] = (byte)(var0 >> a(4796, 5086392563023726970L));
      var1[var2 + 1] = (byte)(var0 >> 0);
      return var1;
   }

   public static int i(byte[] var0, int var1) {
      int var2 = 0;
      var2 |= var0[var1 + 0] & a(3663, 7935834255880902026L);
      var2 <<= a(4796, 5086392563023726970L);
      return var2 | var0[var1 + 1] & a(3663, 7935834255880902026L);
   }

   public static void F(String var0) {
      K = var0;
   }

   public static String C() {
      return K;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 23493;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 8015461099186292630L;
      long[] var6 = new long[4];
      int var3 = 0;
      F("hbR5r");
      String var4 = "4Æ\u0017\u0083]ÞRã÷ñ\u0091Æã÷T\u000b";
      int var5 = "4Æ\u0017\u0083]ÞRã÷ñ\u0091Æã÷T\u000b".length();
      byte var2 = 0;

      label20:
      while (true) {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         long[] var10000 = var6;
         var10001 = var3++;
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
            long var13 = var10002 ^ var0;
            switch (var10003) {
               case 0:
                  var10000[var10001] = var13;
                  if (var2 >= var5) {
                     a = var6;
                     b = new Integer[4];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "É\u0016æbÒèÆËçºþß´ÁÎä";
                  var5 = "É\u0016æbÒèÆËçºþß´ÁÎä".length();
                  var2 = 0;
            }

            byte var10 = var2;
            var2 += 8;
            var7 = var4.substring(var10, var2).getBytes("ISO-8859-1");
            var10000 = var6;
            var10001 = var3++;
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





