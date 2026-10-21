package com.finalshell.ui.listener;

import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;

public class S_2 implements TreeSelectionListener {
   final com.finalshell.ui.panel.T B;

   S_2(com.finalshell.ui.panel.T var1) {
      this.B = var1;
   }

   @Override
   public void valueChanged(TreeSelectionEvent var1) {
      String var2 = com.finalshell.ui.panel.T.v$String();
      com.finalshell.ui.panel.T var10000 = this.B;
      if (var2 == null) {
         if (this.B.H.getSelectionCount() <= 0) {
            return;
         }

         var10000 = this.B;
      }

      var10000.M(this.B.H.N(), com.finalshell.ui.model.D2.tree);
   }
}





