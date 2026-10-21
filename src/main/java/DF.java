import java.util.Arrays;

public class DF {
   private static boolean J;
   private static final long[] a;
   private static final Integer[] b;
   private static final long c;

   public static byte[] s(byte[] var0, int var1) {
      byte[] var2 = new byte[var1];
      System.arraycopy(var0, 0, var2, 0, Math.min(var0.length, var1));
      return var2;
   }

   public static boolean K(byte[] var0, byte[] var1) {
      return Arrays.equals(var0, var1);
   }

   public static long q(byte[] var0, int var1, Ks_2 var2) {
      int var10000 = M();
      long var4 = 0L;
      boolean var3 = (boolean)var10000;
      int var6 = 0;
      byte var7 = 1;
      var10000 = fK_3.s[var2.ordinal()];
      if (var3) {
         switch (var10000) {
            case 1:
               var7 = 1;
               var6 = 0;
               if (var3) {
                  break;
               }
            case 2:
               var7 = -1;
               var6 = var1 - 1;
         }

         var10000 = 0;
      }

      int var8 = var10000;

      while (true) {
         if (var8 < var1) {
            var10 = var4 + (long)((a(15250, 5648174263929435891L) & var0[var6]) * (1 << var8 * a(31702, 4122133387206637238L)));
            if (!var3) {
               break;
            }

            var4 = var10;
            var6 += var7;
            var8++;
            if (var3) {
               continue;
            }
         }

         var10 = var4;
         break;
      }

      return var10;
   }

   public static short I(byte[] var0, Ks_2 var1) {
      return (short)((int)q(var0, 2, var1));
   }

   public static int a(byte[] var0, Ks_2 var1) {
      return (int)q(var0, 4, var1);
   }

   public static long J(byte[] var0, Ks_2 var1) {
      return q(var0, a(24130, 6465254043034161952L), var1);
   }

   public static byte[] O(long var0, int var2, Ks_2 var3) {
      int var10000 = c();
      byte[] var5 = new byte[var2];
      int var6 = 0;
      boolean var4 = (boolean)var10000;
      byte var7 = 1;
      var10000 = fK_3.s[var3.ordinal()];
      if (!var4) {
         switch (var10000) {
            case 2:
               var7 = -1;
               var6 = var2 - 1;
               if (!var4) {
                  break;
               }
            case 1:
               var7 = 1;
               var6 = 0;
         }

         var10000 = 0;
      }

      int var8 = var10000;

      while (true) {
         if (var8 < var2) {
            var10 = var5;
            if (var4) {
               break;
            }

            var5[var6] = (byte)((int)(var0 >> var8 * a(31702, 4122133387206637238L) & c));
            var6 += var7;
            var8++;
            if (!var4) {
               continue;
            }
         }

         var10 = var5;
         break;
      }

      return var10;
   }

   public static byte[] C(short var0, Ks_2 var1) {
      return O((long)var0, 2, var1);
   }

   public static byte[] U(int var0, Ks_2 var1) {
      return O((long)var0, 4, var1);
   }

   public static byte[] h(long var0, Ks_2 var2) {
      return O(var0, a(31702, 4122133387206637238L), var2);
   }

   public static void N(boolean var0) {
      J = var0;
   }

   public static boolean M() {
      return J;
   }

   public static boolean c() {
      boolean var0 = M();
      return !var0;
   }

   static {
      long var2 = 537243454849800187L;
      long[] var8 = new long[3];
      int var5 = 0;
      String var6 = "#3¯5¡\u0003aE§E5\u00803=¡÷Äátð]\u008cDÓ";
      int var7 = "#3¯5¡\u0003aE§E5\u00803=¡÷Äátð]\u008cDÓ".length();
      byte var4 = 0;
      N(true);

      do {
         int var10001 = var4;
         var4 += 8;
         byte[] var9 = var6.substring(var10001, var4).getBytes("ISO-8859-1");
         var10001 = var5++;
         long var10004 = (
               ((long)var9[0] & 255L) << 56
                  | ((long)var9[1] & 255L) << 48
                  | ((long)var9[2] & 255L) << 40
                  | ((long)var9[3] & 255L) << 32
                  | ((long)var9[4] & 255L) << 24
                  | ((long)var9[5] & 255L) << 16
                  | ((long)var9[6] & 255L) << 8
                  | (long)var9[7] & 255L
            )
            ^ var2;
         byte var10003 = -1;
         var8[var10001] = var10004;
      } while (var4 < var7);

      a = var8;
      b = new Integer[3];
      long var0 = 8847818705301979332L;
      long var10002 = 8847818705301979195L ^ var0;
      byte var11 = -1;
      c = var10002;
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 19808;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}





