package com.t;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class t implements ChangeListener {
   final com.t.n_2 k;

   t(com.t.n_2 var1) {
      this.k = var1;
   }

   @Override
   public void stateChanged(ChangeEvent var1) {
      com.t.n_2.y(this.k, com.t.n_2.r(this.k).d());
      com.t.n_2.a(this.k, com.t.n_2.c(this.k), com.t.a_2.palette);
   }
}





