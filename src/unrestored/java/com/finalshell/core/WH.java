package com.finalshell.core;

import java.net.DatagramPacket;

public class WH extends WC {
   public short j = D6.n0;
   public byte[] B;
   public int K;
   public int a;
   public float y;
   public static long[] b;
   public static Integer[] c;

   public WH(int var1, int var2, float var3) {
      this.B = new byte[a(14297, 1052285891736922553L)];
      B8.P(this.W, this.B, 0);
      B8.P(this.j, this.B, 2);
      LH3_2.u(var1, this.B, 4);
      LH3_2.u(var2, this.B, a(30888, 3774858201995978442L));
      int var4 = (int)(var3 * 1000.0F * 1000.0F);
      LH3_2.u(var4, this.B, a(15195, 63642864682526014L));
      this.g = new DatagramPacket(this.B, this.B.length);
   }

   public WH(DatagramPacket var1) {
      this.B = new byte[a(10875, 4678922022008288287L)];
      this.g = var1;
      this.B = var1.getData();
      this.W = B8.M$short(this.B, 0);
      this.j = B8.M$short(this.B, 2);
      this.K = LH3_2.z(this.B, 4);
      this.a = LH3_2.z(this.B, a(7228, 2932923725124354655L));
      int var2 = LH3_2.z(this.B, a(7999, 7832484183645307230L));
      this.y = (float)var2 / 1000000.0F;
   }

   public int V() {
      return this.K;
   }

   public void j(int var1) {
      this.K = var1;
   }

   public int J() {
      return this.a;
   }

   public void V(int var1) {
      this.a = var1;
   }

   public float B() {
      return this.y;
   }

   public void B(float var1) {
      this.y = var1;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 24160;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   public static void __vfClinit__() {
      long var0 = 3421718114979231406L;
      long[] var6 = new long[6];
      int var3 = 0;
      String var4 = "EBWãgù_\u0007D\u000boßÿÐwüT\u0013Ä\u0006Ã«\u0090lÉEM\u008f©\u0081tù";
      int var5 = "EBWãgù_\u0007D\u000boßÿÐwüT\u0013Ä\u0006Ã«\u0090lÉEM\u008f©\u0081tù".length();
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
                     b = var6;
                     c = new Integer[6];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "7^]ÜáUB¡¨\u0093o¤98Ó\u009c";
                  var5 = "7^]ÜáUB¡¨\u0093o¤98Ó\u009c".length();
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





