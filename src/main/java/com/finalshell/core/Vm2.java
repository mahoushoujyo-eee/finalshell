package com.finalshell.core;

import java.net.DatagramPacket;

public class Vm2 extends Vb2 {
   public short i = BN.Y;
   public byte[] a;
   public int l;
   public static long[] b;
   public static Integer[] c;

   public Vm2(int var1, int var2, int var3) {
      byte[] var4 = new byte[a(18939, 8071793413677388423L)];
      this.x = var2;
      this.p = var1;
      Nb2_2.s(this.V, var4, 0);
      Nb2_2.s(this.i, var4, 2);
      CN3.P(var1, var4, 4);
      CN3.P(var2, var4, a(32718, 3293839845692220593L));
      CN3.P(var3, var4, a(5451, 687540867649982006L));
      this.O = new DatagramPacket(var4, var4.length);
   }

   public Vm2(DatagramPacket var1) {
      this.O = var1;
      this.a = var1.getData();
      this.V = Nb2_2.Q(this.a, 0);
      this.i = Nb2_2.Q(this.a, 2);
      this.p = CN3.m(this.a, 4);
      this.x = CN3.m(this.a, a(24546, 4597251211352736923L));
      this.l = CN3.m(this.a, a(23658, 1865988980011403028L));
   }

   public int v() {
      return this.l;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 23421;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   public static void __vfClinit__() {
      long var0 = 3680482825237557889L;
      long[] var6 = new long[5];
      int var3 = 0;
      String var4 = "\u0094O\u0090\u0086èâ¼»SV¡\rÚ¡à\u0016§o\u0089du¶Ö8";
      int var5 = "\u0094O\u0090\u0086èâ¼»SV¡\rÚ¡à\u0016§o\u0089du¶Ö8".length();
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
                     b = var6;
                     c = new Integer[5];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "\u0096mè¡lju\u0099\u009c\u008cëa»ßö\u0012";
                  var5 = "\u0096mè¡lju\u0099\u009c\u008cëa»ßö\u0012".length();
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





