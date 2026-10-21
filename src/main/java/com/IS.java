package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class IS implements ActionListener {
   final com.k0_2 i;

   IS(com.k0_2 var1) {
      this.i = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.i.K(var1, this.i.j);
   }
}





