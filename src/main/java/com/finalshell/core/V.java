package com.finalshell.core;

import java.net.DatagramPacket;

public class V extends Vb2 {
   public short R = BN.y;
   byte[] B;
   int r;
   int z;
   int G;
   public static long[] a;
   public static Integer[] b;

   public V(int var1, int var2, int var3, int var4, int var5) {
      this.B = new byte[a(13899, 3384811622759484692L)];
      Nb2_2.s(this.V, this.B, 0);
      Nb2_2.s(this.R, this.B, 2);
      CN3.P(var1, this.B, 4);
      CN3.P(var2, this.B, a(25798, 7007651448375320465L));
      CN3.P(var3, this.B, a(16913, 1114947073741142341L));
      Nb2_2.s((short)(var4 / a(5668, 2403136607807696248L)), this.B, a(28269, 8983863149012751676L));
      Nb2_2.s((short)(var5 / a(20449, 7836925158754628791L)), this.B, a(13361, 8364430354140385122L));
      this.O = new DatagramPacket(this.B, this.B.length);
   }

   public V(DatagramPacket var1) {
      this.B = new byte[a(23100, 4086099864281817454L)];
      this.O = var1;
      this.B = var1.getData();
      this.V = Nb2_2.Q(this.B, 0);
      this.R = Nb2_2.Q(this.B, 2);
      this.p = CN3.m(this.B, 4);
      this.x = CN3.m(this.B, a(21423, 5678773943378487546L));
      this.r = CN3.m(this.B, a(1695, 158662474167090625L));
      this.z = Nb2_2.Q(this.B, a(15051, 7087397558827762070L));
      this.G = Nb2_2.Q(this.B, a(18477, 3961241305414022013L));
   }

   public int m() {
      return this.r;
   }

   public void G(int var1) {
      this.r = var1;
   }

   public int K() {
      return this.z;
   }

   public void e(int var1) {
      this.z = var1;
   }

   public int A() {
      return this.G;
   }

   public void L(int var1) {
      this.G = var1;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 31574;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 7157113023317754834L;
      long[] var6 = new long[12];
      int var3 = 0;
      String var4 = "\b\u0099\u009f7\u0016ÉseZñ\u0096\u00adÖ\u0004ÜKW\u0002)\u007f=\u009eú\u009b\u0095a3Á\u008aüë såÀ\u0018\u0083gb¨_Ç0\u0081Ë%\f¢ÜB)à\"ãð½láI4\u0097\u008dÖþQ\u009d{\u009e\u0017Ä¾\u001f\u0014-Ê\u0080*\u001c\u000eÒ";
      int var5 = "\b\u0099\u009f7\u0016ÉseZñ\u0096\u00adÖ\u0004ÜKW\u0002)\u007f=\u009eú\u009b\u0095a3Á\u008aüë såÀ\u0018\u0083gb¨_Ç0\u0081Ë%\f¢ÜB)à\"ãð½láI4\u0097\u008dÖþQ\u009d{\u009e\u0017Ä¾\u001f\u0014-Ê\u0080*\u001c\u000eÒ"
         .length();
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
                     b = new Integer[12];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "ÃTÏ^Ã0*ªq\u008e|A\u009fË\u0002T";
                  var5 = "ÃTÏ^Ã0*ªq\u008e|A\u009fË\u0002T".length();
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





