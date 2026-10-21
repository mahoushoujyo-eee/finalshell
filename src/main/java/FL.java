import java.util.Random;

public class FL {
   private static final long[] a;
   private static final Integer[] b;

   public static void main(String[] var0) {
      System.out.println(new Random().nextInt(a(9364, 6368665132608393489L)) + a(365, 6363274621649728745L));
   }

   static {
      long var0 = 1180641364772026120L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "ß¾_PèÔ¾öG\u009c\u009b\u0000\u0005îäñ";
      int var5 = "ß¾_PèÔ¾öG\u009c\u009b\u0000\u0005îäñ".length();
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 13701;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}





