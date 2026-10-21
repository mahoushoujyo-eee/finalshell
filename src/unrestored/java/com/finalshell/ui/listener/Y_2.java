package com.finalshell.ui.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Y_2 implements ActionListener {
   public final com.finalshell.ui.panel.T Y;

   public Y_2(com.finalshell.ui.panel.T var1) {
      this.Y = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String var2 = com.finalshell.ui.panel.T.v$String();
      com.finalshell.ui.panel.T var10000 = this.Y;
      if (var2 == null) {
         if (!(Boolean)this.Y.N.J()) {
            return;
         }

         var10000 = this.Y;
      }

      var10000.x();
   }
}





