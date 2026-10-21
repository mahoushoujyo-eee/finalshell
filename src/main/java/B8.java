public final class B8 {
   private static final long[] a;
   private static final Integer[] b;

   public static byte[] P(short var0, byte[] var1, int var2) {
      var1[var2] = (byte)(var0 >> a(7495, 5319857971058431858L));
      var1[var2 + 1] = (byte)(var0 >> 0);
      return var1;
   }

   public static short M(byte[] var0, int var1) {
      return (short)(var0[var1] << a(21130, 3470022079268329660L) | var0[var1 + 1] & a(15145, 8276353907680309534L));
   }

   public static byte[] R(int var0, byte[] var1, int var2) {
      var1[var2] = (byte)(var0 >> a(21130, 3470022079268329660L));
      var1[var2 + 1] = (byte)(var0 >> 0);
      return var1;
   }

   public static int M$int(byte[] var0, int var1) {
      int var2 = 0;
      var2 |= var0[var1 + 0] & a(19168, 3187307240157184212L);
      var2 <<= a(21130, 3470022079268329660L);
      return var2 | var0[var1 + 1] & a(15145, 8276353907680309534L);
   }

   static {
      long var0 = 6627242241893603053L;
      long[] var6 = new long[4];
      int var3 = 0;
      String var4 = "\u00adn¦¤ë\u0011\u0096ÆXÚ·ÈXÿÁ\u0097";
      int var5 = "\u00adn¦¤ë\u0011\u0096ÆXÚ·ÈXÿÁ\u0097".length();
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

                  var4 = "È·täá\u0005\u000eYt-Í£º;g\f";
                  var5 = "È·täá\u0005\u000eYt-Í£º;g\f".length();
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 18996;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}





