package com.finalshell.core;

import java.net.DatagramPacket;

public class Vf2 extends Vb2 {
   public short g = BN.I;
   byte[] W;
   int r;
   public static long[] a;
   public static Integer[] b;

   public Vf2(int var1, int var2, int var3) {
      this.W = new byte[a(31623, 3560000825793062218L)];
      Nb2_2.s(this.V, this.W, 0);
      Nb2_2.s(this.g, this.W, 2);
      CN3.P(var1, this.W, 4);
      CN3.P(var2, this.W, a(26635, 1623351260510533312L));
      CN3.P(var3, this.W, a(12340, 1231610951609511676L));
      this.O = new DatagramPacket(this.W, this.W.length);
   }

   public Vf2(DatagramPacket var1) {
      this.W = new byte[a(8232, 4250574554732068577L)];
      this.O = var1;
      this.W = var1.getData();
      this.V = Nb2_2.Q(this.W, 0);
      this.g = Nb2_2.Q(this.W, 2);
      this.p = CN3.m(this.W, 4);
      this.x = CN3.m(this.W, a(3019, 3479991318924547329L));
      this.r = CN3.m(this.W, a(5597, 1318463303062342417L));
   }

   public int R() {
      return this.r;
   }

   public void H(int var1) {
      this.r = var1;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 24265;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 1082900346347092124L;
      long[] var6 = new long[6];
      int var3 = 0;
      String var4 = "\u0019Gæ\u000eÝ4\u0006m\u0081\u0088\u000e°?\u0000\u0016l×î7¼{CÎT\u0013[ÃJ\u0016Ú\u00ad\u0095";
      int var5 = "\u0019Gæ\u000eÝ4\u0006m\u0081\u0088\u000e°?\u0000\u0016l×î7¼{CÎT\u0013[ÃJ\u0016Ú\u00ad\u0095".length();
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

                  var4 = "[UºÒ\nT]ÆÄìÆPÛA3\u0081";
                  var5 = "[UºÒ\nT]ÆÄìÆPÛA3\u0081".length();
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





