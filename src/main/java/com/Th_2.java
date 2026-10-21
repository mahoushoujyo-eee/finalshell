package com;

import javax.swing.event.ChangeEvent;
import javax.swing.tree.TreeCellEditor;

class Th_2 extends com.T8 {
   final TreeCellEditor v;
   final us_2 f;

   Th_2(us_2 var1, TreeCellEditor var2) {
      this.f = var1;
      this.v = var2;
   }

   @Override
   public void editingStopped(ChangeEvent var1) {
      com.cB_3 var2 = (com.cB_3)this.v.getCellEditorValue();
      this.f.O(var2.C());
   }
}





