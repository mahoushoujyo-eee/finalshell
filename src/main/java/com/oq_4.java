package com;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class oq_4 extends AbstractAction {
   final pA_3 B;

   oq_4(pA_3 var1, String var2) {
      super(var2);
      this.B = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.B.y();
   }

   @Override
   public boolean isEnabled() {
      return pA_3.e(this.B) != null;
   }
}





