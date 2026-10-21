package com.finalshell.ui.listener;

import com.finalshell.core.Cz2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class E implements ActionListener {
   final com.finalshell.ui.panel.T N;

   E(com.finalshell.ui.panel.T var1) {
      this.N = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String var2 = com.finalshell.ui.panel.T.v$String();
      com.finalshell.ui.panel.T var10000 = this.N;
      if (var2 == null) {
         if (!(Boolean)this.N.N.J()) {
            return;
         }

         var10000 = this.N;
      }

      var10000.M(Cz2.x$File(), com.finalshell.ui.model.D2.toolbar);
   }
}





