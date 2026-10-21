package com.t;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class y implements ActionListener {
   final com.t.n_2 L;

   y(com.t.n_2 var1) {
      this.L = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.L.x(this.L.t());
      com.t.n_2.D(this.L, var1);
   }
}





