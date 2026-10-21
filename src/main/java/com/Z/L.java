package com.Z;

import java.io.File;
import javax.swing.event.CellEditorListener;
import javax.swing.event.ChangeEvent;

class L implements CellEditorListener {
   final com.Z.T Q;

   L(com.Z.T var1) {
      this.Q = var1;
   }

   @Override
   public void editingStopped(ChangeEvent var1) {
      File var2 = this.Q.hD.S();
      this.Q.T();
      this.Q.hD.D(var2);
   }

   @Override
   public void editingCanceled(ChangeEvent var1) {
   }
}





