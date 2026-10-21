package com.finalshell.core;

import java.net.DatagramPacket;

public class Wu2 extends WC {
   public short Q = D6.s;
   public byte[] X;
   public int p;
   public static long[] a;
   public static Integer[] b;

   public Wu2(int var1) {
      this.X = new byte[a(29939, 1766505960135745293L)];
      B8.P(this.W, this.X, 0);
      B8.P(this.Q, this.X, 2);
      LH3_2.u(var1, this.X, 4);
      this.g = new DatagramPacket(this.X, this.X.length);
   }

   public Wu2(DatagramPacket var1) {
      this.X = new byte[a(9739, 6944375963203177972L)];
      this.g = var1;
      this.X = var1.getData();
      this.W = B8.M$short(this.X, 0);
      this.Q = B8.M$short(this.X, 2);
      this.p = LH3_2.z(this.X, 4);
   }

   public int l() {
      return this.p;
   }

   public void t(int var1) {
      this.p = var1;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 11263;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 2494929310710983813L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "±3È¶\u0001ßá¹ÐLµ^ÿ#3@";
      int var5 = "±3È¶\u0001ßá¹ÐLµ^ÿ#3@".length();
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





