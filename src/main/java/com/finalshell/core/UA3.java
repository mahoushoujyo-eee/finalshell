package com.finalshell.core;

import com.finalshell.reflect.Registry;
import com.finalshell.ui.adapter.ReservedAddressCellRenderer;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JTable;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

public class UA3 extends JTable {
   public static long[] a;
   public static Integer[] b;

   public UA3() {
      this.setSelectionBackground((Color)Registry.lookupField(623875439513009390L).get(null));
      this.setSelectionForeground((Color)Registry.lookupField(513155505692963448L).get(null));
      this.setBorder(null);
      this.setDragEnabled(false);
      this.setShowGrid(false);
      this.setAutoResizeMode(3);
      this.setIntercellSpacing(new Dimension(0, 0));
      this.setSelectionMode(0);
      this.addMouseListener(new com.finalshell.ui.listener.U(this));
   }

   @Override
   public void setModel(TableModel var1) {
      int[] var10000 = L9.X();
      super.setModel(var1);
      TableColumnModel var3 = this.getColumnModel();
      int[] var2 = var10000;
      this.setPreferredScrollableViewportSize(new Dimension(a(6556, 7497739156182494726L), a(17690, 1441599798093984393L)));
      TableColumnModel var6 = var3;
      if (var2 == null) {
         if (var3.getColumnCount() <= 2) {
            return;
         }

         var3.getColumn(0).setPreferredWidth(a(22601, 3353290053650657232L));
         var3.getColumn(0).setMinWidth(a(27908, 2904329102998739601L));
         var3.getColumn(0).setMaxWidth(a(12979, 4783578787255469348L));
         var3.getColumn(1).setPreferredWidth(a(28869, 945635511555491669L));
         var3.getColumn(1).setMinWidth(a(2189, 5174710335906807579L));
         var3.getColumn(2).setPreferredWidth(a(22629, 2442632864783446001L));
         var3.getColumn(2).setMinWidth(a(27711, 6598046465395792814L));
         var3.getColumn(2).setMaxWidth(a(27711, 6598046465395792814L));
         var3.getColumn(3).setPreferredWidth(a(27711, 6598046465395792814L));
         var3.getColumn(3).setMinWidth(a(27711, 6598046465395792814L));
         var3.getColumn(3).setMaxWidth(a(27711, 6598046465395792814L));
         var3.getColumn(4).setPreferredWidth(a(23065, 826086892827716994L));
         var6 = var3;
      }

      var6.getColumn(4).setMinWidth(a(6868, 1688547314968227142L));
      ReservedAddressCellRenderer var4 = new ReservedAddressCellRenderer();
      int var5 = 0;

      while (var5 < var3.getColumnCount()) {
         var3.getColumn(var5).setCellRenderer(var4);
         var5++;
         if (var2 != null) {
            break;
         }
      }
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 30611;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 6137642646206389079L;
      long[] var6 = new long[11];
      int var3 = 0;
      String var4 = "ö¬®g4Á\u000eÎÖ+\u0006³úuv\u00931Xð@°\u001b\u0080Å\u009c¨à\u0089\u0004)\u001d.éµª*Ô\u001f^m\tZ¿ßî/ä¶\u0017Ùàvºz\u0001Øà*¿ÒËw4\u009a\u0015üÒ¤-ñ¥]";
      int var5 = "ö¬®g4Á\u000eÎÖ+\u0006³úuv\u00931Xð@°\u001b\u0080Å\u009c¨à\u0089\u0004)\u001d.éµª*Ô\u001f^m\tZ¿ßî/ä¶\u0017Ùàvºz\u0001Øà*¿ÒËw4\u009a\u0015üÒ¤-ñ¥]"
         .length();
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
                     b = new Integer[11];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "1+qþ{ »q\u0003®.´YÙ4\u0093";
                  var5 = "1+qþ{ »q\u0003®.´YÙ4\u0093".length();
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
}





