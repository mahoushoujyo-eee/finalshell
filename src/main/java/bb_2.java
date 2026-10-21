import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;

public class Bb_2 extends JLabel {
   float t;
   Color j;
   Color S;
   Color M;
   private static final long[] a;
   private static final Integer[] b;

   public Bb_2() {
      com.c.c(320109642003167991L)
         .set(this, new Color(a(13150, 5018521600442028481L), a(3250, 4933275102930693678L), a(3250, 4933275102930693678L), a(16264, 2382114477901208848L)));
      com.c.c(241244696636935484L)
         .set(this, new Color(a(22997, 1285890374411270987L), a(22997, 1285890374411270987L), a(22997, 1285890374411270987L), a(22997, 1285890374411270987L)));
      com.c.c(175684390310739956L)
         .set(this, new Color(a(6491, 178927690734074816L), a(22997, 1285890374411270987L), a(19754, 8561380314086485943L), a(25562, 1403116900173644099L)));
      this.setHorizontalAlignment(2);
      this.setForeground(new Color(a(30092, 3631477624986998557L), a(8203, 8756770977363214993L), a(8203, 8756770977363214993L)));
      this.setBorder(new EmptyBorder(0, 3, 0, 0));
   }

   @Override
   public void paint(Graphics var1) {
      label33: {
         Graphics2D var3;
         byte var5;
         byte var6;
         int var9;
         int var10;
         label35: {
            boolean var2;
            int var12;
            label36: {
               var3 = (Graphics2D)var1;
               float var4 = com.c.c(224347986923037516L).getFloat(this);
               int var10000 = xN.T();
               var5 = 0;
               var6 = 0;
               byte var7 = 0;
               byte var8 = 0;
               var2 = (boolean)var10000;
               var9 = (int)(((float)this.getWidth() - (float)var8) * var4) + var7;
               float var13;
               var10000 = (var13 = var4 - 0.006F) == 0.0F ? 0 : (var13 < 0.0F ? -1 : 1);
               if (var2) {
                  if (var10000 > 0) {
                     var10 = 1;
                     var12 = var9;
                     if (!var2) {
                        break label36;
                     }

                     if (var9 < var10) {
                        var9 = var10;
                     }
                  }

                  var10000 = var5;
               }

               var10 = var10000;
               var3.setColor((Color)com.c.c(175684390310739956L).get(this));
               if (!var2) {
                  break label35;
               }

               float var14;
               var12 = (var14 = var4 - 0.0F) == 0.0F ? 0 : (var14 < 0.0F ? -1 : 1);
            }

            if (var12 > 0) {
               var3.fillRect(var6, var10, var9, this.getHeight() - 2 * var5);
               if (var2) {
                  break label33;
               }
            }

            var3.setColor((Color)com.c.c(320109642003167991L).get(this));
         }

         var3.fillRect(var6, var10, var9, this.getHeight() - 2 * var5);
      }

      super.paint(var1);
   }

   public float Z() {
      return com.c.c(224347986923037516L).getFloat(this);
   }

   public void F(float var1) {
      com.c.c(224347986923037516L).setFloat(this, var1);
      StringBuilder var10000 = new StringBuilder();
      Object[] var10001 = com.c.a(100.0F * var1);
      Method var4 = com.c.d(443004786775321843L);
      Object[] var7 = var10001;
      Object var6 = null;

      try {
         var10001 = (String)var4.invoke(var6, var7);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      String var2 = var10000.append((String)var10001).append("%").toString();
      this.setText(var2);
      this.repaint();
   }

   static {
      long var0 = 208316726611882267L;
      long[] var6 = new long[9];
      int var3 = 0;
      String var4 = "½ \u0016¸wK°Î\u001aÈÀV¯äìÃ\u0015×]\u0088ìÖJé8JuñwVsÌ+Î\u009e6\u0092\\\u009eüí)=\u0003\u0003\u000f_ÏK\u001e¹¬á\u0081à ";
      int var5 = "½ \u0016¸wK°Î\u001aÈÀV¯äìÃ\u0015×]\u0088ìÖJé8JuñwVsÌ+Î\u009e6\u0092\\\u009eüí)=\u0003\u0003\u000f_ÏK\u001e¹¬á\u0081à ".length();
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
                     b = new Integer[9];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "\u0017Î\u008cí\u0000\u0099\u008a\u0098Û\u008b\u007f\u008c]X&@";
                  var5 = "\u0017Î\u008cí\u0000\u0099\u008a\u0098Û\u008b\u007f\u008c]X&@".length();
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 25241;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}





