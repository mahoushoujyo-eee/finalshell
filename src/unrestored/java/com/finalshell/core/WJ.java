package com.finalshell.core;

import java.net.DatagramPacket;

public class WJ extends WC {
   public short o = D6.X;
   public byte[] e;
   public static long[] a;
   public static Integer[] b;

   public WJ(int var1, int var2) {
      byte[] var3 = new byte[a(22789, 1154950531792643365L)];
      this.H = var2;
      this.l = var1;
      B8.P(this.W, var3, 0);
      B8.P(this.o, var3, 2);
      LH3_2.u(var1, var3, 4);
      LH3_2.u(var2, var3, a(26079, 5579751648188340732L));
      this.g = new DatagramPacket(var3, var3.length);
   }

   public WJ(DatagramPacket var1) {
      this.g = var1;
      this.e = var1.getData();
      this.W = B8.M$short(this.e, 0);
      this.o = B8.M$short(this.e, 2);
      this.l = LH3_2.z(this.e, 4);
      this.H = LH3_2.z(this.e, a(3445, 3865969664778727764L));
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 31777;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 5705416763788016438L;
      long[] var6 = new long[3];
      int var3 = 0;
      String var4 = "»ëP#\b¶Êjpr\u007f7Ù\u0082\u009e\u001f>hÞ{À\u000e\"Â";
      int var5 = "»ëP#\b¶Êjpr\u007f7Ù\u0082\u009e\u001f>hÞ{À\u000e\"Â".length();
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
      b = new Integer[3];
   }
}





