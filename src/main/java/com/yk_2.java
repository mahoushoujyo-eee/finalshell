package com;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class Yk_2 extends AbstractAction {
   final pA_3 h;

   Yk_2(pA_3 var1, String var2) {
      super(var2);
      this.h = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.h.r();
   }

   @Override
   public boolean isEnabled() {
      return pA_3.r(this.h) != null;
   }
}





