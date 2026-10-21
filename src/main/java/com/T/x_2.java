package com.t;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class x_2 implements ChangeListener {
   final com.t.u_2 g;

   x_2(com.t.u_2 var1) {
      this.g = var1;
   }

   @Override
   public void stateChanged(ChangeEvent var1) {
      int var2 = com.t.n_2.g();
      if (var2 == 0 && !com.t.u_2.x(this.g)) {
         com.t.u_2.N(this.g, true);
         com.t.u_2.c(this.g).x(com.t.u_2.k(this.g).getSelectedColor());
         com.t.u_2.N(this.g, false);
      }
   }
}





