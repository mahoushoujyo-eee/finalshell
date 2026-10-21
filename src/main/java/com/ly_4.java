package com;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class ly_4 implements ChangeListener {
   final iL_3 b;
   final pA_3 F;

   ly_4(pA_3 var1, iL_3 var2) {
      this.F = var1;
      this.b = var2;
   }

   @Override
   public void stateChanged(ChangeEvent var1) {
      pA_3.y(this.F).removeChangeListener(this);
      pA_3.T(this.F).q(this.b);
   }
}





