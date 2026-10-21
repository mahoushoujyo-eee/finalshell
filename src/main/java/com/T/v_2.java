package com.t;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class v_2 implements ActionListener {
   final com.t.n_2 w;

   v_2(com.t.n_2 var1) {
      this.w = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      com.t.n_2.l(this.w, 1);
      this.w.x(this.w.t());
      com.t.n_2.c(this.w, var1);
   }
}





