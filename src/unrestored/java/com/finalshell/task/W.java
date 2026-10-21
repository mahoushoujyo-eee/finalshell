package com.finalshell.task;

import com.finalshell.core.Mm2;

public class W extends Thread {
   public final Mm2 v;
   public static long[] a;
   public static Integer[] b;
   public static long c;

   public W(Mm2 var1) {
      this.v = var1;
   }

   @Override
   public void run() {
      while (true) {
         this.v.i(a(9389, 4923485583310961952L));
         this.v.l(a(16516, 5369247535158581512L));

         try {
            Thread.sleep(c);
         } catch (InterruptedException var2) {
            var2.printStackTrace();
         }
      }
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 6540;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var2 = 1302708350702169860L;
      long[] var8 = new long[2];
      int var5 = 0;
      String var6 = ",s\u009cyEÍÛ|\u0082ñ¬\u0014«\u0088\u0016\u0094";
      int var7 = ",s\u009cyEÍÛ|\u0082ñ¬\u0014«\u0088\u0016\u0094".length();
      byte var4 = 0;

      do {
         int var10001 = var4;
         var4 += 8;
         byte[] var9 = var6.substring(var10001, var4).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
         var10001 = var5++;
         long var10004 = (
               ((long)var9[0] & 255L) << 56
                  | ((long)var9[1] & 255L) << 48
                  | ((long)var9[2] & 255L) << 40
                  | ((long)var9[3] & 255L) << 32
                  | ((long)var9[4] & 255L) << 24
                  | ((long)var9[5] & 255L) << 16
                  | ((long)var9[6] & 255L) << 8
                  | (long)var9[7] & 255L
            )
            ^ var2;
         byte var10003 = -1;
         var8[var10001] = var10004;
      } while (var4 < var7);

      a = var8;
      b = new Integer[2];
      long var0 = 1577382990763278165L;
      long var10002 = 1577382990763278175L ^ var0;
      byte var11 = -1;
      c = var10002;
   }
}





