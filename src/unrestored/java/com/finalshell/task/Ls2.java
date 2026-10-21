package com.finalshell.task;

import com.finalshell.core.A0;
import com.finalshell.core.Md2;
import com.finalshell.core.Zq2_2;

public class Ls2 implements Runnable {
   public final Md2 L;
   public static long[] a;
   public static Integer[] b;

   public Ls2(Md2 var1) {
      this.L = var1;
   }

   @Override
   public void run() {
      try {
         Zq2_2 var1 = new Zq2_2();
         A0 var2 = new A0(var1, this.L.I, this.L.M, a(19808, 6809153206749227081L), a(28638, 816656385357630197L));
         A0 var3 = new A0(var1, this.L.g, this.L.m, a(19209, 5422482100022210083L), a(23931, 6579935693682538579L));
         var2.R(A0.d);
         var2.E(this.L.B);
         var2.g(this.L.P);
         var3.R(A0.T);
         var3.E(this.L.B);
         var3.g(this.L.P);
         var2.b(this.L.r);
         var3.b(this.L.r);
      } catch (Exception var4) {
         var4.printStackTrace();
      }
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 9515;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 1906683675450021589L;
      long[] var6 = new long[4];
      int var3 = 0;
      String var4 = "õ\u0004U]¾ø| ý¸ß\u0082ê\u0080Ðö";
      int var5 = "õ\u0004U]¾ø| ý¸ß\u0082ê\u0080Ðö".length();
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
                     a = var6;
                     b = new Integer[4];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "\u0011\\\bg»CÖ\u009c \u00919í¤ïÎ\u0086";
                  var5 = "\u0011\\\bg»CÖ\u009c \u00919í¤ïÎ\u0086".length();
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





