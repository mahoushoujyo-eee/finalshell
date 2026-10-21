package com.Z;

import java.awt.event.ActionEvent;
import java.io.File;
import javax.swing.AbstractAction;

class z_2 extends AbstractAction {
   final com.Z.T n;

   z_2(com.Z.T var1) {
      this.n = var1;
   }

   @Override
   public boolean isEnabled() {
      String var1 = com.Z.T.v();
      int var10000 = this.n.hD.getSelectedRow();
      if (var1 == null) {
         var10000 = var10000 != -1 ? 1 : 0;
      }

      return (boolean)var10000;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      File var2 = this.n.hD.S();
      if (var2.isDirectory()) {
         this.n.M(var2, d_2.table);
      }
   }
}





