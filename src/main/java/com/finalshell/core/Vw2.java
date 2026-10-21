package com.finalshell.core;

import java.net.DatagramPacket;
import java.net.InetAddress;

public class Vw2 extends Vb2 {
   short b = BN.B;
   int u = 0;
   int D = 0;
   byte[] k;
   byte[] H;
   int y;
   InetAddress z;
   int L;
   int j;
   int i;
   long m;
   public static long[] a;
   public static Integer[] c;

   public Vw2(int var1, byte[] var2, int var3, short var4, int var5, int var6) {
      this.u = var1;
      this.j = var3;
      this.D = var4;
      this.k = new byte[this.D];
      this.x = var6;
      this.p = var5;
      System.arraycopy(var2, var3, this.k, 0, var4);
      this.D = this.k.length;
   }

   public void Q(int var1) {
      this.y = var1;
      this.H = new byte[this.D + a(27402, 3222684224957112110L) + a(27165, 595597405137133115L)];
      Nb2_2.s(this.V, this.H, 0);
      Nb2_2.s(this.b, this.H, 2);
      CN3.P(this.p, this.H, 4);
      CN3.P(this.x, this.H, a(27165, 595597405137133115L));
      CN3.P(this.u, this.H, a(2156, 9169129863271398475L));
      Nb2_2.s((short)this.D, this.H, a(27402, 3222684224957112110L));
      CN3.P(this.y, this.H, a(9583, 3819245765274243399L));
      System.arraycopy(this.k, 0, this.H, a(22415, 637977137435960236L), this.D);
      this.O = new DatagramPacket(this.H, this.H.length);
      this.O.setAddress(this.z);
      this.O.setPort(this.L);
   }

   public Vw2(DatagramPacket var1) {
      this.O = var1;
      this.H = var1.getData();
      this.V = Nb2_2.Q(this.H, 0);
      this.b = Nb2_2.Q(this.H, 2);
      this.p = CN3.m(this.H, 4);
      this.x = CN3.m(this.H, a(18851, 7492612762599456134L));
      this.u = CN3.m(this.H, a(23631, 4948944298799917167L));
      this.D = Nb2_2.Q(this.H, a(24360, 6143282504831462153L));
      this.y = CN3.m(this.H, a(18096, 7596157666804232850L));
      this.k = new byte[this.D];
      System.arraycopy(this.H, a(3749, 3334769386291313292L), this.k, 0, this.D);
   }

   public int N() {
      return this.u;
   }

   public byte[] q() {
      return this.k;
   }

   public int u() {
      return this.D;
   }

   public int o() {
      return this.y;
   }

   public void R(int var1) {
      this.y = var1;
   }

   public InetAddress v() {
      return this.z;
   }

   @Override
   public void D(InetAddress var1) {
      this.z = var1;
   }

   public int x() {
      return this.L;
   }

   @Override
   public void A(int var1) {
      this.L = var1;
   }

   public int c() {
      return this.i;
   }

   public void w(int var1) {
      this.i = var1;
   }

   public long R() {
      return this.m;
   }

   public void a(long var1) {
      this.m = var1;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 13345;
      if (c[var3] == null) {
         c[var3] = (int)(a[var3] ^ var1);
      }

      return c[var3];
   }

   public static void __vfClinit__() {
      long var0 = 3924284477287639224L;
      long[] var6 = new long[10];
      int var3 = 0;
      String var4 = "É%\u008aZ\u0005\u0016Ã¡*pù1ÅfÀÛ´6Á±1ÿË\u0002$®\b¹aöÚ8o\u0094\u0015C\u0090\u0003U6åjï<Ù\u009d÷\u0086(\u0091:,uø\u0094ÿC@Òz\u0088\u0018ö\u008b";
      int var5 = "É%\u008aZ\u0005\u0016Ã¡*pù1ÅfÀÛ´6Á±1ÿË\u0002$®\b¹aöÚ8o\u0094\u0015C\u0090\u0003U6åjï<Ù\u009d÷\u0086(\u0091:,uø\u0094ÿC@Òz\u0088\u0018ö\u008b"
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
                     c = new Integer[10];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "|ÝØ!\u001fò\u0092\"¾gä'wY9í";
                  var5 = "|ÝØ!\u001fò\u0092\"¾gä'wY9í".length();
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





