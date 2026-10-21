import java.awt.Color;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.TableModel;

public class nd_2 extends JTable {
   Df_2 n;
   nd_2 L;
   Br_2 Q;
   private static final long[] a;
   private static final Integer[] b;

   nd_2(Br_2 var1, Df_2 var2) {
      com.c.c(425022080861781771L).set(this, var2);
      com.c.c(318095264546736274L).set(this, var1);
      com.c.c(327847991708180521L).set(this, this);
      Object[] var10003 = com.c.a(var2);
      Method var10005 = com.c.d(294672710420223393L);
      Object[] var10004 = var10003;
      nd_2 var7 = this;
      Method var10002 = var10005;

      try {
         var10002.invoke(var7, var10004);
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      this.setOpaque(false);
      int var3 = a(8677, 1894970607044380565L);
      this.setGridColor(new Color(var3, var3, var3));
      this.setBorder(null);
      this.setSelectionMode(0);
      this.setRowSorter(null);
      this.getColumnModel().getColumn(0).setMinWidth(a(15844, 5870797141390252950L));
      new n3(0);
      nR var5 = new nR();
      this.getColumnModel().getColumn(0).setCellRenderer(var5);
      this.setRowHeight(a(27449, 5285897594889932106L));
      ((nd_2)com.c.c(327847991708180521L).get(this)).getTableHeader().setVisible(false);
      ((nd_2)com.c.c(327847991708180521L).get(this)).setTableHeader(null);
      this.addMouseListener(new UB(this));
   }

   void p() {
      int var1 = this.getSelectedRow();
      int var2 = this.convertRowIndexToModel(var1);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(542425596934223077L);
      Object[] var10002 = var10001;
      nd_2 var10 = this;
      Method var10000 = var10003;

      try {
         var7 = var10000.invoke(var10, var10002);
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      var10001 = com.c.a(var2);
      var10003 = com.c.d(397133340990525366L);
      var10002 = var10001;
      var10001 = (Object[])var7;
      var10000 = var10003;

      try {
         var9 = (BS)var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }

      BS var3 = var9;
      new FB((Br_2)com.c.c(318095264546736274L).get(this), var3, true);
   }

   public void y(List var1) {
      Method var10000 = (Method)com.c.c(425022080861781771L).get(this);
      Object[] var10001 = com.c.a(var1);
      Method var10003 = com.c.d(527189660152029593L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }

   public Df_2 C() {
      return (Df_2)com.c.c(425022080861781771L).get(this);
   }

   public void p(Df_2 var1) {
      super.setModel(var1);
      com.c.c(425022080861781771L).set(this, var1);
   }

   @Override
   public TableModel getModel() {
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(542425596934223077L);
      Object[] var10002 = var10001;
      nd_2 var2 = this;
      Method var10000 = var10003;

      try {
         return (Df_2)var10000.invoke(var2, var10002);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }
   }

   static {
      long var0 = 2357818293460717944L;
      long[] var6 = new long[3];
      int var3 = 0;
      String var4 = ">Ê´¶ÒU\nð¤ ç\u0094¬%\\&l\u0088¤aÆ\u000b\u0016%";
      int var5 = ">Ê´¶ÒU\nð¤ ç\u0094¬%\\&l\u0088¤aÆ\u000b\u0016%".length();
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
      b = new Integer[3];
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 26226;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}





