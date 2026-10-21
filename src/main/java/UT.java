import java.awt.Color;
import java.awt.Dimension;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.JTable;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableRowSorter;

public class UT extends JTable {
   cd_4 u;
   int C;
   int H;
   boolean S;
   private static final long[] a;
   private static final Integer[] b;

   public UT(boolean var1) {
      com.c.c(369213064747264380L).setInt(this, -1);
      com.c.c(448041790433139499L).setInt(this, -1);
      com.c.c(180122678087780601L).setBoolean(this, false);
      com.c.c(180122678087780601L).setBoolean(this, var1);
      this.setSelectionBackground((Color)com.c.c(623875439513009390L).get(null));
      this.setSelectionForeground((Color)com.c.c(513155505692963448L).get(null));
      this.setBorder(null);
      this.setDragEnabled(false);
      this.setShowGrid(false);
      this.setAutoResizeMode(3);
      this.setIntercellSpacing(new Dimension(0, 0));
      this.setAutoscrolls(false);
      this.setSelectionMode(0);
   }

   public void I(cd_4 var1) {
      int[] var10000 = CE.S();
      com.c.c(319541183701528273L).set(this, var1);
      super.setModel(var1);
      TableColumnModel var3 = this.getColumnModel();
      int[] var2 = var10000;
      this.setPreferredScrollableViewportSize(new Dimension(a(4966, 1471701062211156622L), a(22104, 3154209052382363571L)));
      label44:
      if (var2 != null) {
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
            ug_4 var7 = new ug_4(com.c.c(180122678087780601L).getBoolean(this));
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

         Object[] var10002 = com.c.f();
         Method var10004 = com.c.d(467126060497402896L);
         Object[] var10003 = var10002;
         UT var29 = this;
         Method var10001 = var10004;

         try {
            var26 = (TableRowSorter)var10001.invoke(var29, var10003);
         } catch (InvocationTargetException var10) {
            throw var10.getTargetException();
         }

         this.setRowSorter(var26);
         this.getRowSorter().toggleSortOrder(2);
      }

      JTableHeader var18 = this.getTableHeader();
      Object[] var23 = com.c.f();
      Method var24 = com.c.d(454647487873911743L);
      Object[] var31 = var23;
      Object var28 = null;

      try {
         var25 = (Boolean)var24.invoke(var28, var31);
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }

      if (var25) {
         var18.addMouseListener(new VF(this, var18));
      }
   }

   protected TableRowSorter s() {
      int[] var10000 = CE.S();
      cd_4 var2 = (cd_4)this.getModel();
      int[] var1 = var10000;
      dP_3 var3 = new dP_3(this, var2);
      int var4 = 0;

      do {
         Object[] var10002 = com.c.f();
         Method var10004 = com.c.d(450493786643383164L);
         Object[] var10003 = var10002;
         cd_4 var14 = var2;
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
         Method var16 = com.c.d(604487827219043539L);
         var10002 = var12;
         cd_4 var13 = var2;
         Method var9 = var16;

         try {
            var10 = (String)var9.invoke(var13, var10002);
         } catch (InvocationTargetException var8) {
            throw var8.getTargetException();
         }

         label40: {
            dn_4 var6;
            label39: {
               String var5 = var10;
               var6 = new dn_4(this, var5);
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
      return com.c.c(369213064747264380L).getInt(this);
   }

   public void w(int var1) {
      com.c.c(369213064747264380L).setInt(this, var1);
   }

   static {
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

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 10733;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}





