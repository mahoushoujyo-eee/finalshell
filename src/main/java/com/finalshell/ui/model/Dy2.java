package com.finalshell.ui.model;

import javax.swing.table.DefaultTableModel;

public class Dy2 extends DefaultTableModel {
   Dy2(Object[][] var1, Object[] var2) {
      super(var1, var2);
   }

   @Override
   public Class getColumnClass(int var1) {
      return this.getValueAt(0, var1).getClass();
   }
}





