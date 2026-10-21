import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.TableColumnModel;

public class Yy_2 extends JTable {
   z_ n;
   c6_2 f;
   private static final long[] a;
   private static final Integer[] b;

   Yy_2(z_ var1, c6_2 var2) {
      com.ky_4[] var10002 = z_.t();
      com.c.c(567473403098937361L).set(this, var1);
      com.ky_4[] var3 = var10002;
      com.c.c(578695750651372926L).set(this, var2);
      this.setModel(var2);
      this.setSelectionBackground((Color)com.c.c(623875439513009390L).get(null));
      this.setSelectionMode(0);
      JI var4 = new JI();
      this.setDefaultRenderer(lD_3.class, var4);
      this.setShowGrid(false);
      int var5 = a(24765, 747603782168300477L);
      this.setGridColor(new Color(var5, var5, var5));
      this.addMouseListener(new Jh_2(this, var2, var1));
      TableColumnModel var6 = this.getColumnModel();
      TableColumnModel var10000 = var6;
      if (var3 == null) {
         if (var6.getColumnCount() <= 2) {
            return;
         }

         var6.getColumn(0).setPreferredWidth(a(12745, 2358495401579289288L));
         var6.getColumn(1).setPreferredWidth(a(15196, 3767527622567366751L));
         var6.getColumn(2).setPreferredWidth(a(2467, 7554511668053484198L));
         var6.getColumn(3).setPreferredWidth(a(31650, 2918051882401878182L));
         var10000 = var6;
      }

      var10000.getColumn(4).setPreferredWidth(a(3960, 5802092705360422010L));
   }

   static {
      long var0 = 6163276181693750193L;
      long[] var6 = new long[6];
      int var3 = 0;
      String var4 = "Þ\u0082\u00885\u0001ýÁQ3^ôºª\u009a\u0010Ä¥Ï\u008c\u0081>âË\u0096ÊææUF\u009fÿù";
      int var5 = "Þ\u0082\u00885\u0001ýÁQ3^ôºª\u009a\u0010Ä¥Ï\u008c\u0081>âË\u0096ÊææUF\u009fÿù".length();
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

                  var4 = "Ô\u009e\u009cvO¤y+P¬\u0092Y\u0098Â\u000b·";
                  var5 = "Ô\u009e\u009cvO¤y+P¬\u0092Y\u0098Â\u000b·".length();
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 11009;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}





