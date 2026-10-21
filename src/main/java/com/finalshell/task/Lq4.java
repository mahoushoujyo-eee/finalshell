package com.finalshell.task;

import com.finalshell.core.Du4;
import com.finalshell.core.Or4;
import com.finalshell.core.YM;

public class Lq4 implements Runnable {
   public final Du4 F;
   public static long[] a;
   public static Integer[] b;

   public Lq4(Du4 var1) {
      this.F = var1;
   }

   @Override
   public void run() {
      try {
         YM var1 = new YM();
         Or4 var2 = new Or4(var1, this.F.r, this.F.x, a(18655, 5145856011517322564L), a(5553, 8669048392514746411L));
         Or4 var3 = new Or4(var1, this.F.d, this.F.z, a(26229, 3279064825879677933L), a(6328, 2401795625748903201L));
         var2.x(Or4.k);
         var2.B(this.F.O);
         var2.i(this.F.J);
         var3.x(Or4.R);
         var3.B(this.F.O);
         var3.i(this.F.J);
         var2.J(this.F.W);
         var3.J(this.F.W);
      } catch (Exception var4) {
         var4.printStackTrace();
      }
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 11675;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 2342384572092119530L;
      long[] var6 = new long[4];
      int var3 = 0;
      String var4 = "\u0091\u000e\nBÕ+´®YmJO\u0082kaÁ";
      int var5 = "\u0091\u000e\nBÕ+´®YmJO\u0082kaÁ".length();
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
                     b = new Integer[4];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "\u001fÏ~\u0085í1ìËÿl½Vdî\u009a\u0007";
                  var5 = "\u001fÏ~\u0085í1ìËÿl½Vdî\u009a\u0007".length();
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





