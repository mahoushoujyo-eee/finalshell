package com.finalshell.core;

import java.net.DatagramPacket;

public class W3 extends WC {
   public short L = D6.nD;
   byte[] w;
   int J;
   public static long[] a;
   public static Integer[] b;

   public W3(int var1, int var2, int var3) {
      byte[] var4 = new byte[a(660, 8682643668078980936L)];
      this.H = var2;
      this.l = var1;
      B8.P(this.W, var4, 0);
      B8.P(this.L, var4, 2);
      LH3_2.u(var1, var4, 4);
      LH3_2.u(var2, var4, a(26438, 6535507677913844379L));
      LH3_2.u(var3, var4, a(20183, 9193592327274799880L));
      this.g = new DatagramPacket(var4, var4.length);
   }

   public W3(DatagramPacket var1) {
      this.g = var1;
      this.w = var1.getData();
      this.W = B8.M$short(this.w, 0);
      this.L = B8.M$short(this.w, 2);
      this.l = LH3_2.z(this.w, 4);
      this.H = LH3_2.z(this.w, a(3728, 1680226957031498570L));
      this.J = LH3_2.z(this.w, a(7495, 7033419662847373465L));
   }

   public int r() {
      return this.J;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 28126;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 8230557311823859542L;
      long[] var6 = new long[5];
      int var3 = 0;
      String var4 = "t!?Xº\u0082¿ÃÑö¬ó\u00869ìR»(²gQå \u000e";
      int var5 = "t!?Xº\u0082¿ÃÑö¬ó\u00869ìR»(²gQå \u000e".length();
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
                     b = new Integer[5];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "\u008fïºbÊ%ÅÅÚÂx\ri$¬\u0014";
                  var5 = "\u008fïºbÊ%ÅÅÚÂx\ri$¬\u0014".length();
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





