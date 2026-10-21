public class yl_4 {
   com.DI v;
   int q;
   public static int O;
   public static int I;
   public static int l;
   public static int N;
   int i;
   private static final long[] a;
   private static final Integer[] b;

   public yl_4(com.DI var1, int var2) {
      ty_4.Y();
      com.c.c(534669677834628032L).setInt(this, a(19066, 7370518447508552269L));
      com.c.c(487377996169177016L).set(this, var1);
      com.c.c(517408582937337833L).setInt(this, var2);
      if (com.ky_4.F() != null) {
         ty_4.c(new com.ky_4[4]);
      }
   }

   public com.DI o() {
      return (com.DI)com.c.c(487377996169177016L).get(this);
   }

   public void D(com.DI var1) {
      com.c.c(487377996169177016L).set(this, var1);
   }

   public int e() {
      return com.c.c(517408582937337833L).getInt(this);
   }

   public void K(int var1) {
      com.c.c(517408582937337833L).setInt(this, var1);
   }

   static {
      long var0 = 1825543814015552940L;
      long[] var6 = new long[5];
      int var3 = 0;
      String var4 = "G{\u009a\\pÚ#ó^ÉEÁåy\u0096\u0012\u0086§\u0099C½å¿[";
      int var5 = "G{\u009a\\pÚ#ó^ÉEÁåy\u0096\u0012\u0086§\u0099C½å¿[".length();
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
                     b = new Integer[5];
                     com.c.c(411125898711485254L).setInt(null, a(11198, 8409889248768334732L));
                     com.c.c(292074870577220689L).setInt(null, a(7688, 1681801961949965883L));
                     com.c.c(261180006635811470L).setInt(null, a(986, 6466826928723375082L));
                     com.c.c(462452886233087561L).setInt(null, a(672, 5951886602034393745L));
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "-ýµ9\n3¾#%§ïK\u000ez÷\u0086";
                  var5 = "-ýµ9\n3¾#%§ïK\u000ez÷\u0086".length();
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 12339;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}





