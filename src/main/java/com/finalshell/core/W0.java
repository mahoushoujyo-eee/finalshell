package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import java.net.DatagramPacket;
import java.util.ArrayList;

public class W0 extends WC {
   public ArrayList J;
   public byte[] h = null;
   public int U;
   public static long[] a;
   public static Integer[] b;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public W0(long var1, ArrayList var3, int var4, int var5, int var6, int var7) {
      this.H = var7;
      this.l = var6;
      this.J = var3;
      this.U = var4;
      int var9 = a(27658, 2011528710946502434L) + 4 * var3.size();
      this.h = new byte[var9 + a(23905, 1809452460359550541L) + a(31657, 89840081446805634L)];
      this.T = D6.f;
      Ky4[] var10000 = WC.U();
      B8.P(this.W, this.h, 0);
      Ky4[] var8 = var10000;
      B8.P(this.T, this.h, 2);
      LH3_2.u(var6, this.h, 4);
      LH3_2.u(var7, this.h, a(22548, 3739700784321528638L));
      LH3_2.u(var4, this.h, a(23171, 5149634884484825506L));
      B8.P((short)var3.size(), this.h, a(4038, 8243946877283030248L));
      int var10 = 0;
      if (var8 == null) {
         Ky4.K(new String[2]);
         int var11 = (Integer)var3.get(var10);
         LH3_2.u(var11, this.h, a(21077, 5882690708802111864L) + 4 * var10 + a(10102, 3376907576585354329L));
         var10++;
      }

      while (true) {
         if (var10 >= var3.size()) {
            var10000 = (Ky4[])(this);
            if (var8 != null) {
               this.g = new DatagramPacket(this.h, this.h.length);
               return;
            }
         } else {
            var10000 = (Ky4[])var3.get(var10);
         }

         int var12 = (Integer)var10000;
         LH3_2.u(var12, this.h, a(21077, 5882690708802111864L) + 4 * var10 + a(10102, 3376907576585354329L));
         var10++;
      }
   }

   public ArrayList D() {
      return this.J;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public W0(DatagramPacket var1) {
      this.g = var1;
      Ky4[] var10000 = WC.U();
      this.h = var1.getData();
      this.W = B8.M$short(this.h, 0);
      this.T = B8.M$short(this.h, 2);
      this.l = LH3_2.z(this.h, 4);
      this.H = LH3_2.z(this.h, a(10102, 3376907576585354329L));
      this.U = LH3_2.z(this.h, a(20846, 1410843843238234695L));
      Ky4[] var2 = var10000;
      short var3 = B8.M$short(this.h, a(1132, 3807493028383219535L));
      this.J = new ArrayList();
      int var4 = 0;
      int var5 = 0;
      if (var2 == null) {
         var4 = a(15976, 1467993332509009224L) + 4 * var5;
      } else if (var5 >= var3) {
         if (var2 != null) {
            return;
         }
      } else {
         var4 = a(15976, 1467993332509009224L) + 4 * var5;
      }

      while (true) {
         int var6 = LH3_2.z(this.h, var4 + a(10102, 3376907576585354329L));
         this.J.add(var6);
         if (++var5 >= var3) {
            if (var2 != null) {
               return;
            }
         } else {
            var4 = a(15976, 1467993332509009224L) + 4 * var5;
         }
      }
   }

   public int H() {
      return this.U;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 23337;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 2552429032503518028L;
      long[] var6 = new long[11];
      int var3 = 0;
      String var4 = "¼\u0083}\u000f\u0099\u0007)\u0007t[\u0014\u0093û³\u0014|uy)\u0086yþ\u0083Ç;\u009få&+x zO\u0080\f¨¡`*>\u000bG\u000eg\u0085t%\u0019v\u008b\u000e\b\u0019uß\u001d\u0001V\u0099\u0080+aw´.Îí\u00868i¢â";
      int var5 = "¼\u0083}\u000f\u0099\u0007)\u0007t[\u0014\u0093û³\u0014|uy)\u0086yþ\u0083Ç;\u009få&+x zO\u0080\f¨¡`*>\u000bG\u000eg\u0085t%\u0019v\u008b\u000e\b\u0019uß\u001d\u0001V\u0099\u0080+aw´.Îí\u00868i¢â"
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
                     b = new Integer[11];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "\u001a§\u008e~ø\u0013F\u000eêf>¹\u0005Jü\u0013";
                  var5 = "\u001a§\u008e~ø\u0013F\u000eêf>¹\u0005Jü\u0013".length();
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





