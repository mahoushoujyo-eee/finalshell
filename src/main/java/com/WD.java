package com;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class WD implements ChangeListener {
   final NJ Z;
   final it_4 T;

   WD(it_4 var1, NJ var2) {
      this.T = var1;
      this.Z = var2;
   }

   @Override
   public void stateChanged(ChangeEvent var1) {
      this.Z.R();
   }
}





