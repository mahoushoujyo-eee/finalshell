import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import javax.swing.JScrollPane;

class d2_2 extends JScrollPane {
   private static final long[] a;
   private static final Integer[] b;

   d2_2(Component var1) {
      super(var1);
   }

   @Override
   public void paint(Graphics var1) {
      super.paint(var1);
      var1.setColor(new Color(a(2442, 8044787491513592176L), a(18545, 1280317372384225417L), a(18545, 1280317372384225417L), a(23678, 2961074536848276613L)));
      var1.drawRect(0, 0, this.getWidth() - 1, this.getHeight() - 1);
   }

   static {
      long var0 = 5735371437760898807L;
      long[] var6 = new long[3];
      int var3 = 0;
      String var4 = "u0pËÇ\u0084\u008fOou`? ãZ\n\u0004í¼y\u0096\u0011Î¶";
      int var5 = "u0pËÇ\u0084\u008fOou`? ãZ\n\u0004í¼y\u0096\u0011Î¶".length();
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 24826;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}





