import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.AbstractButton;
import javax.swing.JComponent;
import javax.swing.JMenuBar;

class QG extends JComponent implements ItemListener {
   Point f;
   private static final long[] a;
   private static final Integer[] b;

   @Override
   public void itemStateChanged(ItemEvent var1) {
      String var2 = aA.z();
      int var10001 = var1.getStateChange();
      if (var2 == null) {
         var10001 = var10001 == 1 ? 1 : 0;
      }

      this.setVisible((boolean)var10001);
   }

   @Override
   protected void paintComponent(Graphics var1) {
      String var2 = aA.z();
      if (var2 == null) {
         if ((Point)com.c.c(375845063199368784L).get(this) == null) {
            return;
         }

         var1.setColor(Color.red);
      }

      var1.fillOval(
         ((Point)com.c.c(375845063199368784L).get(this)).x - a(29412, 8977705369896610596L),
         ((Point)com.c.c(375845063199368784L).get(this)).y - a(26312, 7751287107741482763L),
         a(14709, 4563627486387183796L),
         a(7347, 7245962285301433713L)
      );
   }

   public void T(Point var1) {
      com.c.c(375845063199368784L).set(this, var1);
   }

   public QG(AbstractButton var1, JMenuBar var2, Container var3) {
      O1 var4 = new O1(var1, var2, this, var3);
      this.addMouseListener(var4);
      this.addMouseMotionListener(var4);
   }

   static {
      long var0 = 3598342783229254806L;
      long[] var6 = new long[4];
      int var3 = 0;
      String var4 = "_KN{C)|6¤6ã\u0088\u0080µ·¸";
      int var5 = "_KN{C)|6¤6ã\u0088\u0080µ·¸".length();
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

                  var4 = "þÖØ¥>\u0086£\u0097²Cv\u0082\u0089=Yó";
                  var5 = "þÖØ¥>\u0086£\u0097²Cv\u0082\u0089=Yó".length();
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 6593;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}





