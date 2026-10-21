import java.awt.Color;
import java.awt.Dimension;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import javax.swing.JTable;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableRowSorter;

public class y6_2 extends JTable {
   gR X;
   int u;
   int e;
   HashMap f;
   private static String[] i;
   private static final long[] a;
   private static final Integer[] b;

   public y6_2() {
      com.c.c(200363817758425901L).setInt(this, -1);
      com.c.c(236308356153440319L).setInt(this, -1);
      com.c.c(546147398846122589L).set(this, new HashMap());
      this.setSelectionBackground((Color)com.c.c(623875439513009390L).get(null));
      this.setSelectionForeground((Color)com.c.c(513155505692963448L).get(null));
      this.setBorder(null);
      this.setDragEnabled(false);
      this.setShowGrid(false);
      this.setAutoResizeMode(3);
      this.setIntercellSpacing(new Dimension(0, 0));
      this.setAutoscrolls(false);
      this.setSelectionMode(0);
      JTableHeader var1 = this.getTableHeader();
      Object[] var10000 = com.c.f();
      Method var3 = com.c.d(454647487873911743L);
      Object[] var6 = var10000;
      Object var5 = null;

      try {
         var4 = (Boolean)var3.invoke(var5, var6);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }

      if (var4) {
         var1.addMouseListener(new K2(this, var1));
      }
   }

   public boolean T(String var1) {
      return ((HashMap)com.c.c(546147398846122589L).get(this)).containsKey(var1);
   }

   public void S(String var1) {
      ((HashMap)com.c.c(546147398846122589L).get(this)).put(var1, var1);
   }

   public void s(gR var1) {
      com.c.c(256673248699809908L).set(this, var1);
      super.setModel(var1);
      String[] var10000 = Z();
      TableColumnModel var3 = this.getColumnModel();
      this.setPreferredScrollableViewportSize(new Dimension(a(18594, 1289353088140141711L), a(6571, 5198171512366642561L)));
      String[] var2 = var10000;
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
            Bu_2 var6 = new Bu_2();
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

         Object[] var10002 = com.c.f();
         Method var10004 = com.c.d(230834458731374925L);
         Object[] var10003 = var10002;
         y6_2 var19 = this;
         Method var10001 = var10004;

         try {
            var18 = (TableRowSorter)var10001.invoke(var19, var10003);
         } catch (InvocationTargetException var8) {
            throw var8.getTargetException();
         }

         this.setRowSorter(var18);
         this.getRowSorter().toggleSortOrder(3);
      }
   }

   protected TableRowSorter g() {
      gR var2 = (gR)this.getModel();
      String[] var10000 = Z();
      d7_2 var3 = new d7_2(this, var2);
      String[] var1 = var10000;
      int var4 = 0;

      do {
         Object[] var10002 = com.c.f();
         Method var10004 = com.c.d(551196522578718340L);
         Object[] var10003 = var10002;
         gR var14 = var2;
         Method var10001 = var10004;

         try {
            var11 = (Integer)var10001.invoke(var14, var10003);
         } catch (InvocationTargetException var7) {
            throw var7.getTargetException();
         }

         if (var4 >= var11) {
            break;
         }

         Object[] var12 = com.c.a(var4);
         Method var16 = com.c.d(553983040773288467L);
         var10002 = var12;
         gR var13 = var2;
         Method var9 = var16;

         try {
            var10000 = (String)var9.invoke(var13, var10002);
         } catch (InvocationTargetException var8) {
            throw var8.getTargetException();
         }

         label40: {
            Ct_2 var6;
            label39: {
               String var5 = var10000;
               var6 = new Ct_2(this, var5);
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
      return com.c.c(200363817758425901L).getInt(this);
   }

   public void R(int var1) {
      com.c.c(200363817758425901L).setInt(this, var1);
   }

   public static void t(String[] var0) {
      i = var0;
   }

   public static String[] Z() {
      return i;
   }

   static {
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

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 11310;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}





