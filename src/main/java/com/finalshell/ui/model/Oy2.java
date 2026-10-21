package com.finalshell.ui.model;

import com.finalshell.core.DE3;
import javax.swing.table.DefaultTableModel;

public class Oy2 extends DefaultTableModel {
   final DE3 Z;

   Oy2(DE3 var1, Object[][] var2, Object[] var3) {
      super(var2, var3);
      this.Z = var1;
   }

   @Override
   public Class getColumnClass(int var1) {
      return var1 == 2 ? Boolean.class : String.class;
   }
}





