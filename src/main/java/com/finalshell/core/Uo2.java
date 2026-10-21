package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.adapter.F12;
import com.finalshell.ui.listener.GY2;
import com.finalshell.ui.model.JS;
import java.awt.Color;
import java.awt.Dimension;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JTable;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableRowSorter;

public class Uo2 extends JTable {
   com.finalshell.ui.model.Gk2 O;
   int p;
   int T;
   boolean c;
   public static boolean q;
   public static long[] a;
   public static Integer[] b;

   public Uo2(boolean var1) {
      Registry.lookupField(593601365085169143L).setInt(this, -1);
      Registry.lookupField(532627492453842802L).setInt(this, -1);
      Registry.lookupField(131437227183798706L).setBoolean(this, false);
      Registry.lookupField(131437227183798706L).setBoolean(this, var1);
      this.setSelectionBackground((Color)Registry.lookupField(623875439513009390L).get(null));
      this.setSelectionForeground((Color)Registry.lookupField(513155505692963448L).get(null));
      this.setBorder(null);
      this.setDragEnabled(false);
      this.setShowGrid(false);
      this.setAutoResizeMode(3);
      this.setIntercellSpacing(new Dimension(0, 0));
      this.setAutoscrolls(false);
      this.setSelectionMode(0);
      this.addMouseListener(new com.finalshell.ui.listener.TT(this));
   }

   public void a(com.finalshell.ui.model.Gk2 var1) {
      long var8 = 485553230015249294L;
      Ref.s(485553230015249294L, var1, var8);
      int var10001 = (k()) ? 1 : 0;
      super.setModel(var1);
      boolean var2 = (((((boolean)var10001) != 0) != 0) != 0) != 0;
      TableColumnModel var3 = this.getColumnModel();
      this.setPreferredScrollableViewportSize(new Dimension(a(25595, 7063817420701316977L), a(9419, 229963766743134278L)));
      label56:
      if (var2) {
         if (var3.getColumnCount() > 2) {
            label52: {
               int var4 = a(8322, 5857202403724456971L);
               var10001 = (Registry.lookupField(131437227183798706L).getBoolean(this)) ? 1 : 0;
               if (var2) {
                  if (var10001 == 0) {
                     var3.getColumn(0).setPreferredWidth(var4 + a(27045, 1956572961118338340L));
                     var3.getColumn(0).setMinWidth(var4 + a(28876, 8868048237203104844L));
                     var3.getColumn(0).setMaxWidth(var4 + a(28876, 8868048237203104844L));
                     var3.getColumn(1).setPreferredWidth(a(27549, 2142858034283888402L));
                     var3.getColumn(1).setMinWidth(a(15720, 6233352049541310955L));
                     var3.getColumn(1).setMaxWidth(a(19223, 5580837678578835345L));
                     var3.getColumn(2).setPreferredWidth(a(15720, 6233352049541310955L));
                     var3.getColumn(2).setMinWidth(a(15720, 6233352049541310955L));
                     var3.getColumn(2).setMaxWidth(a(16970, 8684712898756220609L));
                     var3.getColumn(3).setPreferredWidth(var4);
                     var3.getColumn(3).setMinWidth(var4);
                     var3.getColumn(3).setMaxWidth(var4);
                     var3.getColumn(4).setPreferredWidth(a(16774, 7739565980523762954L));
                     var3.getColumn(4).setMinWidth(a(29759, 2880920720934641848L));
                     var3.getColumn(5).setPreferredWidth(a(73, 7505577197186700492L));
                     var3.getColumn(5).setMinWidth(a(9237, 1868883256011321501L));
                     if (var2) {
                        break label52;
                     }
                  }

                  var3.getColumn(0).setPreferredWidth(var4 + a(28876, 8868048237203104844L));
                  var3.getColumn(0).setMinWidth(var4 + a(28876, 8868048237203104844L));
                  var3.getColumn(0).setMaxWidth(var4 + a(28876, 8868048237203104844L));
                  var3.getColumn(1).setPreferredWidth(a(31100, 6469178833126927864L));
                  var3.getColumn(1).setMaxWidth(a(10561, 8874418977266793935L));
                  var3.getColumn(1).setMinWidth(a(9237, 1868883256011321501L));
                  var3.getColumn(2).setPreferredWidth(a(15720, 6233352049541310955L));
                  var3.getColumn(2).setMinWidth(a(15720, 6233352049541310955L));
                  var3.getColumn(2).setMaxWidth(a(15720, 6233352049541310955L));
                  var10001 = a(13825, 5180027800035058307L);
               }

               int var5 = var10001;
               var3.getColumn(3).setPreferredWidth(var5);
               var3.getColumn(3).setMinWidth(var5);
               var3.getColumn(3).setMaxWidth(var5);
               var3.getColumn(4).setPreferredWidth(var5);
               var3.getColumn(4).setMinWidth(var5);
               var3.getColumn(4).setMaxWidth(var5);
            }

            F12 var16 = new F12(Registry.lookupField(131437227183798706L).getBoolean(this));
            int var6 = 0;

            while (var6 < var3.getColumnCount()) {
               var3.getColumn(var6).setCellRenderer(var16);
               var6++;
               if (!var2) {
                  break label56;
               }

               if (!var2) {
                  break;
               }
            }
         }

         TableRowSorter var10003 = (TableRowSorter)(Registry.emptyArgs());
         long var10 = 405121016473488372L;
         Object[] var9 = var10003;
         var10003 = Ref.h(405121016473488372L, var9, var10);

         try {
            var10003 = (TableRowSorter)var10003;
         } catch (InvocationTargetException var14) {
            throw var14.getTargetException();
         }

         this.setRowSorter(var10003);
         this.getRowSorter().toggleSortOrder(3);
         this.getTableHeader().addMouseListener(new com.finalshell.ui.listener.WN(this));
      }

      JTableHeader var15 = this.getTableHeader();
      Registry.emptyArgs();
      long var11 = 454647487873911743L;
      Object var10002 = Ref.h2(454647487873911743L, var11);

      try {
         var18 = (Boolean)var10002;
      } catch (InvocationTargetException var13) {
         throw var13.getTargetException();
      }

      if (var18) {
         var15.addMouseListener(new GY2(this, var15));
      }
   }

