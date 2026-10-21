import java.net.DatagramPacket;

public class Wo_2 extends WC {
   public short a = D6.nJ;
   byte[] O;
   int R;
   private static final long[] b;
   private static final Integer[] c;

   public Wo_2(int var1, int var2, int var3) {
      this.O = new byte[a(15172, 2293638377211085841L)];
      B8.P(this.W, this.O, 0);
      B8.P(this.a, this.O, 2);
      lH_3.u(var1, this.O, 4);
      lH_3.u(var2, this.O, a(1602, 1411417827883841809L));
      lH_3.u(var3, this.O, a(14785, 1590220575283562134L));
      this.g = new DatagramPacket(this.O, this.O.length);
   }

   public Wo_2(DatagramPacket var1) {
      this.O = new byte[a(32366, 5696093919171117370L)];
      this.g = var1;
      this.O = var1.getData();
      this.W = B8.M(this.O, 0);
      this.a = B8.M(this.O, 2);
      this.l = lH_3.z(this.O, 4);
      this.H = lH_3.z(this.O, a(7783, 7602016566115754289L));
      this.R = lH_3.z(this.O, a(7275, 3882600448434561849L));
   }

   public int m() {
      return this.R;
   }

   public void f(int var1) {
      this.R = var1;
   }

   static {
      long var0 = 2068252910128690238L;
      long[] var6 = new long[6];
      int var3 = 0;
      String var4 = "«Î\u0012&U¨2¤Ã\u009c«Ãj\u0015\u0095\u0007y«®]á=°?â0Í\u0017Î\u0096u\u0014";
      int var5 = "«Î\u0012&U¨2¤Ã\u009c«Ãj\u0015\u0095\u0007y«®]á=°?â0Í\u0017Î\u0096u\u0014".length();
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
                     b = var6;
                     c = new Integer[6];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "\u001b\u0015\u00ad7\u0019H\r'ü\u0018\u009bÿ8U\u0097\u000b";
                  var5 = "\u001b\u0015\u00ad7\u0019H\r'ü\u0018\u009bÿ8U\u0097\u000b".length();
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 32599;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }
}





