import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import javax.swing.border.AbstractBorder;

public class Bs_2 extends AbstractBorder {
   Insets x;
   private static final long[] a;
   private static final Integer[] b;

   Bs_2() {
      com.c.c(522811950581095936L).set(this, new Insets(1, 2, 2, 2));
   }

   @Override
   public void paintBorder(Component var1, Graphics var2, int var3, int var4, int var5, int var6) {
      Color var7 = new Color(a(15512, 3715978757088061884L), a(21472, 1580228450060256965L), a(21472, 1580228450060256965L));
      Color var8 = new Color(a(11102, 4168143159109041785L), a(23122, 1107317908115738484L), a(23122, 1107317908115738484L));
      byte var9 = 0;
      Graphics2D var10 = (Graphics2D)var2;
      var10.setColor(var7);
      var10.drawRoundRect(0, 0, var1.getWidth() - 1, var1.getHeight() - 1, var9, var9);
      var10.setColor(var8);
      var10.drawRoundRect(1, 1, var1.getWidth() - 3, var1.getHeight() - 3, var9, var9);
   }

   @Override
   public Insets getBorderInsets(Component var1) {
      return (Insets)com.c.c(522811950581095936L).get(this);
   }

   static {
      long var0 = 2517165282185918980L;
      long[] var6 = new long[4];
      int var3 = 0;
      String var4 = "ñ=^ç\u0093\tõ\u0096X{5ãF\b\u0004\u009b";
      int var5 = "ñ=^ç\u0093\tõ\u0096X{5ãF\b\u0004\u009b".length();
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
                     b = new Integer[4];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "Ì¡¤£\u0004\u0082\u0093Àë\u0014äXðmü¹";
                  var5 = "Ì¡¤£\u0004\u0082\u0093Àë\u0014äXðmü¹".length();
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 5414;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}





