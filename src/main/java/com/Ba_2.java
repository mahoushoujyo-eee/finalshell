package com;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class Ba_2 implements ChangeListener {
   final IE O;

   Ba_2(IE var1) {
      this.O = var1;
   }

   @Override
   public void stateChanged(ChangeEvent var1) {
      this.O.M();
   }
}





