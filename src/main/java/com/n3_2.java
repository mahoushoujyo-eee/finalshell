package com;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class n3_2 implements ChangeListener {
   final EX p;
   final com.kD_3 r;

   n3_2(com.kD_3 var1, EX var2) {
      this.r = var1;
      this.p = var2;
   }

   @Override
   public void stateChanged(ChangeEvent var1) {
      com.kD_3.c(this.r).h(com.kD_3.d(this.r));
      com.kD_3.c(this.r).b(this.p.getValue());
      com.kD_3.c(this.r).u(com.kD_3.d(this.r));
   }
}





