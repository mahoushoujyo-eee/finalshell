package com.finalshell.core;

public class Vu2 {
   public static long[] a;
   public static Integer[] b;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static long e(byte[] var0, int var1) {
      String var10000 = Cl4.C();
      int var3 = a(1589, 2385274455274334514L);
      String var2 = var10000;
      int var4 = 0;
      int var5 = 0;
      int var6 = 0;
      if (var2 == null) {
         var5 <<= a(3297, 4719950997848957925L);
         var4 = var0[var6 + var1] & var3;
         var5 |= var4;
         var6++;
      }

      while (true) {
         while (var6 < a(3297, 4719950997848957925L)) {
            var5 <<= a(3297, 4719950997848957925L);
            var4 = var0[var6 + var1] & var3;
            var5 |= var4;
            var6++;
         }

         if (var2 != null) {
            return (long)var5;
         }

         var5 = var5;
         var6++;
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void b(long var0, byte[] var2, int var3) {
      String var10000 = Cl4.C();
      int var5 = 0;
      String var4 = var10000;
      if (var4 == null) {
         var2[var5 + var3] = (byte)((int)(var0 >>> a(10131, 5688717031499860117L) - var5 * a(3816, 4659752291215090157L)));
         var5++;
      }

      while (true) {
         while (var5 < a(3297, 4719950997848957925L)) {
            var2[var5 + var3] = (byte)((int)(var0 >>> a(10131, 5688717031499860117L) - var5 * a(3816, 4659752291215090157L)));
            var5++;
         }

         if (var4 != null) {
            return;
         }

         var5++;
      }
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 12037;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 3166450340239150854L;
      long[] var6 = new long[4];
      int var3 = 0;
      String var4 = "\u009eÓqqëî®ã\u0005JÈ\u0085\b×,ë";
      int var5 = "\u009eÓqqëî®ã\u0005JÈ\u0085\b×,ë".length();
      byte var2 = 0;

      label20:
      while (true) {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
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

                  var4 = "\u0092àNgf®&Ë\u0091é,LÒ\u009d\u0007«";
                  var5 = "\u0092àNgf®&Ë\u0091é,LÒ\u009d\u0007«".length();
                  var2 = 0;
            }

            byte var10 = var2;
            var2 += 8;
            var7 = var4.substring(var10, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
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





