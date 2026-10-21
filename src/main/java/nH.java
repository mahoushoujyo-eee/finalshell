import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.TableColumnModel;

public class nH extends JTable {
   zw_2 T;
   c1_2 u;
   private static final long[] a;
   private static final Integer[] b;

   nH(zw_2 var1, c1_2 var2) {
      com.c.c(224289223987730926L).set(this, var1);
      com.c.c(272693378417955390L).set(this, var2);
      this.setModel(var2);
      this.setSelectionBackground((Color)com.c.c(623875439513009390L).get(null));
      this.setSelectionMode(0);
      g5 var4 = new g5();
      String var10000 = zw_2.V();
      this.setDefaultRenderer(Object.class, var4);
      this.setShowGrid(false);
      int var5 = a(17100, 5986239008465241447L);
      this.setGridColor(new Color(var5, var5, var5));
      this.addMouseListener(new L7(this, var2, var1));
      String var3 = var10000;
      TableColumnModel var6 = this.getColumnModel();
      TableColumnModel var7 = var6;
      if (var3 != null) {
         if (var6.getColumnCount() <= 2) {
            return;
         }

         var6.getColumn(0).setPreferredWidth(a(21343, 7822676642979435766L));
         var6.getColumn(1).setPreferredWidth(a(20796, 2367603294841067152L));
         var6.getColumn(2).setPreferredWidth(a(31576, 4470151544674286832L));
         var6.getColumn(3).setPreferredWidth(a(24214, 6504671289324689724L));
         var7 = var6;
      }

      var7.getColumn(4).setPreferredWidth(a(31576, 4470151544674286832L));
   }

   static {
      long var0 = 6498198663017808661L;
      long[] var6 = new long[5];
      int var3 = 0;
      String var4 = "\u0097K\u0010\u0010-a?ÙxÃ?Æ¬\u0090\u0097¼±ßnÌAù\u001av";
      int var5 = "\u0097K\u0010\u0010-a?ÙxÃ?Æ¬\u0090\u0097¼±ßnÌAù\u001av".length();
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
                     b = new Integer[5];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "ä1¯a%0\u0006º\u0093üæ\u0013C\u0013\u0095¹";
                  var5 = "ä1¯a%0\u0006º\u0093üæ\u0013C\u0013\u0095¹".length();
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 1960;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}





