package com;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class Gx_2 implements ChangeListener {
   final Ia_2 M;

   Gx_2(Ia_2 var1) {
      this.M = var1;
   }

   @Override
   public void stateChanged(ChangeEvent var1) {
      this.M.M();
   }
}





