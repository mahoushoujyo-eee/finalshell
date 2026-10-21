package com.finalshell.core;

import java.io.File;
import javax.swing.event.CellEditorListener;
import javax.swing.event.ChangeEvent;

public class L3_2 implements CellEditorListener {
   final com.finalshell.ui.panel.T Q;

   L3_2(com.finalshell.ui.panel.T var1) {
      this.Q = var1;
   }

   @Override
   public void editingStopped(ChangeEvent var1) {
      File var2 = this.Q.hD.S();
      this.Q.T$void();
      this.Q.hD.D(var2);
   }

   @Override
   public void editingCanceled(ChangeEvent var1) {
   }
}





