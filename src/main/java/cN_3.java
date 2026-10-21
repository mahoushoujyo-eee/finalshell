public class cN_3 {
   private static boolean s;
   private static final long[] a;
   private static final Integer[] b;

   public static int m(byte[] var0, int var1) {
      return var0[var1 + 3] & a(14010, 6129404193505802247L)
         | (var0[var1 + 2] & a(21229, 3135500441548823638L)) << a(744, 6198088599195503703L)
         | (var0[var1 + 1] & a(21229, 3135500441548823638L)) << a(12348, 155474514678546048L)
         | (var0[var1] & a(21229, 3135500441548823638L)) << a(17344, 9191871587012709754L);
   }

   public static void P(int var0, byte[] var1, int var2) {
      var1[var2] = (byte)(var0 >> a(15189, 8112643646941525483L));
      var1[var2 + 1] = (byte)(var0 >> a(23035, 635972991705388867L));
      var1[var2 + 2] = (byte)(var0 >> a(28088, 5657180925693731585L));
      var1[var2 + 3] = (byte)var0;
   }

   public static void y(boolean var0) {
      s = var0;
   }

   public static boolean Y() {
      return s;
   }

   public static boolean B() {
      boolean var0 = Y();
      return !var0;
   }

   static {
      long var0 = 8331460174836817438L;
      long[] var6 = new long[8];
      int var3 = 0;
      String var4 = "Ådº^'a}\u0017\u0003ezp\u0014!ÉMáX®tîïB·áÞa°é\u0090S|SþW#\u0083Å¦æAyn®F| \u008e";
      int var5 = "Ådº^'a}\u0017\u0003ezp\u0014!ÉMáX®tîïB·áÞa°é\u0090S|SþW#\u0083Å¦æAyn®F| \u008e".length();
      byte var2 = 0;
      y(true);

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
                     b = new Integer[8];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "Y¨ñCì\u0004\u0012A\tYr\u0002\u00181+í";
                  var5 = "Y¨ñCì\u0004\u0012A\tYr\u0002\u00181+í".length();
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 20153;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}





