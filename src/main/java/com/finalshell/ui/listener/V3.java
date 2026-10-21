package com.finalshell.ui.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class V3 implements ActionListener {
   final com.finalshell.ui.panel.T Q;

   V3(com.finalshell.ui.panel.T var1) {
      this.Q = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String var2 = com.finalshell.ui.panel.T.v$String();
      com.finalshell.ui.panel.T var10000 = this.Q;
      if (var2 == null) {
         if (!(Boolean)this.Q.N.J()) {
            return;
         }

         var10000 = this.Q;
      }

      if (var2 == null) {
         if (var10000.S == null) {
            return;
         }

         var10000 = this.Q;
      }

      var10000.M(this.Q.S.getParentFile(), com.finalshell.ui.model.D2.toolbar);
   }
}





