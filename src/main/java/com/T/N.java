package com.t;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class N implements ChangeListener {
   final com.t.u_2 S;

   N(com.t.u_2 var1) {
      this.S = var1;
   }

   @Override
   public void stateChanged(ChangeEvent var1) {
      int var2 = com.t.n_2.W();
      if (var2 != 0 && !com.t.u_2.x(this.S)) {
         com.t.u_2.N(this.S, true);
         com.t.u_2.k(this.S).setSelectedColor(com.t.u_2.c(this.S).T());
         com.t.u_2.N(this.S, false);
      }
   }
}





