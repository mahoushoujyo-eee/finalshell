package com.finalshell.core;

import java.net.DatagramPacket;

public class VK extends Vb2 {
   public short m = BN.f;
   public byte[] j;
   public static long[] a;
   public static Integer[] b;

   public VK(int var1, int var2) {
      byte[] var3 = new byte[a(7801, 2773220949880713373L)];
      this.x = var2;
      this.p = var1;
      Nb2_2.s(this.V, var3, 0);
      Nb2_2.s(this.m, var3, 2);
      CN3.P(var1, var3, 4);
      CN3.P(var2, var3, a(14423, 1592735203207583408L));
      this.O = new DatagramPacket(var3, var3.length);
   }

   public VK(DatagramPacket var1) {
      this.O = var1;
      this.j = var1.getData();
      this.V = Nb2_2.Q(this.j, 0);
      this.m = Nb2_2.Q(this.j, 2);
      this.p = CN3.m(this.j, 4);
      this.x = CN3.m(this.j, a(12173, 8627473504472596843L));
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 12006;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 2648420409332840680L;
      long[] var6 = new long[3];
      int var3 = 0;
      String var4 = "$\u0086.pµ\u0002¹\u008bßyî\u0089\u001a_.Pk×\u009c\u0092Sb\by";
      int var5 = "$\u0086.pµ\u0002¹\u008bßyî\u0089\u001a_.Pk×\u009c\u0092Sb\by".length();
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
      b = new Integer[3];
   }
}





