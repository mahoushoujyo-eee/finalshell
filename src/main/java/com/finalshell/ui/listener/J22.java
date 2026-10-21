package com.finalshell.ui.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class J22 implements ActionListener {
   final com.finalshell.ui.panel.T T;

   J22(com.finalshell.ui.panel.T var1) {
      this.T = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String var2 = com.finalshell.ui.panel.T.v$String();
      com.finalshell.ui.panel.T var10000 = this.T;
      if (var2 == null) {
         if (!(Boolean)this.T.N.J()) {
            return;
         }

         var10000 = this.T;
      }

      var10000.T$void();
   }
}





