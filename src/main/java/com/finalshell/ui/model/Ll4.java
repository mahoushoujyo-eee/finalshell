package com.finalshell.ui.model;

import com.finalshell.core.UC;
import javax.swing.table.DefaultTableModel;

public class Ll4 extends DefaultTableModel {
   Ll4() {
   }

   @Override
   public int getColumnCount() {
      return 1;
   }

   public void G() {
      super.addRow(new Object[]{new UC(0, 0, "", "")});
   }
}





