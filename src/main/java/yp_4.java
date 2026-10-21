import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.JPanel;

public class yp_4 extends JPanel {
   BufferedImage a;
   U t;
   BufferedImage I;
   Dimension Z;
   private static final long[] b;
   private static final Integer[] c;

   public yp_4(U var1) {
      com.c.c(144144297701832345L).set(this, new Dimension());
      com.c.c(353594629265861369L).set(this, var1);
      this.setBackground(new Color(a(23044, 7231760300941467345L), a(30567, 7967035522027418547L), a(30567, 7967035522027418547L)));
   }

   @Override
   public void paint(Graphics var1) {
      super.paint(var1);
   }

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
   }

   private void C(Graphics var1) {
      String[] var10000 = F8.y();
      Graphics2D var3 = (Graphics2D)var1;
      int var4 = ((BufferedImage)com.c.c(598164442605824123L).get(this)).getWidth();
      String[] var2 = var10000;
      int var5 = ((BufferedImage)com.c.c(598164442605824123L).get(this)).getHeight();
      int var6 = 0;

      while (true) {
         if (var6 < this.getHeight()) {
            if (var2 != null) {
               break;
            }

            int var7 = 0;

            label27: {
               while (var7 < this.getWidth()) {
                  var3.drawImage((BufferedImage)com.c.c(598164442605824123L).get(this), var7, var6, this);
                  var7 += var4;
                  if (var2 != null) {
                     break label27;
                  }

                  if (var2 != null) {
                     break;
                  }
               }

               var6 += var5;
            }

            if (var2 == null) {
               continue;
            }
         }

         var3.drawImage((BufferedImage)com.c.c(598164442605824123L).get(this), 0, 0, this.getWidth(), this.getHeight(), this);
         break;
      }
   }

   public void s(BufferedImage var1) {
      Object[] var10001 = com.c.a(var1.getGraphics());
      Method var10003 = com.c.d(625791441337438829L);
      Object[] var10002 = var10001;
      yp_4 var3 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var3, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }

   public void C(BufferedImage var1, Point var2) {
      Graphics2D var3 = (Graphics2D)var1.getGraphics();
      if ((BufferedImage)com.c.c(452126640426893815L).get(this) != null) {
         var3.drawImage((BufferedImage)com.c.c(452126640426893815L).get(this), -var2.x, -var2.y, null);
      }
   }

   static {
      long var0 = 4738516379375152624L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "\u008b>î\u008d\bZ^¼=\u0083ä3\reóÞ";
      int var5 = "\u008b>î\u008d\bZ^¼=\u0083ä3\reóÞ".length();
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

      b = var6;
      c = new Integer[2];
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 1236;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }
}





