package com;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class BO implements ChangeListener {
   final Ir_2 i;

   BO(Ir_2 var1) {
      this.i = var1;
   }

   @Override
   public void stateChanged(ChangeEvent var1) {
      this.i.M();
   }
}





