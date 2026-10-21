package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.adapter.Ug4;
import com.finalshell.ui.listener.VF;
import com.finalshell.ui.model.Dn4_2;
import java.awt.Color;
import java.awt.Dimension;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JTable;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableRowSorter;

public class UT extends JTable {
   com.finalshell.ui.model.Cd4 u;
   int C;
   int H;
   boolean S;
   public static long[] a;
   public static Integer[] b;

   public UT(boolean var1) {
      Registry.lookupField(369213064747264380L).setInt(this, -1);
      Registry.lookupField(448041790433139499L).setInt(this, -1);
      Registry.lookupField(180122678087780601L).setBoolean(this, false);
      Registry.lookupField(180122678087780601L).setBoolean(this, var1);
      this.setSelectionBackground((Color)Registry.lookupField(623875439513009390L).get(null));
      this.setSelectionForeground((Color)Registry.lookupField(513155505692963448L).get(null));
      this.setBorder(null);
      this.setDragEnabled(false);
      this.setShowGrid(false);
      this.setAutoResizeMode(3);
      this.setIntercellSpacing(new Dimension(0, 0));
      this.setAutoscrolls(false);
      this.setSelectionMode(0);
   }

   public void I(com.finalshell.ui.model.Cd4 var1) {
      com.finalshell.ui.panel.CE.S$arrint();
      long var10 = 319541183701528273L;
      Ref.s(319541183701528273L, var1, var10);
      super.setModel(var1);
      TableColumnModel var3 = this.getColumnModel();
      UT var2 = this;
      this.setPreferredScrollableViewportSize(new Dimension(a(4966, 1471701062211156622L), a(22104, 3154209052382363571L)));
      label44:
      if (this != null) {
         if (var3.getColumnCount() > 2) {
            int var4 = 0;
            int var5 = a(13328, 1553563138183437820L);
            var3.getColumn(var4).setPreferredWidth(var5);
            var3.getColumn(var4).setMinWidth(var5);
            var3.getColumn(var4).setMaxWidth(var5);
            var3.getColumn(++var4).setPreferredWidth(a(3068, 3888436801612685846L));
            var3.getColumn(var4).setMaxWidth(a(6703, 1814893459250066369L));
            var3.getColumn(var4).setMinWidth(a(25145, 7079552701270117340L));
            int var6 = a(19192, 1704274628962083607L);
            var3.getColumn(++var4).setPreferredWidth(var6);
            var3.getColumn(var4).setMinWidth(var6);
            var3.getColumn(var4).setMaxWidth(var6);
            var6 = a(8112, 2838644309321496148L);
            var3.getColumn(++var4).setPreferredWidth(var6);
            var3.getColumn(var4).setMinWidth(var6);
            var3.getColumn(var4).setMaxWidth(var6);
            var6 = a(16422, 3338968632610515407L);
            var3.getColumn(++var4).setPreferredWidth(var6);
            var3.getColumn(var4).setMinWidth(var6);
            var3.getColumn(var4).setMaxWidth(var6);
            var6 = a(10097, 271023927652945564L);
            var3.getColumn(++var4).setPreferredWidth(var6);
            var3.getColumn(var4).setMinWidth(var6);
            var3.getColumn(var4).setMaxWidth(var6);
            var6 = a(10097, 271023927652945564L);
            var3.getColumn(++var4).setPreferredWidth(var6);
            var3.getColumn(var4).setMinWidth(var6);
            var3.getColumn(var4).setMaxWidth(var6);
            var3.getColumn(++var4).setPreferredWidth(var6);
            var3.getColumn(var4).setMinWidth(var6);
            var3.getColumn(var4).setMaxWidth(var6);
            Ug4 var7 = new Ug4(Registry.lookupField(180122678087780601L).getBoolean(this));
            int var8 = 0;

            while (var8 < var3.getColumnCount()) {
               var3.getColumn(var8).setCellRenderer(var7);
               var8++;
               if (var2 == null) {
                  break label44;
               }

               if (var2 == null) {
                  break;
               }
            }
         }

         TableRowSorter var10003 = (TableRowSorter)(Registry.emptyArgs());
         long var12 = 467126060497402896L;
         Object[] var11 = var10003;
         var10003 = Ref.h(467126060497402896L, var11, var12);

         try {
            var10003 = (TableRowSorter)var10003;
         } catch (InvocationTargetException var16) {
            throw var16.getTargetException();
         }

         this.setRowSorter(var10003);
         this.getRowSorter().toggleSortOrder(2);
      }

      JTableHeader var24 = this.getTableHeader();
      Registry.emptyArgs();
      long var13 = 454647487873911743L;
      Object var10002 = Ref.h2(454647487873911743L, var13);

      try {
         var29 = (Boolean)var10002;
      } catch (InvocationTargetException var15) {
         throw var15.getTargetException();
      }

      if (var29) {
         var24.addMouseListener(new VF(this, var24));
      }
   }

   protected TableRowSorter s() {
      int[] var10000 = com.finalshell.ui.panel.CE.S$arrint();
      com.finalshell.ui.model.Cd4 var2 = (com.finalshell.ui.model.Cd4)this.getModel();
      int[] var1 = var10000;
      DP3 var3 = new DP3(this, var2);
      int var4 = 0;

      do {
         Object[] var10002 = Registry.emptyArgs();
         long var8 = 450493786643383164L;
         Object[] var7 = var10002;
         var10002 = Ref.h(450493786643383164L, var7, var8);

         try {
            var14 = (Integer)var10002;
         } catch (InvocationTargetException var11) {
            throw var11.getTargetException();
         }

         if (!(var2 < var14)) {
            break;
         }

         var10002 = Registry.packArgs(var4);
         long var10 = 604487827219043539L;
         Object[] var9 = var10002;
         var10002 = Ref.h(604487827219043539L, var9, var10);

         try {
            var10002 = (String)var10002;
         } catch (InvocationTargetException var12) {
            throw var12.getTargetException();
         }

         label40: {
            Dn4_2 var6;
            label39: {
               String var5 = var10002;
               var6 = new Dn4_2(this, var5);
               if (var1 != null) {
                  if (var6 != null) {
                     break label39;
                  }

                  var3.setSortable(var4, false);
               }

               if (var1 != null) {
                  break label40;
               }
            }

            var3.setComparator(var4, var6);
         }

         var4++;
      } while (var1 != null);

      return var3;
   }

   public int B() {
      return Registry.lookupField(369213064747264380L).getInt(this);
   }

   public void w(int var1) {
      Registry.lookupField(369213064747264380L).setInt(this, var1);
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 10733;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 8568066808941004683L;
      long[] var6 = new long[10];
      int var3 = 0;
      String var4 = "º\u0019}±{ÜÉQgºóç\u0095.Ú\u0013\u009c*¨\u0094,@¤ò\u0087ã\u0015H¹yôÈt\u001e$= U®x\u008d\u009d\u0018Rj\u00173%Åí~&\u001c,\u001f(h\b\u009cf\u00ad\u0010e\u001f";
      int var5 = "º\u0019}±{ÜÉQgºóç\u0095.Ú\u0013\u009c*¨\u0094,@¤ò\u0087ã\u0015H¹yôÈt\u001e$= U®x\u008d\u009d\u0018Rj\u00173%Åí~&\u001c,\u001f(h\b\u009cf\u00ad\u0010e\u001f"
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
                     b = new Integer[10];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "\ró\u001d«Éb\u008c3|\u008db»Ztñ\u0099";
                  var5 = "\ró\u001d«Éb\u008c3|\u008db»Ztñ\u0099".length();
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





