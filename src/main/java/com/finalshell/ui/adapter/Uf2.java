package com.finalshell.ui.adapter;

import com.finalshell.core.UE;
import com.finalshell.ui.panel.Ky4;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.plaf.UIResource;
import javax.swing.table.TableCellRenderer;

public class Uf2 extends UE implements TableCellRenderer, UIResource {
   public static long[] a;
   public static Integer[] b;

   public Uf2() {
      this.setOpaque(true);
      this.w(false);
      this.setHorizontalAlignment(0);
      this.e(0);
      this.G(a(9471, 7808670988718638613L));
      this.u(a(19426, 486270676413802761L));
   }

   @Override
   public Component getTableCellRendererComponent(JTable var1, Object var2, boolean var3, boolean var4, int var5, int var6) {
      boolean var7;
      boolean var8;
      label40: {
         label44: {
            var7 = Oe2.a();
            this.setForeground(var3 ? var1.getSelectionForeground() : var1.getForeground());
            this.setBackground(var3 ? var1.getSelectionBackground() : var1.getBackground());
            Object var10001 = var2;
            if (var7) {
               if (var2 == null) {
                  break label44;
               }

               var10001 = var2;
            }

            var8 = (Boolean)var10001;
            if (!var7) {
               break label40;
            }

            if (var8) {
               var8 = true;
               break label40;
            }
         }

         var8 = false;
      }

      this.setSelected(var8);
      this.setEnabled(var1.isEnabled());
      if (Ky4.F$arrString() != null) {
         Oe2.g(!var7);
      }

      return this;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 8938;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 1774424850215904762L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = ",\u009c\u0006©\u009fÇ£ãx¦ÎmiëÌÿ";
      int var5 = ",\u009c\u0006©\u009fÇ£ãx¦ÎmiëÌÿ".length();
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
}





