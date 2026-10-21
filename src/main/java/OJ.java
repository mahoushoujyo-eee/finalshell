import java.util.Random;

class OJ implements Runnable {
   private static final long[] a;
   private static final Integer[] b;

   @Override
   public void run() {
      long var1 = (long)((5 + new Random().nextInt(a(13154, 2478924074353434229L))) * a(31350, 998398688498734944L));

      try {
         Thread.sleep(var1);
      } catch (InterruptedException var4) {
         var4.printStackTrace();
      }

      new uR_3();
   }

   static {
      long var0 = 4388694280978576318L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "\u0005pn\u0010ð\u0084-Á\u0017\"1èyªç6";
      int var5 = "\u0005pn\u0010ð\u0084-Á\u0017\"1èyªç6".length();
      byte var2 = 0;

      do {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
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
      b = new Integer[2];
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 11543;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}





