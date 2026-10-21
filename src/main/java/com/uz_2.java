package com;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class uz_2 implements ChangeListener {
   final com.kD_3 U;

   uz_2(com.kD_3 var1) {
      this.U = var1;
   }

   @Override
   public void stateChanged(ChangeEvent var1) {
      com.kD_3.M(this.U);
   }
}





