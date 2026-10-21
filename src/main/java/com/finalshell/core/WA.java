package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import java.net.DatagramPacket;
import java.util.ArrayList;

public class WA extends WC {
   ArrayList b;
   byte[] X = null;
   int L;
   public static long[] a;
   public static Integer[] c;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public WA(long var1, ArrayList var3, int var4, int var5, int var6) {
      this.H = var6;
      this.l = var5;
      this.b = var3;
      Ky4[] var10000 = WC.U();
      this.L = var4;
      int var8 = a(2768, 7697344727123381129L) + 4 * var3.size();
      this.X = new byte[var8 + a(10661, 8587183764665133306L) + a(15896, 1958708777042018115L)];
      Ky4[] var7 = var10000;
      this.T = D6.T;
      B8.P(this.W, this.X, 0);
      B8.P(this.T, this.X, 2);
      LH3_2.u(var5, this.X, 4);
      LH3_2.u(var6, this.X, a(11899, 8979632000787214115L));
      LH3_2.u(var4, this.X, a(4822, 8761377893570499457L));
      B8.P((short)var3.size(), this.X, a(25415, 214352039759487515L));
      int var9 = 0;
      if (var7 == null) {
         int var10 = (Integer)var3.get(var9);
         LH3_2.u(var10, this.X, a(9321, 3173362992766739775L) + 4 * var9 + a(32120, 1094003818736106530L));
         var9++;
      }

      while (true) {
         if (var9 >= var3.size()) {
            var10000 = this;
            if (var7 != null) {
               this.g = new DatagramPacket(this.X, this.X.length);
               if (Ky4.F$arrString() != null) {
                  WC.X(new Ky4[5]);
               }

               return;
            }
         } else {
            var10000 = (Ky4[])var3.get(var9);
         }

         int var11 = (Integer)var10000;
         LH3_2.u(var11, this.X, a(9321, 3173362992766739775L) + 4 * var9 + a(32120, 1094003818736106530L));
         var9++;
      }
   }

   public ArrayList Z() {
      return this.b;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public WA(DatagramPacket var1) {
      Ky4[] var10000 = WC.U();
      super();
      this.X = null;
      Ky4[] var2 = var10000;
      this.g = var1;
      this.X = var1.getData();
      this.W = B8.M$short(this.X, 0);
      this.T = B8.M$short(this.X, 2);
      this.l = LH3_2.z(this.X, 4);
      this.H = LH3_2.z(this.X, a(32120, 1094003818736106530L));
      this.L = LH3_2.z(this.X, a(17350, 441876042515579544L));
      short var3 = B8.M$short(this.X, a(28578, 1403793593207860983L));
      this.b = new ArrayList();
      int var4 = 0;
      int var5 = 0;
      if (var2 == null) {
         var4 = a(11636, 3747009992210410537L) + 4 * var5;
      } else if (var5 >= var3) {
         if (var2 != null) {
            return;
         }
      } else {
         var4 = a(11636, 3747009992210410537L) + 4 * var5;
      }

      while (true) {
         int var6 = LH3_2.z(this.X, var4 + a(32120, 1094003818736106530L));
         this.b.add(var6);
         if (++var5 >= var3) {
            if (var2 != null) {
               return;
            }
         } else {
            var4 = a(11636, 3747009992210410537L) + 4 * var5;
         }
      }
   }

   public int U() {
      return this.L;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 16735;
      if (c[var3] == null) {
         c[var3] = (int)(a[var3] ^ var1);
      }

      return c[var3];
   }

   public static void __vfClinit__() {
      long var0 = 8482846483527871467L;
      long[] var6 = new long[11];
      int var3 = 0;
      String var4 = "\u0002ò:\u0014ß\u0004C\to\u0081áf¢<)\u007fBô°[\u0085SÇÈº¯\u001fÄ¤g\tàâ\u0098éù\u008cÞÔ¡ãø«2\u0080v\u0017Á\u0093öXäû3àp\r©Ô\u009bB\u007fDÀ7l\u0084K\u0087ãxf";
      int var5 = "\u0002ò:\u0014ß\u0004C\to\u0081áf¢<)\u007fBô°[\u0085SÇÈº¯\u001fÄ¤g\tàâ\u0098éù\u008cÞÔ¡ãø«2\u0080v\u0017Á\u0093öXäû3àp\r©Ô\u009bB\u007fDÀ7l\u0084K\u0087ãxf"
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
                     c = new Integer[11];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "\u0000®Ý\u009báâÎÞÅÒ\u001fû\u001bÆ\u0005\f";
                  var5 = "\u0000®Ý\u009báâÎÞÅÒ\u001fû\u001bÆ\u0005\f".length();
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





