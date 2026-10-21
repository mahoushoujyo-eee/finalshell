package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;

public class YH3_2 {
   public static long[] a;
   public static Integer[] b;

   public static int Q(byte[] var0, int var1) {
      String var2 = Cl4.C();
      int var10000 = var0[var1 + 3] & a(1570, 6649719372525720909L)
         | (var0[var1 + 2] & a(21616, 2467747478379104024L)) << a(4009, 4914599086783749314L)
         | (var0[var1 + 1] & a(21616, 2467747478379104024L)) << a(27655, 7224161949327146861L)
         | (var0[var1] & a(21616, 2467747478379104024L)) << a(30410, 6171482297109292451L);
      if (var2 == null) {
         Ky4.K(new String[5]);
      }

      return var10000;
   }

   public static void l(int var0, byte[] var1, int var2) {
      Cl4.C();
      var1[var2] = (byte)(var0 >> a(30272, 6071745841300972846L));
      var1[var2 + 1] = (byte)(var0 >> a(15418, 6616911048946708310L));
      var1[var2 + 2] = (byte)(var0 >> a(28381, 3680526275764993456L));
      var1[var2 + 3] = (byte)var0;
      if (Ky4.F$arrString() != null) {
         Cl4.F("mZplu");
      }
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 21358;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 7984449217079771769L;
      long[] var6 = new long[8];
      int var3 = 0;
      String var4 = ">z§n:\u001c§O\u0001ÊÈ ðBWËQ^{¼éüí?ÂÛ\u001bQªY?Á\u0012ý\u0011Zê¦=\u0004¶ëSÿÂ\u001bÞ³";
      int var5 = ">z§n:\u001c§O\u0001ÊÈ ðBWËQ^{¼éüí?ÂÛ\u001bQªY?Á\u0012ý\u0011Zê¦=\u0004¶ëSÿÂ\u001bÞ³".length();
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
                     b = new Integer[8];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "·º÷\u0091«\b\u0085\u009e\u0090\"\u0002»çà'Â";
                  var5 = "·º÷\u0091«\b\u0085\u009e\u0090\"\u0002»çà'Â".length();
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





