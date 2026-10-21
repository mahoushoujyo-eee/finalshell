package com.finalshell.core;

public class TV3 {
   public static long[] a;
   public static Integer[] b;

   public static void main(String[] var0) {
      int var1 = a(6663, 1370578618877566394L);
      byte var2 = T((short)var1);
      short var3 = t(var2);
   }

   public static byte T(short var0) {
      return (byte)(var0 >> 0 & a(19809, 6500086065374071518L));
   }

   public static short t(byte var0) {
      byte var1 = 0;
      return (short)(var1 + ((var0 & a(23107, 5416214318471585279L)) << 0));
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 18365;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 8663726413449002529L;
      long[] var6 = new long[3];
      int var3 = 0;
      String var4 = "êÚZóJ:£\u0093\u008cËÚ©§)ã!ºU®é Ýt\u0000";
      int var5 = "êÚZóJ:£\u0093\u008cËÚ©§)ã!ºU®é Ýt\u0000".length();
      byte var2 = 0;

      do {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
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
      b = new Integer[3];
   }
}





