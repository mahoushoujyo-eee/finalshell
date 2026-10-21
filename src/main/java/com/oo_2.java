package com;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class Oo_2 extends AbstractAction {
   final pA_3 C;

   Oo_2(pA_3 var1, String var2) {
      super(var2);
      this.C = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.C.A(false);
   }

   @Override
   public boolean isEnabled() {
      return pA_3.e(this.C) != null;
   }
}





