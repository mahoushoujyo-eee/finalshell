package com;

public class Kb_2 {
   private long X;
   private long f;
   private long d;
   private long p;
   private long Y;
   private long e;
   private long h;
   private long J;
   private long F;
   private long l;
   private long C;
   int y = 0;
   String[] A = null;
   private static final long[] a;
   private static final Long[] b;

   private Kb_2() {
   }

   static com.Kb_2 M(uJ var0) {
      boolean var10000 = com.dm_4.F();
      com.Kb_2 var2 = new com.Kb_2();
      boolean var1 = var10000;
      var2.X = var0.E();
      var2.f = var0.E();
      var2.d = var0.E();
      var2.p = var0.E();
      var2.Y = var0.E();
      var2.e = var0.E();
      var2.h = var0.E();
      var2.J = var0.E();
      var2.F = var0.E();
      int var3 = (int)var0.E();
      com.Kb_2 var4 = var2;
      long var10001 = var0.E();
      if (var1) {
         var2.C = var10001;
         var4 = var2;
         var10001 = (var3 & 1) != 0 ? 1L : 0L;
      }

      var4.l = var10001;
      var2.l = var2.l | ((var3 & 2) != 0 ? a(29245, 3200391072197851743L) : 0L);
      return var2;
   }

   public long D() {
      return this.X;
   }

   public long f() {
      return this.f;
   }

   public long S() {
      return this.d;
   }

   public long N() {
      return this.p;
   }

   public long s() {
      return this.Y;
   }

   public long n() {
      return this.e;
   }

   public long L() {
      return this.h;
   }

   public long X() {
      return this.J;
   }

   public long F() {
      return this.F;
   }

   public long d() {
      return this.l;
   }

   public long E() {
      return this.C;
   }

   public long Q() {
      return this.f() * this.S() / a(12795, 1337430774706076059L);
   }

   public long M() {
      return this.f() * (this.S() - this.N()) / a(12795, 1337430774706076059L);
   }

   public long I() {
      return this.f() * this.s() / a(30493, 8706715592798977918L);
   }

   public long O() {
      return this.f() * this.N() / a(12795, 1337430774706076059L);
   }

   public int K() {
      return (int)(a(446, 4609752892715813343L) * (this.S() - this.N()) / this.S());
   }

   static {
      long var0 = 1096083076228466353L;
      long[] var6 = new long[4];
      int var3 = 0;
      String var4 = "wâfs·É}Ï#\\\u0003yjE|ì";
      int var5 = "wâfs·É}Ï#\\\u0003yjE|ì".length();
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
                     b = new Long[4];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "0Ï0\u0015:M\u008f\n\u001d¹\u0093ô<í»*";
                  var5 = "0Ï0\u0015:M\u008f\n\u001d¹\u0093ô<í»*".length();
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

   private static long a(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 18531) & 32767;
      if (b[var3] == null) {
         b[var3] = a[var3] ^ var1;
      }

      return b[var3];
   }
}





