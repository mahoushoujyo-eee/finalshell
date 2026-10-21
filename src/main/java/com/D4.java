package com;

import java.lang.ref.SoftReference;
import java.nio.charset.CharsetDecoder;

/** @deprecated */
public class D4 {
   private static final ThreadLocal v;
   private static final ThreadLocal u;
   private static final ThreadLocal d;
   private static final long[] a;
   private static final Integer[] b;

   public static CharsetDecoder B() {
      int var10000 = Ph_2.w();
      Object var1 = (CharsetDecoder)u.get();
      int var0 = var10000;
      Object var2 = var1;
      if (var0 != 0) {
         if (var1 == null) {
            var1 = new It_2();
            u.set(var1);
         }

         var2 = var1;
      }

      return (CharsetDecoder)var2;
   }

   public static void v() {
      v.set(null);
   }

   public static char[] j(int var0) {
      int var10000 = Ph_2.u();
      SoftReference var2 = (SoftReference)v.get();
      int var1 = var10000;
      Object var4 = var2;
      if (var1 == 0) {
         if (var2 == null) {
            return q(var0);
         }

         var4 = var2.get();
      }

      char[] var3 = (char[])var4;
      char[] var5 = var3;
      if (var1 == 0) {
         if (var3 == null) {
            return q(var0);
         }

         var5 = var3;
      }

      if (var1 == 0) {
         if (var5.length < var0) {
            var3 = q(var0);
         }

         var5 = var3;
      }

      return var5;
   }

   private static char[] q(int var0) {
      int var1 = Ph_2.w();
      int var10000 = var0;
      int var10001 = a(4205, 146789832753123902L);
      if (var1 != 0) {
         if (var0 > var10001) {
            return new char[var0];
         }

         var10000 = a(30045, 7982684965541672712L);
         var10001 = a(23308, 48716670681831768L);
      }

      int var2 = j(var10000, var10001, var0);
      char[] var3 = new char[var2];
      v.set(new SoftReference<>(var3));
      return var3;
   }

   private static int j(int var0, int var1, int var2) {
      int var3 = Ph_2.w();
      int var10000 = C;
      if (var3 != 0) {
         int var10001;
         label25: {
            if (!C) {
               var10000 = 1 << var1;
               var10001 = var2;
               if (var3 == 0) {
                  break label25;
               }

               if (var10000 < var2) {
                  throw new AssertionError();
               }
            }

            var10000 = var2;
            var10001 = var0;
         }

         var10000 >>>= var10001;
      }

      int var4 = var10000;
      var10000 = var4;
      if (var3 != 0) {
         if (var4 <= 0) {
            return 1 << var0;
         }

         var10000 = 1 << a(12187, 7502342916888735177L) - Integer.numberOfLeadingZeros(var2 - 1);
      }

      return var10000;
   }

   public static void t() {
      d.set(null);
   }

   public static byte[] X(int var0) {
      int var10000 = Ph_2.u();
      SoftReference var2 = (SoftReference)d.get();
      int var1 = var10000;
      Object var4 = var2;
      if (var1 == 0) {
         if (var2 == null) {
            return R(var0);
         }

         var4 = var2.get();
      }

      byte[] var3 = (byte[])var4;
      byte[] var5 = var3;
      if (var1 == 0) {
         if (var3 == null) {
            return R(var0);
         }

         var5 = var3;
      }

      if (var1 == 0) {
         if (var5.length < var0) {
            var3 = R(var0);
         }

         var5 = var3;
      }

      return var5;
   }

   private static byte[] R(int var0) {
      int var1 = Ph_2.u();
      int var10000 = var0;
      int var10001 = a(30312, 3660073804290618425L);
      if (var1 == 0) {
         if (var0 > var10001) {
            return new byte[var0];
         }

         var10000 = a(17560, 8259504185196431054L);
         var10001 = a(31818, 4794798345256074778L);
      }

      int var2 = j(var10000, var10001, var0);
      byte[] var3 = new byte[var2];
      d.set(new SoftReference<>(var3));
      return var3;
   }

   static {
      long var0 = 2925141180149538470L;
      long[] var6 = new long[7];
      int var3 = 0;
      String var4 = "n\u008fâÈ*0`\u00adÈÄ!klØj\u009f\fá\u009e\u0088\u0080ü3OÔ\u0087\u0083HýO\u008c\u0098¦·%\u0094\n\u000fGï";
      int var5 = "n\u008fâÈ*0`\u00adÈÄ!klØj\u009f\fá\u009e\u0088\u0080ü3OÔ\u0087\u0083HýO\u008c\u0098¦·%\u0094\n\u000fGï".length();
      byte var2 = 0;

      label26:
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
                     b = new Integer[7];
                     C = !com.D4.class.desiredAssertionStatus();
                     v = new ThreadLocal();
                     u = new ThreadLocal();
                     d = new ThreadLocal();
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label26;
                  }

                  var4 = "*AÕå\\Xi¤á\u001av\u0013sÒXb";
                  var5 = "*AÕå\\Xi¤á\u001av\u0013sÒXb".length();
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

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 592;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}





