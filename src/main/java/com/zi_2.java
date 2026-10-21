package com;

public class zi_2 extends com.zd_2 {
   private int B;
   private int f;
   private static final long[] a;
   private static final Integer[] b;

   public zi_2() {
      this(a(21175, 8733262015794721073L));
   }

   public zi_2(int var1) {
      this.N(var1);
   }

   public void N(int var1) {
      this.B = var1;
      this.f = var1 << a(31910, 3409576007640489761L);
   }

   public int N() {
      return this.B;
   }

   @Override
   public int T(int var1, int var2, int var3) {
      String[] var4 = com.zH.U();
      int var10000 = var3 & a(678, 8626399962604232995L);
      if (var4 == null) {
         if (var10000 != 0) {
            return var3 & a(15302, 2230779386645338178L) | this.f;
         }

         var10000 = var3;
      }

      return var10000;
   }

   static {
      long var0 = 1276705293287567417L;
      long[] var6 = new long[4];
      int var3 = 0;
      String var4 = "&K»^d\u009f\u0001\u0080îÅ#\u007fC_/\u0000";
      int var5 = "&K»^d\u009f\u0001\u0080îÅ#\u007fC_/\u0000".length();
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

                  var4 = "Ç\u001f#\u0002@ù\u0097\u0084+\u008dµÿ{3Ñ\u001a";
                  var5 = "Ç\u001f#\u0002@ù\u0097\u0084+\u008dµÿ{3Ñ\u001a".length();
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

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 25478;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}





