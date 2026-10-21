package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.PortForwardEditDialog;
import com.finalshell.ui.listener.UB;
import com.finalshell.ui.model.BS;
import com.finalshell.ui.model.ExtranetAddressModel;
import com.finalshell.ui.panel.PortForwardCellRenderer;
import com.finalshell.ui.panel.AccelerateRdpHelpPanel;
import java.awt.Color;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.TableModel;

public class Nd2_2 extends JTable {
   public ExtranetAddressModel n;
   public Nd2_2 L;
   public AccelerateRdpHelpPanel Q;
   public static long[] a;
   public static Integer[] b;

   public Nd2_2(AccelerateRdpHelpPanel var1, ExtranetAddressModel var2) {
   super();
      short var10000 = 8677;
      long var10001 = 1894970607044380565L;
      long var7 = 425022080861781771L;
      Ref.s(425022080861781771L, var2, var7);
      long var9 = 318095264546736274L;
      Ref.s(318095264546736274L, var1, var9);
      long var11 = 327847991708180521L;
      Ref.s(327847991708180521L, this, var11);
      Object[] var10006 = Registry.packArgs(var2);
      long var13 = 294672710420223393L;
      Object[] var12 = var10006;
      Ref.h(294672710420223393L, var12, var13);

      try {
         ;
      } catch (InvocationTargetException var18) {
         throw var18.getTargetException();
      }

      this.setOpaque(false);
      int var3 = a((int)this, (long)this);
      this.setGridColor(new Color(var3, var3, var3));
      this.setBorder(null);
      this.setSelectionMode(0);
      this.setRowSorter(null);
      this.getColumnModel().getColumn(0).setMinWidth(a(15844, 5870797141390252950L));
      new com.finalshell.ui.adapter.N3(0);
      PortForwardCellRenderer var5 = new PortForwardCellRenderer();
      this.getColumnModel().getColumn(0).setCellRenderer(var5);
      this.setRowHeight(a(27449, 5285897594889932106L));
      Object var14 = 327847991708180521L;
      ((Nd2_2)Ref.g(327847991708180521L, var14)).getTableHeader().setVisible(false);
      Object var16 = 327847991708180521L;
      ((Nd2_2)Ref.g(327847991708180521L, var16)).setTableHeader(null);
      this.addMouseListener(new UB(this));
   }

   public void p() {
      int var1 = this.getSelectedRow();
      int var2 = this.convertRowIndexToModel(var1);
      Object[] var10001 = Registry.emptyArgs();
      long var6 = 542425596934223077L;
      Object[] var5 = var10001;
      Ref.h(542425596934223077L, var5, var6);
      BS var10002 = (BS)(Registry.packArgs(var2));
      long var8 = 397133340990525366L;
      Object var7 = var10002;
      var10002 = Ref.h(397133340990525366L, var7, var8);

      try {
         var10002 = (BS)var10002;
      } catch (InvocationTargetException var11) {
         throw var11.getTargetException();
      }

      BS var3 = var10002;
      Object var9 = 318095264546736274L;
      // [VF-super] super((AccelerateRdpHelpPanel)Ref.g(318095264546736274L, var9), var3, true);
   }

   public void y(List var1) {
      Object var2 = 425022080861781771L;
      Ref.g(425022080861781771L, var2);
      Object[] var10002 = Registry.packArgs(var1);
      long var5 = 527189660152029593L;
      Object[] var4 = var10002;
      Ref.h(527189660152029593L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }

   public ExtranetAddressModel C() {
      Object var1 = 425022080861781771L;
      return (ExtranetAddressModel)Ref.g(425022080861781771L, var1);
   }

   public void p(ExtranetAddressModel var1) {
      super.setModel(var1);
      long var3 = 425022080861781771L;
      Ref.s(425022080861781771L, var1, var3);
   }

   @Override
   public TableModel getModel() {
      Object var10001 = Registry.emptyArgs();
      long var2 = 542425596934223077L;
      Object var1 = var10001;
      var10001 = Ref.h(542425596934223077L, var1, var2);

      try {
         return (ExtranetAddressModel)var10001;
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 26226;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
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
}





