package com.finalshell.ui.listener;

import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class D9 implements TableModelListener {
   final com.finalshell.core.DE3 o;

   public D9(com.finalshell.core.DE3 var1) {
      this.o = var1;
   }

   @Override
   public void tableChanged(TableModelEvent var1) {
      int var2 = var1.getFirstRow();
      int var3 = var1.getColumn();
      if (var3 == 2) {
         TableModel var4 = (TableModel)var1.getSource();
         String var5 = var4.getColumnName(var3);
         Boolean var6 = (Boolean)var4.getValueAt(var2, var3);
         if (var6) {
         }
      }
   }
}





