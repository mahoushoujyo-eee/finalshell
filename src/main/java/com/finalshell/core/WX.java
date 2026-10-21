package com.finalshell.core;

import java.net.DatagramPacket;

public class WX extends WC {
   public short h = D6.O;
   public byte[] j;
   public int M;
   public static long[] a;
   public static Integer[] b;

   public WX(int var1) {
      this.j = new byte[a(15793, 8606240236008140772L)];
      B8.P(this.W, this.j, 0);
      B8.P(this.h, this.j, 2);
      LH3_2.u(var1, this.j, 4);
      this.g = new DatagramPacket(this.j, this.j.length);
   }

   public WX(DatagramPacket var1) {
      this.j = new byte[a(4950, 1293325122495889666L)];
      this.g = var1;
      this.j = var1.getData();
      this.W = B8.M$short(this.j, 0);
      this.h = B8.M$short(this.j, 2);
      this.M = LH3_2.z(this.j, 4);
   }

   public int a() {
      return this.M;
   }

   public void I(int var1) {
      this.M = var1;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 21077;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 8164599594053305871L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "¡F¸m>(éãT=&5\u0011¬G\u0005";
      int var5 = "¡F¸m>(éãT=&5\u0011¬G\u0005".length();
      byte var2 = 0;

      do {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
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





