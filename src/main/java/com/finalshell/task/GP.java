package com.finalshell.task;

import com.finalshell.core.SelectUploadFile;

public class GP implements Runnable {
   final long T;
   final T_2 M;
   public static long[] a;
   public static Long[] b;

   GP(T_2 var1, long var2) {
      this.M = var1;
      this.T = var2;
   }

   @Override
   public void run() {
      String var1 = SelectUploadFile.r$String();

      while (true) {
         int var10000 = this.M.c.b;

         do {
            if (var10000 != 0) {
               return;
            }

            try {
               Thread.sleep(a(12520, 1523639616274985619L));
            } catch (InterruptedException var3) {
               var3.printStackTrace();
            }

            long var4;
            var10000 = (var4 = System.currentTimeMillis() - this.T - a(16643, 9182747863385736057L)) == 0L ? 0 : (var4 < 0L ? -1 : 1);
         } while (var1 != null);

         if (var10000 > 0) {
            this.M.c.b = true;
            if (var1 != null) {
               return;
            }
         }
      }
   }

   static {
      __vfClinit__();
   }

   public static long a(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 17019) & 32767;
      if (b[var3] == null) {
         b[var3] = a[var3] ^ var1;
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 8860798014919041535L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "oÒîñ\u0094t\u0013^\u0005\u0098L^\u0092©é>";
      int var5 = "oÒîñ\u0094t\u0013^\u0005\u0098L^\u0092©é>".length();
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





