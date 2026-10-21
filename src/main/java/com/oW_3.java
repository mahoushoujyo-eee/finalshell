package com;

public final class oW_3 {
   public static boolean E;
   public static boolean c;
   public static boolean b;
   public static int G;
   public static int K;
   public static boolean U;
   public static boolean d;
   public static int x;
   public static boolean I;

   static {
      long var1 = 6071725609101435962L;
      long[] var0 = new long[2];
      int var4 = 0;
      String var5 = "\u00adx§\"¨\"$24àâ\u001f¨\"$$";
      int var6 = "\u00adx§\"¨\"$24àâ\u001f¨\"$$".length();
      byte var3 = 0;

      do {
         int var10001 = var3;
         var3 += 8;
         byte[] var7 = var5.substring(var10001, var3).getBytes("ISO-8859-1");
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

      E = true;
      c = true;
      b = true;
      G = 0;
      K = (int)var0[1];
      U = true;
      d = false;
      x = (int)var0[0];
      I = false;
   }
}





