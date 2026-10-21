package com.finalshell.ui.model;

import com.finalshell.reflect.Ref;
import com.finalshell.ui.panel.AccelerateRdpHelpPanel;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.table.AbstractTableModel;

public class Ba2 extends AbstractTableModel {
   public ArrayList R;
   public String[] T;
   public Class[] L;

   public Ba2() {
      ArrayList var10001 = new ArrayList();
      long var2 = 340080073196519749L;
      ArrayList var1 = var10001;
      Ref.s(340080073196519749L, var1, var2);
      Class[] var10002 = new Class[]{Object.class};
      long var4 = 613939194239887285L;
      Class[] var3 = var10002;
      Ref.s(613939194239887285L, var3, var4);
      String[] var10003 = new String[]{""};
      long var6 = 453953360809999237L;
      String[] var5 = var10003;
      Ref.s(453953360809999237L, var5, var6);
   }

   @Override
   public synchronized Object getValueAt(int var1, int var2) {
      String var3 = null;
      Object var4 = 340080073196519749L;
      if (this < ((ArrayList)Ref.g(340080073196519749L, var4)).size()) {
         Object var6 = 340080073196519749L;
         var3 = (String)((ArrayList)Ref.g(340080073196519749L, var6)).get(var1);
      }

      return var3;
   }

   public int p(String var1) {
      AccelerateRdpHelpPanel.w();
      int var3 = 0;
      Object var6 = 340080073196519749L;
      Iterator var4 = ((ArrayList)Ref.g(340080073196519749L, var6)).iterator();
      Ba2 var2 = this;

      int var10001;
      while (true) {
         label24:
         if (var4.hasNext()) {
            String var5 = (String)var4.next();
            if (var2 == null) {
               var10001 = (var1.equals(var5)) ? 1 : 0;
               if (var2 != null) {
                  break;
               }

               if (var10001 != 0 && var2 == null) {
                  break label24;
               }

               var3++;
            }

            if (var2 == null) {
               continue;
            }
         }

         var10001 = var3;
         break;
      }

      return var10001;
   }

   @Override
   public void setValueAt(Object var1, int var2, int var3) {
      this.fireTableCellUpdated(var2, var3);
   }

   @Override
   public synchronized int getRowCount() {
      Object var1 = 340080073196519749L;
      return ((ArrayList)Ref.g(340080073196519749L, var1)).size();
   }

   @Override
   public int getColumnCount() {
      Object var1 = 453953360809999237L;
      return ((String[])Ref.g(453953360809999237L, var1)).length;
   }

   @Override
   public String getColumnName(int var1) {
      Object var2 = 453953360809999237L;
      return ((String[])Ref.g(453953360809999237L, var2))[var1];
   }

   @Override
   public Class getColumnClass(int var1) {
      Object var2 = 613939194239887285L;
      return ((Class[])Ref.g(613939194239887285L, var2))[var1];
   }

   @Override
   public boolean isCellEditable(int var1, int var2) {
      String[] var10000 = AccelerateRdpHelpPanel.w();
      boolean var4 = false;
      String[] var3 = var10000;
      int var6 = var2;
      if (var3 == null) {
         if (var2 == 0) {
            var4 = true;
         }

         var6 = 0;
      }

      return var6 != 0;
   }

   public ArrayList u() {
      Object var1 = 340080073196519749L;
      return (ArrayList)Ref.g(340080073196519749L, var1);
   }

   public void p(ArrayList var1) {
      long var3 = 340080073196519749L;
      Ref.s(340080073196519749L, var1, var3);
   }
}





