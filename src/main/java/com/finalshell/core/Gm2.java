package com.finalshell.core;

import com.finalshell.ui.panel.XT3;
import javax.swing.JRootPane;

public class Gm2 extends JRootPane {
   public boolean X;
   final com.finalshell.ui.dialog.D3 j;

   Gm2(com.finalshell.ui.dialog.D3 var1) {
      this.j = var1;
      this.X = false;
   }

   @Override
   public void validate() {
      String var10000 = XT3.l();
      super.validate();
      String var1 = var10000;
      Gm2 var2 = this;
      if (var1 != null) {
         if (this.X) {
            return;
         }

         this.X = true;
         this.j.pack();
         var2 = this;
      }

      var2.X = false;
   }
}





