package com.finalshell.core;

import com.finalshell.ui.model.CB3;
import javax.swing.event.ChangeEvent;
import javax.swing.tree.TreeCellEditor;

public class Th2 extends T8_2 {
   public final TreeCellEditor v;
   public final com.finalshell.ui.panel.Us2 f;

   public Th2(com.finalshell.ui.panel.Us2 var1, TreeCellEditor var2) {
      this.f = var1;
      this.v = var2;
   }

   @Override
   public void editingStopped(ChangeEvent var1) {
      CB3 var2 = (CB3)this.v.getCellEditorValue();
      this.f.O(var2.C$cB_3());
   }
}





