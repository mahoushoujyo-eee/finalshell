package com.finalshell.ui.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class B5 implements ActionListener {
   public final com.finalshell.ui.panel.T V;

   public B5(com.finalshell.ui.panel.T var1) {
      this.V = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String var2 = com.finalshell.ui.panel.T.v$String();
      com.finalshell.ui.panel.T var10000 = this.V;
      if (var2 == null) {
         if (!(Boolean)this.V.N.J()) {
            return;
         }

         var10000 = this.V;
      }

      var10000.a(this.V.e + 1);
   }
}





