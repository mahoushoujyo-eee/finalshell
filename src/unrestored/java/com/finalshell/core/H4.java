package com.finalshell.core;

import java.awt.Color;

public final class H4 {
   public static Color e;

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var1 = 2336384871572679195L;
      long[] var0 = new long[3];
      int var4 = 0;
      String var5 = ">û¢ìx¯ªA(qsÇx¯ªA\u0085~^0x¯ªÇ";
      int var6 = ">û¢ìx¯ªA(qsÇx¯ªA\u0085~^0x¯ªÇ".length();
      byte var3 = 0;

      do {
         int var10001 = var3;
         var3 += 8;
         byte[] var7 = var5.substring(var10001, var3).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
         var10001 = var4++;
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
            ^ var1;
         byte var10003 = -1;
         var0[var10001] = var10004;
      } while (var3 < var6);

      e = new Color((int)var0[1], (int)var0[0], (int)var0[0], (int)var0[2]);
   }
}





