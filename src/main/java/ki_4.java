import java.awt.Dimension;
import javax.swing.JPanel;

public class ki_4 extends JPanel {
   Y3 y;
   private static final long[] a;
   private static final Integer[] b;

   public ki_4(Y3 var1) {
      nB var2 = new nB();
      this.setLayout(var2);
      com.c.c(623627489568279027L).set(this, var1);
      this.setOpaque(false);
      this.setPreferredSize(new Dimension(a(5010, 9206486670880300411L), a(27294, 5320961396955161718L)));
      this.add(var1);
   }

   public Y3 P() {
      return (Y3)com.c.c(623627489568279027L).get(this);
   }

   static {
      long var0 = 6680658910786993314L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "ÿE,\u000bd1àõÆ~tïÒ\u0015\u0099ø";
      int var5 = "ÿE,\u000bd1àõÆ~tïÒ\u0015\u0099ø".length();
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 20201;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}





