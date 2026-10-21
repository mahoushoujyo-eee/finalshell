package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class iA_3 implements ActionListener {
   final com.at_2 t;
   final HD d;

   iA_3(HD var1, com.at_2 var2) {
      this.d = var1;
      this.t = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.d.L.f(this.t, 1);
   }
}





