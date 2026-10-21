import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Random;
import java.util.zip.GZIPOutputStream;

public class aN implements Or_2 {
   private static final long[] a;
   private static final Integer[] b;

   @Override
   public byte[] k(QI var1, byte[] var2) {
      ByteArrayOutputStream var3 = new ByteArrayOutputStream();
      GZIPOutputStream var4 = null;

      try {
         var4 = new GZIPOutputStream(var3);
      } catch (IOException var15) {
         var15.printStackTrace();
      }

      DataOutputStream var5 = new DataOutputStream(var4);
      long var6 = var1.o();
      byte[] var8 = null;
      byte[] var9 = this.p();
      byte[] var10 = this.p();
      byte[] var11 = this.p();
      byte[] var12 = this.p();

      try {
         byte[] var13 = to_4.R(var2, var10);
         var5.writeLong(var6);
         var5.writeByte(var9.length);
         var5.write(var9);
         var5.write(var13);
         var5.writeByte(var11.length);
         var5.write(var11);
         var5.write(var10);
         var5.write(var12);
         var8 = var3.toByteArray();
      } catch (Exception var14) {
         var14.printStackTrace();
      }

      return var8;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   byte[] p() {
      int var2 = a(4408, 2080477985942892031L) + new Random().nextInt(a(9523, 5087991631801833973L));
      byte[] var3 = new byte[var2];
      String[] var10000 = UD.L();
      int var4 = 0;
      String[] var1 = var10000;
      byte[] var5;
      if (var1 == null) {
         var5 = var3;
      } else if (var4 >= var2) {
         var5 = var3;
         if (var1 != null) {
            return var3;
         }
      } else {
         var5 = var3;
      }

      while (true) {
         var5[var4] = (byte)new Random().nextInt(a(31322, 775056067389228702L));
         if (++var4 >= var2) {
            var5 = var3;
            if (var1 != null) {
               return var3;
            }
         } else {
            var5 = var3;
         }
      }
   }

   static {
      long var0 = 7850605246592262192L;
      long[] var6 = new long[3];
      int var3 = 0;
      String var4 = "¶Id¾+Fy\r_¤»\u009e1ÖMÅÛ´\u0015?«L&Ñ";
      int var5 = "¶Id¾+Fy\r_¤»\u009e1ÖMÅÛ´\u0015?«L&Ñ".length();
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 31942;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}





