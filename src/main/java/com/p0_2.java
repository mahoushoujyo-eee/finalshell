package com;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class p0_2 implements ChangeListener {
   final com.BX M;

   p0_2(com.BX var1) {
      this.M = var1;
   }

   @Override
   public void stateChanged(ChangeEvent var1) {
      this.M.Z();
   }
}





