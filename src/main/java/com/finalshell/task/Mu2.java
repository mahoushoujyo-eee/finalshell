package com.finalshell.task;

import com.finalshell.core.CN3;
import com.finalshell.core.Ku4;

public class Mu2 extends Thread {
   public final Ku4 w;
   public static long[] a;
   public static Long[] b;

   public Mu2(Ku4 var1) {
      this.w = var1;
   }

   @Override
   public void run() {
      boolean var10000 = CN3.Y();
      long var2 = System.currentTimeMillis();
      boolean var1 = var10000;

      while (true) {
         while (Math.abs(System.currentTimeMillis() - var2) > a(3534, 1195484283812696659L)) {
            var2 = System.currentTimeMillis();

            try {
               if (var1) {
                  this.w.u();
                  break;
               }
            } catch (InterruptedException var6) {
               throw a(var6);
            }
         }

         try {
            Thread.sleep(a(27245, 8072374203092088305L));
         } catch (InterruptedException var5) {
            return;
         }
      }
   }

   public static InterruptedException a(InterruptedException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static long a(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 24476) & 32767;
      if (b[var3] == null) {
         b[var3] = a[var3] ^ var1;
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 9176999656272942083L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "\u000f]\u0095\u0001MSa\u0096oÌv\u000f\u008f0\u0005¸";
      int var5 = "\u000f]\u0095\u0001MSa\u0096oÌv\u000f\u008f0\u0005¸".length();
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
      b = new Long[2];
   }
}





