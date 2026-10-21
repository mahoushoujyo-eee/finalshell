package com;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class GD extends AbstractAction {
   final pA_3 T;

   GD(pA_3 var1, String var2) {
      super(var2);
      this.T = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.T.n();
   }
}





