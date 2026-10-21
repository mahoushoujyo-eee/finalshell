package com.Z;

import java.awt.event.ActionEvent;
import java.io.File;
import javax.swing.AbstractAction;

class N extends AbstractAction {
   final com.Z.T i;

   N(com.Z.T var1) {
      this.i = var1;
   }

   @Override
   public boolean isEnabled() {
      String var1 = com.Z.T.v();
      int var10000 = this.i.E.getSelectedIndex();
      if (var1 == null) {
         var10000 = var10000 != -1 ? 1 : 0;
      }

      return (boolean)var10000;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      File var2 = this.i.E.J();
      if (var2.isDirectory()) {
         this.i.M(var2, d_2.list);
      }
   }
}





