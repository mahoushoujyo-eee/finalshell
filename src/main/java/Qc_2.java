public class Qc_2 {
   public static int o;
   public static int S;
   public static int Q;
   public static int i;
   public static int Y;
   private static int[] P;

   static {
      long var1 = 2551852965088746637L;
      int[] var10000 = new int[2];
      long[] var0 = new long[3];
      int var4 = 0;
      w(var10000);
      String var5 = "\u001eÓ\u001e§ Û£s³ßW\u0089 Û£pÈqs¤ Û£q";
      int var6 = "\u001eÓ\u001e§ Û£s³ßW\u0089 Û£pÈqs¤ Û£q".length();
      byte var3 = 0;

      do {
         int var10001 = var3;
         var3 += 8;
         byte[] var7 = var5.substring(var10001, var3).getBytes("ISO-8859-1");
         var10001 = var4++;
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
            ^ var1;
         byte var10003 = -1;
         var0[var10001] = var10004;
      } while (var3 < var6);

      o = -1;
      S = 1;
      Q = (int)var0[1];
      i = (int)var0[0];
      Y = (int)var0[2];
   }

   public static void w(int[] var0) {
      P = var0;
   }

   public static int[] c() {
      return P;
   }
}





