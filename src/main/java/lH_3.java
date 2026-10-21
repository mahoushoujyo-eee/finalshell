public class lH_3 {
   private static final long[] a;
   private static final Integer[] b;

   public static int z(byte[] var0, int var1) {
      String var2 = D6.k();
      int var10000 = var0[var1 + 3] & a(17542, 4288412988692951734L)
         | (var0[var1 + 2] & a(27407, 8598487929337732411L)) << a(4541, 8093063606990088074L)
         | (var0[var1 + 1] & a(27407, 8598487929337732411L)) << a(27781, 1309988007318837936L)
         | (var0[var1] & a(27407, 8598487929337732411L)) << a(18292, 1408193148299735362L);
      if (com.ky_4.F() != null) {
         D6.m("afrR4");
      }

      return var10000;
   }

   public static void u(int var0, byte[] var1, int var2) {
      var1[var2] = (byte)(var0 >> a(746, 5628617181711119576L));
      var1[var2 + 1] = (byte)(var0 >> a(19158, 8302948816807460069L));
      var1[var2 + 2] = (byte)(var0 >> a(21329, 1822333171755509088L));
      var1[var2 + 3] = (byte)var0;
   }

   static {
      long var0 = 2039603921535498501L;
      long[] var6 = new long[8];
      int var3 = 0;
      String var4 = "¹9A\u0088fÔÞ\u0087*\u000bZ\u009dÂ\u0016\u0088_U\fk:5ß#¥\u0019&\u0001/Ð5$Á\u0097l_ãç\u0093\u0005ð4\u0097u\u00ad\u0095\u0010ÍÅ";
      int var5 = "¹9A\u0088fÔÞ\u0087*\u000bZ\u009dÂ\u0016\u0088_U\fk:5ß#¥\u0019&\u0001/Ð5$Á\u0097l_ãç\u0093\u0005ð4\u0097u\u00ad\u0095\u0010ÍÅ".length();
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
                     b = new Integer[8];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "ª1\u008bC\u008dx\u001cmeR9#°«\u000bL";
                  var5 = "ª1\u008bC\u008dx\u001cmeR9#°«\u000bL".length();
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 13879;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}





