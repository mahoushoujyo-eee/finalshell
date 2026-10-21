package com;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class Q9 extends AbstractAction {
   final pA_3 k;

   Q9(pA_3 var1, String var2) {
      super(var2);
      this.k = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.k.v();
   }
}





