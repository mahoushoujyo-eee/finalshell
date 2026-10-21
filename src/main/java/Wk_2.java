import java.net.DatagramPacket;

public class Wk_2 extends WC {
   public short c = D6.G;
   byte[] i;
   int u;
   int Y;
   int w;
   private static final long[] a;
   private static final Integer[] b;

   public Wk_2(int var1, int var2, int var3, int var4, int var5) {
      this.i = new byte[a(16586, 3212115676478027188L)];
      B8.P(this.W, this.i, 0);
      B8.P(this.c, this.i, 2);
      lH_3.u(var1, this.i, 4);
      lH_3.u(var2, this.i, a(21646, 3417960061659062770L));
      lH_3.u(var3, this.i, a(23854, 7413987921695385695L));
      B8.P((short)(var4 / a(32509, 3972529081864326023L)), this.i, a(1971, 6995498658321625803L));
      B8.P((short)(var5 / a(10711, 5701625640290114734L)), this.i, a(4930, 6206280042808010290L));
      this.g = new DatagramPacket(this.i, this.i.length);
   }

   public Wk_2(DatagramPacket var1) {
      this.i = new byte[a(23962, 2309008171900840165L)];
      this.g = var1;
      this.i = var1.getData();
      this.W = B8.M(this.i, 0);
      this.c = B8.M(this.i, 2);
      this.l = lH_3.z(this.i, 4);
      this.H = lH_3.z(this.i, a(5554, 2275927899000594633L));
      this.u = lH_3.z(this.i, a(19940, 982829834226120855L));
      this.Y = B8.M(this.i, a(6021, 5131672327724065527L));
      this.w = B8.M(this.i, a(16618, 8654543269772309911L));
   }

   public int V() {
      return this.u;
   }

   public void g(int var1) {
      this.u = var1;
   }

   public int t() {
      return this.Y;
   }

   public void Y(int var1) {
      this.Y = var1;
   }

   public int p() {
      return this.w;
   }

   public void p(int var1) {
      this.w = var1;
   }

   static {
      long var0 = 3448883374975898189L;
      long[] var6 = new long[12];
      int var3 = 0;
      String var4 = "õÚÄð¦ð\nã©^WA^Ë \u0096\u0089sÌõ·d²\u008c¶5c\"\u0005^ÝÊ\u0097ªÄ[\u001d6çÈf(\u009fa6\u0099s·]Q%nÈ¯ú¼\u0005Ô+\u0000dßçíþ\u0005Ã®Ì\u0080ú\u001e\u0018gu\u0011\u0005\u001a´m";
      int var5 = "õÚÄð¦ð\nã©^WA^Ë \u0096\u0089sÌõ·d²\u008c¶5c\"\u0005^ÝÊ\u0097ªÄ[\u001d6çÈf(\u009fa6\u0099s·]Q%nÈ¯ú¼\u0005Ô+\u0000dßçíþ\u0005Ã®Ì\u0080ú\u001e\u0018gu\u0011\u0005\u001a´m"
         .length();
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
                     b = new Integer[12];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "\u001b\u0082jOò\u0084jÖÉ|º®\u0000\u0081°ª";
                  var5 = "\u001b\u0082jOò\u0084jÖÉ|º®\u0000\u0081°ª".length();
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 30073;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}





