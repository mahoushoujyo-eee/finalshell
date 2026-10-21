package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.adapter.ReservedAddressAdapter;
import java.awt.Color;
import java.awt.Dimension;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import javax.swing.JTable;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableRowSorter;

public class Y62_2 extends JTable {
   public com.finalshell.ui.model.GR X;
   public int u;
   public int e;
   public HashMap f;
   public static String[] i;
   public static long[] a;
   public static Integer[] b;

   public Y62_2() {
      Registry.lookupField(200363817758425901L).setInt(this, -1);
      Registry.lookupField(236308356153440319L).setInt(this, -1);
      HashMap var10001 = new HashMap();
      long var3 = 546147398846122589L;
      HashMap var2 = var10001;
      Ref.s(546147398846122589L, var2, var3);
      this.setSelectionBackground((Color)Registry.lookupField(623875439513009390L).get(null));
      this.setSelectionForeground((Color)Registry.lookupField(513155505692963448L).get(null));
      this.setBorder(null);
      this.setDragEnabled(false);
      this.setShowGrid(false);
      this.setAutoResizeMode(3);
      this.setIntercellSpacing(new Dimension(0, 0));
      this.setAutoscrolls(false);
      this.setSelectionMode(0);
      JTableHeader var1 = this.getTableHeader();
      Registry.emptyArgs();
      long var4 = 454647487873911743L;
      Object var10002 = Ref.h2(454647487873911743L, var4);

      try {
         var7 = (Boolean)var10002;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      if (var7) {
         var1.addMouseListener(new com.finalshell.ui.listener.K2(this, var1));
      }
   }

   public boolean T(String var1) {
      Object var2 = 546147398846122589L;
      return ((HashMap)Ref.g(546147398846122589L, var2)).containsKey(var1);
   }

   public void S(String var1) {
      Object var2 = 546147398846122589L;
      ((HashMap)Ref.g(546147398846122589L, var2)).put(var1, var1);
   }

   public void s(com.finalshell.ui.model.GR var1) {
      long var9 = 256673248699809908L;
      Ref.s(256673248699809908L, var1, var9);
      super.setModel(var1);
      String[] var10001 = Z();
      TableColumnModel var3 = this.getColumnModel();
      this.setPreferredScrollableViewportSize(new Dimension(a(18594, 1289353088140141711L), a(6571, 5198171512366642561L)));
      String[] var2 = var10001;
      if (var2 != null) {
         if (var3.getColumnCount() > 2) {
            int var4 = -1;
            int var5 = a(9330, 2447733586420172894L);
            var4++;
            var5 = a(14012, 2480174775648852628L);
            var3.getColumn(var4).setPreferredWidth(a(6021, 1688810638526495651L));
            var3.getColumn(var4).setMaxWidth(a(29141, 274934773994282482L));
            var3.getColumn(var4).setMinWidth(a(31769, 4265660311765274672L));
            var4++;
            var5 = a(27201, 8230874025373976174L);
            var3.getColumn(var4).setPreferredWidth(var5);
            var3.getColumn(var4).setMinWidth(var5);
            var3.getColumn(var4).setMaxWidth(var5);
            var5 = a(4107, 7367568161765440544L);
            var3.getColumn(++var4).setPreferredWidth(var5);
            var3.getColumn(var4).setMinWidth(var5);
            var3.getColumn(var4).setMaxWidth(var5);
            var5 = a(3757, 617792856610677379L);
            var3.getColumn(++var4).setPreferredWidth(var5);
            var3.getColumn(var4).setMinWidth(var5);
            var3.getColumn(var4).setMaxWidth(var5);
            var3.getColumn(++var4).setPreferredWidth(var5);
            var3.getColumn(var4).setMinWidth(var5);
            var3.getColumn(var4).setMaxWidth(var5);
            ReservedAddressAdapter var6 = new ReservedAddressAdapter();
            int var7 = 0;

            while (var7 < var3.getColumnCount()) {
               var3.getColumn(var7).setCellRenderer(var6);
               var7++;
               if (var2 == null) {
                  return;
               }

               if (var2 == null) {
                  break;
               }
            }
         }

         TableRowSorter var10003 = (TableRowSorter)(Registry.emptyArgs());
         long var11 = 230834458731374925L;
         Object[] var10 = var10003;
         var10003 = Ref.h(230834458731374925L, var10, var11);

         try {
            var10003 = (TableRowSorter)var10003;
         } catch (InvocationTargetException var12) {
            throw var12.getTargetException();
         }

         this.setRowSorter(var10003);
         this.getRowSorter().toggleSortOrder(3);
      }
   }

   public TableRowSorter g() {
      com.finalshell.ui.model.GR var2 = (com.finalshell.ui.model.GR)this.getModel();
      String[] var10000 = Z();
      D72 var3 = new D72(this, var2);
      String[] var1 = var10000;
      int var4 = 0;

      do {
         Object[] var10002 = Registry.emptyArgs();
         long var8 = 551196522578718340L;
         Object[] var7 = var10002;
         var10002 = Ref.h(551196522578718340L, var7, var8);

         try {
            var14 = (Integer)var10002;
         } catch (InvocationTargetException var11) {
            throw var11.getTargetException();
         }

         if (!(var2 < var14)) {
            break;
         }

         var10002 = Registry.packArgs(var4);
         long var10 = 553983040773288467L;
         Object[] var9 = var10002;
         var10002 = Ref.h(553983040773288467L, var9, var10);

         try {
            var10002 = (String)var10002;
         } catch (InvocationTargetException var12) {
            throw var12.getTargetException();
         }

         label40: {
            com.finalshell.ui.model.Ct2 var6;
            label39: {
               String var5 = var10002;
               var6 = new com.finalshell.ui.model.Ct2(this, var5);
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

   public int Y() {
      return Registry.lookupField(200363817758425901L).getInt(this);
   }

   public void R(int var1) {
      Registry.lookupField(200363817758425901L).setInt(this, var1);
   }

   public static void t(String[] var0) {
      i = var0;
   }

   public static String[] Z() {
      return i;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 11310;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 8161029370958280936L;
      long[] var6 = new long[10];
      String[] var10000 = new String[1];
      int var3 = 0;
      t(var10000);
      String var4 = "\u0098\u000b\u0011\u0013\"rÚ;\u00adoT¸x\u0018¾û8Âô\u0005:!pÒmC\u0019\u009c9ÚRG\u0093½9\u0086]Tjy+\u001d´#\u0015þÄ\u008e+«¹½2\u0010bÂf\u001d+·®?(¼";
      int var5 = "\u0098\u000b\u0011\u0013\"rÚ;\u00adoT¸x\u0018¾û8Âô\u0005:!pÒmC\u0019\u009c9ÚRG\u0093½9\u0086]Tjy+\u001d´#\u0015þÄ\u008e+«¹½2\u0010bÂf\u001d+·®?(¼"
         .length();
      byte var2 = 0;

      label20:
      while (true) {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         long[] var9 = var6;
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
            long var14 = var10002 ^ var0;
            switch (var10003) {
               case 0:
                  var9[var10001] = var14;
                  if (var2 >= var5) {
                     a = var6;
                     b = new Integer[10];
                     return;
                  }
                  break;
               default:
                  var9[var10001] = var14;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "Rw q«:Âg\u0091.\u007f\u009a5+¥ü";
                  var5 = "Rw q«:Âg\u0091.\u007f\u009a5+¥ü".length();
                  var2 = 0;
            }

            byte var11 = var2;
            var2 += 8;
            var7 = var4.substring(var11, var2).getBytes("ISO-8859-1");
            var9 = var6;
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