   protected TableRowSorter f() {
      boolean var10000 = i();
      com.finalshell.ui.model.Gk2 var2 = (com.finalshell.ui.model.Gk2)this.getModel();
      boolean var1 = var10000;
      U92 var3 = new U92(this, var2);
      int var4 = 0;

      do {
         Object[] var10002 = Registry.emptyArgs();
         long var8 = 518333674101172738L;
         Object[] var7 = var10002;
         var10002 = Ref.h(518333674101172738L, var7, var8);

         try {
            var14 = (Integer)var10002;
         } catch (InvocationTargetException var11) {
            throw var11.getTargetException();
         }

         if (!(var2 < var14)) {
            break;
         }

         var10002 = Registry.packArgs(var4);
         long var10 = 612946935588895964L;
         Object[] var9 = var10002;
         var10002 = Ref.h(612946935588895964L, var9, var10);

         try {
            var10002 = (String)var10002;
         } catch (InvocationTargetException var12) {
            throw var12.getTargetException();
         }

         label40: {
            JS var6;
            label39: {
               String var5 = var10002;
               var6 = new JS(this, var5);
               if (!var1) {
                  if (var6 != null) {
                     break label39;
                  }

                  var3.setSortable(var4, false);
               }

               if (!var1) {
                  break label40;
               }
            }

            var3.setComparator(var4, var6);
         }

         var4++;
      } while (!var1);

      return var3;
   }

   public int J() {
      return Registry.lookupField(593601365085169143L).getInt(this);
   }

   public void w(int var1) {
      Registry.lookupField(593601365085169143L).setInt(this, var1);
   }

   public static void J(boolean var0) {
      q = var0;
   }

   public static boolean i() {
      return q;
   }

   public static boolean k() {
      boolean var0 = i();
      return !var0;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 21642;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 4505512185014356453L;
      long[] var6 = new long[16];
      int var3 = 0;
      String var4 = "©ð\u0003\u0086±çð´Rqe\u008e,g\u009f@\u0015G\u009f\u0088oÃyú\u0013\u007f/s\u00advý¾\u008eF\u008bL\u0081\u0001tâ Kh`gl¶±#ËWaÞ(\u009dëAúý~Õ\u0016Þ³oõ1(ÕEk\u0002Ì÷H¤Ö%`H¿È\u0097D\u0003|\u00ad£P Ñ\u0080ân4ËCê\u008cµÒ7\u0016âÎ*©øÃ¦©ß";
      int var5 = "©ð\u0003\u0086±çð´Rqe\u008e,g\u009f@\u0015G\u009f\u0088oÃyú\u0013\u007f/s\u00advý¾\u008eF\u008bL\u0081\u0001tâ Kh`gl¶±#ËWaÞ(\u009dëAúý~Õ\u0016Þ³oõ1(ÕEk\u0002Ì÷H¤Ö%`H¿È\u0097D\u0003|\u00ad£P Ñ\u0080ân4ËCê\u008cµÒ7\u0016âÎ*©øÃ¦©ß"
         .length();
      J(false);
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
                     b = new Integer[16];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "\u001aç{o§ø$\u008b]`$îÖl\\-";
                  var5 = "\u001aç{o§ø$\u008b]`$îÖl\\-".length();
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





