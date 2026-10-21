package com.finalshell.ui.panel;

import com.finalshell.core.Km2;
import com.finalshell.reflect.Ref;
import java.awt.Color;
import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.TableCellRenderer;

public class KL extends JLabel implements TableCellRenderer {
   public final Border U = BorderFactory.createCompoundBorder(
      BorderFactory.createMatteBorder(1, 1, 0, 0, new Color(a(16700, 7768351546985926532L), a(14500, 8924090082085877277L), a(14500, 8924090082085877277L))),
      BorderFactory.createEmptyBorder(2, 2, 1, 2)
   );
   public final Color F = new Color(0, true);
   public static long[] a;
   public static Integer[] b;

   @Override
   public Component getTableCellRendererComponent(JTable var1, Object var2, boolean var3, boolean var4, int var5, int var6) {
      String var12;
      label14: {
         String var7 = Km2.U$String();
         var12 = (String)var2;
         if (var7 == null) {
            if (var2 == null) {
               var12 = "";
               break label14;
            }

            var12 = (String)var2;
         }

         var12 = var12.toString();
      }

      this.setText(var12);
      this.setHorizontalAlignment(0);
      this.setOpaque(false);
      Object var8 = 302219736954338503L;
      this.setBackground((Color)Ref.g(302219736954338503L, var8));
      this.setForeground(Color.BLACK);
      Object var10 = 199364541266016669L;
      this.setBorder((Border)Ref.g(199364541266016669L, var10));
      return this;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 3769;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 4838082143190303202L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "\u008f\u0084'2¥Twi\u0013±ÃÈ£w\u000eð";
      int var5 = "\u008f\u0084'2¥Twi\u0013±ÃÈ£w\u000eð".length();
      byte var2 = 0;

      do {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes(java.nio.charset.Charset.forName("ISO-8859-1"));
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
}





