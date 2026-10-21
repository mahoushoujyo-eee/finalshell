import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JProgressBar;

public class LA extends JProgressBar {
   Color u;
   boolean o;
   private static final long[] a;
   private static final Integer[] b;

   public LA() {
      com.c.c(548169015367063400L).set(this, new Color(a(20913, 3757011542104513651L), a(1097, 7308383483538983305L), a(17683, 7045710154577283282L)));
      com.c.c(524054938668265416L).setBoolean(this, true);
   }

   @Override
   protected void paintComponent(Graphics var1) {
      Graphics2D var3;
      int var5;
      label13: {
         int[] var10000 = Jx_2.O();
         var3 = (Graphics2D)var1;
         float var4 = (float)this.getValue() / (float)this.getMaximum();
         int[] var2 = var10000;
         var5 = (int)(var4 * (float)this.getWidth());
         Graphics2D var7 = var3;
         if (var2 == null) {
            var3.setColor((Color)com.c.c(548169015367063400L).get(this));
            if (!com.c.c(524054938668265416L).getBoolean(this)) {
               break label13;
            }

            var7 = var3;
         }

         var7.drawRect(1, 0, this.getWidth() - 2, this.getHeight() - 1);
      }

      Color var6 = new Color(a(21902, 1904925436851820618L), a(19557, 1141333931079172518L), a(4195, 3399687477894700454L));
      var3.setColor(var6);
      var3.fillRect(2, 1, var5, this.getHeight() - 2);
   }

   public boolean g() {
      return com.c.c(524054938668265416L).getBoolean(this);
   }

   public void T(boolean var1) {
      com.c.c(524054938668265416L).setBoolean(this, var1);
   }

   static {
      long var0 = 7993357185177071810L;
      long[] var6 = new long[6];
      int var3 = 0;
      String var4 = "\u0098*ó°(º¸®\u000f«Ø7ëçùÿà\u009bº\u001c\u00adX±¸#ý\u007f>ñe,'";
      int var5 = "\u0098*ó°(º¸®\u000f«Ø7ëçùÿà\u009bº\u001c\u00adX±¸#ý\u007f>ñe,'".length();
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
                     b = new Integer[6];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "\u009aßè[Ò\nm\u009b\u0013)\u0085òòc(<";
                  var5 = "\u009aßè[Ò\nm\u009b\u0013)\u0085òòc(<".length();
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 19905;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}





