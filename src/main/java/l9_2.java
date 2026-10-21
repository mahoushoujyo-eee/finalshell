import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class l9_2 {
   private static final long[] a;
   private static final Integer[] b;

   public static void main(String[] var0) {
      int var1 = a(4368, 5677158845292390560L);
      Object[] var10000 = com.c.a((short)var1);
      Method var5 = com.c.d(233249557846916492L);
      Object[] var12 = var10000;
      Object var9 = null;

      try {
         var6 = (Byte)var5.invoke(var9, var12);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      byte var2 = var6;
      var10000 = com.c.a(var2);
      Method var8 = com.c.d(615845032149445429L);
      var12 = var10000;
      var9 = null;

      try {
         var8.invoke(var9, var12);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   public static byte b(short var0) {
      return (byte)(var0 >> 0 & a(16585, 2850341305828538744L));
   }

   public static short w(byte var0) {
      byte var1 = 0;
      return (short)(var1 + ((var0 & a(12955, 2005873560951589672L)) << 0));
   }

   static {
      long var0 = 2871667241359255863L;
      long[] var6 = new long[3];
      int var3 = 0;
      String var4 = "\r\u000f \tôÐP°î\u009f]Ý9F\u0081\u009fÔÙ\u0092¿b\u0086\"à";
      int var5 = "\r\u000f \tôÐP°î\u009f]Ý9F\u0081\u009fÔÙ\u0092¿b\u0086\"à".length();
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
      b = new Integer[3];
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 14769;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}





