package com.finalshell.ui.model;

import com.finalshell.ui.panel.Copy2;
import javax.swing.table.DefaultTableModel;

public class OM3 extends DefaultTableModel {
   public final Copy2 d;

   public OM3(Copy2 var1, Object[][] var2, Object[] var3) {
      super(var2, var3);
      this.d = var1;
   }

   @Override
   public boolean isCellEditable(int var1, int var2) {
      return false;
   }
}





