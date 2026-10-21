package com.finalshell.core;

import java.net.DatagramPacket;

public class Wr2 extends WC {
   short q = D6.L;
   int J;
   int P;
   byte[] h;
   int n;
   byte[] i;
   public static long[] a;
   public static Integer[] b;

   public Wr2(int var1, int var2, int var3, byte[] var4) {
      this.i = new byte[a(7106, 7219922101616451607L) + var4.length];
      this.n = var2;
      this.J = var1;
      this.P = var3;
      this.h = var4;
      B8.P(this.W, this.i, 0);
      B8.P(this.q, this.i, 2);
      LH3_2.u(var1, this.i, 4);
      LH3_2.u(var2, this.i, a(5848, 1430400230651243785L));
      LH3_2.u(var3, this.i, a(7960, 1235124188661916876L));
      System.arraycopy(var4, 0, this.i, a(1828, 7094500031115377906L), var4.length);
   }

   public Wr2(DatagramPacket var1) {
      this.g = var1;
      byte[] var2 = var1.getData();
      this.W = B8.M$short(var2, 0);
      this.q = B8.M$short(var2, 2);
      this.J = LH3_2.z(var2, 4);
      this.n = LH3_2.z(var2, a(551, 6793511191555783152L));
      this.P = LH3_2.z(var2, a(26630, 404114103843410902L));
      int var3 = var1.getLength() - a(1828, 7094500031115377906L);
      this.h = new byte[var3];
      System.arraycopy(var2, a(1828, 7094500031115377906L), this.h, 0, var3);
   }

   public int Y() {
      return this.J;
   }

   public void r(int var1) {
      this.J = var1;
   }

   public int i() {
      return this.P;
   }

   public void N(int var1) {
      this.P = var1;
   }

   public byte[] M() {
      return this.h;
   }

   public void d(byte[] var1) {
      this.h = var1;
   }

   public byte[] B() {
      return this.i;
   }

   public void A(byte[] var1) {
      this.i = var1;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 15317;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 7921375694230284018L;
      long[] var6 = new long[6];
      int var3 = 0;
      String var4 = "b¤4Í\u008fÕFõTT\u0084ÀU\u00adÂ2Ê\u0013ç¹åPß\n\u009eP?½&£Z\u0010";
      int var5 = "b¤4Í\u008fÕFõTT\u0084ÀU\u00adÂ2Ê\u0013ç¹åPß\n\u009eP?½&£Z\u0010".length();
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
                     b = new Integer[6];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "\u0081¤\u0014öá\u0098Ëó\u0094-úÜkMµ(";
                  var5 = "\u0081¤\u0014öá\u0098Ëó\u0094-úÜkMµ(".length();
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





