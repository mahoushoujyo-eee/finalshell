package com.finalshell.core;

public class Cs2 {
   public static short a;
   public static int k;
   public static boolean W;
   public static boolean D;
   public static int r;
   public static int o;
   public static int x;
   public static boolean Q;
   public static int C;
   public static float P;
   public static int h;

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var1 = 580382013704038002L;
      long[] var0 = new long[6];
      int var4 = 0;
      String var5 = "\u008c\u0015¥jÐÚæx\u008f÷\u0005«ÐÚå\u009aÛ[k@ÐÚæ\u0016\u0003\u001dÊaÐÚæw";
      int var6 = "\u008c\u0015¥jÐÚæx\u008f÷\u0005«ÐÚå\u009aÛ[k@ÐÚæ\u0016\u0003\u001dÊaÐÚæw".length();
      byte var3 = 0;

      label21:
      while (true) {
         int var10001 = var3;
         var3 += 8;
         byte[] var7 = var5.substring(var10001, var3).getBytes("ISO-8859-1");
         long[] var10000 = var0;
         var10001 = var4++;
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
            long var13 = var10002 ^ var1;
            switch (var10003) {
               case 0:
                  var10000[var10001] = var13;
                  if (var3 >= var6) {
                     a = 0;
                     k = (int)var0[1];
                     W = false;
                     D = false;
                     r = (int)var0[5];
                     o = (int)var0[3];
                     x = (int)var0[4];
                     Q = true;
                     C = (int)var0[2];
                     P = 0.7F;
                     h = (int)var0[0];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var3 < var6) {
                     continue label21;
                  }

                  var5 = "ê\u001bµ$ÐÚç^ñm?ÅÐÚòr";
                  var6 = "ê\u001bµ$ÐÚç^ñm?ÅÐÚòr".length();
                  var3 = 0;
            }

            byte var10 = var3;
            var3 += 8;
            var7 = var5.substring(var10, var3).getBytes("ISO-8859-1");
            var10000 = var0;
            var10001 = var4++;
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





