import java.awt.Color;
import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableCellRenderer;

public class cC_3 extends DefaultTableCellRenderer {
   Border j;
   JLabel s;
   private static final long[] a;
   private static final Integer[] b;

   public cC_3() {
      com.c.c(332556289657322240L).set(this, BorderFactory.createEmptyBorder(0, a(18607, 3269062062980860896L), 0, 4));
      com.c.c(328499212841214311L).set(this, new JLabel());
      ((JLabel)com.c.c(328499212841214311L).get(this)).setOpaque(false);
      ((JLabel)com.c.c(328499212841214311L).get(this)).setBorder((Border)com.c.c(332556289657322240L).get(this));
   }

   @Override
   public Component getTableCellRendererComponent(JTable var1, Object var2, boolean var3, boolean var4, int var5, int var6) {
      int var10000 = Uo_2.i();
      String var8 = "";
      boolean var7 = (boolean)var10000;
      var10000 = var2.getClass().equals(String.class);
      if (!var7) {
         if (var10000 != 0) {
            var8 = (String)var2;
         }

         ((JLabel)com.c.c(328499212841214311L).get(this)).setText(var8);
         var10000 = var3;
      }

      if (!var7) {
         if (var10000 != 0) {
            ((JLabel)com.c.c(328499212841214311L).get(this)).setBackground((Color)com.c.c(623875439513009390L).get(null));
            ((JLabel)com.c.c(328499212841214311L).get(this)).setForeground((Color)com.c.c(513155505692963448L).get(null));
            ((JLabel)com.c.c(328499212841214311L).get(this)).setOpaque(true);
            if (!var7) {
               return (JLabel)com.c.c(328499212841214311L).get(this);
            }
         }

         var10000 = var5 % 2;
      }

      int var9 = var10000;
      ((JLabel)com.c.c(328499212841214311L).get(this))
         .setForeground(new Color(a(18064, 8934967926841968094L), a(29928, 4784423068431398816L), a(29928, 4784423068431398816L)));
      if (!var7) {
         if (var9 == 0) {
            ((JLabel)com.c.c(328499212841214311L).get(this)).setOpaque(false);
            if (!var7) {
               return (JLabel)com.c.c(328499212841214311L).get(this);
            }
         }

         ((JLabel)com.c.c(328499212841214311L).get(this)).setOpaque(true);
      }

      ((JLabel)com.c.c(328499212841214311L).get(this))
         .setBackground(new Color(a(27875, 6152197716845539240L), a(4519, 3305820026644452077L), a(4519, 3305820026644452077L), a(222, 1429018933008253847L)));
      return (JLabel)com.c.c(328499212841214311L).get(this);
   }

   static {
      long var0 = 9118749117672873083L;
      long[] var6 = new long[6];
      int var3 = 0;
      String var4 = "\u009eùö\u0099ùO\u008eòëoàÑ.@s·kõ\u009cÎëÅëéÚ}q<\u0095\u008f\u009fæ";
      int var5 = "\u009eùö\u0099ùO\u008eòëoàÑ.@s·kõ\u009cÎëÅëéÚ}q<\u0095\u008f\u009fæ".length();
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

                  var4 = "ÿ´]7\f Ù\u0097¸Í\u008b{&bW\u0093";
                  var5 = "ÿ´]7\f Ù\u0097¸Í\u008b{&bW\u0093".length();
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 17226;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}





