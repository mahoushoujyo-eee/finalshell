import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class x_2 extends y_2 implements Cloneable {
   String i;
   private static final long[] d;
   private static final Integer[] e;

   public x_2(y_2 var1, String var2, int var3, String var4) throws UnknownHostException {
      super(var1, var2, var3);
      this.i = new String(var4);
      this.w = b(15036, 6236850909096161465L);
   }

   public x_2(String var1, int var2, String var3) throws UnknownHostException {
      this(null, var1, var2, var3);
   }

   public x_2(y_2 var1, InetAddress var2, int var3, String var4) {
      super(var1, var2, var3);
      this.i = new String(var4);
      this.w = b(30218, 3849814687758711822L);
   }

   public x_2(InetAddress var1, int var2, String var3) {
      this(null, var1, var2, var3);
   }

   @Override
   public Object clone() {
      x_2 var1 = new x_2(this.v, this.k, this.i);
      var1.s = (TR)this.s.clone();
      var1.T = this.T;
      return var1;
   }

   @Override
   protected y_2 B() {
      x_2 var1 = new x_2(this.v, this.k, this.i);
      var1.s = this.s;
      var1.T = this.T;
      return var1;
   }

   @Override
   protected Jk_2 k(int var1, InetAddress var2, int var3) {
      String[] var4;
      label20: {
         var4 = Jk_2.Y();
         int var10000 = var1;
         if (var4 != null) {
            switch (var1) {
               case 1:
                  var10000 = 1;
                  break;
               case 2:
                  break label20;
               default:
                  return null;
            }
         }

         var1 = var10000;
         if (var4 != null) {
            return new Jo_2(var1, var2, var3, this.i);
         }
      }

      byte var6 = 2;
      return var4 == null ? null : new Jo_2(var6, var2, var3, this.i);
   }

   @Override
   protected Jk_2 Q(int var1, String var2, int var3) throws UnknownHostException {
      return this.k(var1, InetAddress.getByName(var2), var3);
   }

   @Override
   protected Jk_2 o(InputStream var1) throws b5_2, IOException {
      return new Jo_2(var1, true);
   }

   static {
      long var0 = 1948999304541795403L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "v\u0010^\u008e<B\bAÁå÷ß\u0007\rÄö";
      int var5 = "v\u0010^\u008e<B\bAÁå÷ß\u0007\rÄö".length();
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

      d = var6;
      e = new Integer[2];
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 2564;
      if (e[var3] == null) {
         e[var3] = (int)(d[var3] ^ var1);
      }

      return e[var3];
   }
}





