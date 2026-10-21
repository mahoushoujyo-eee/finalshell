package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class LL implements ActionListener {
   final com.Qq_2 O;

   LL(com.Qq_2 var1) {
      this.O = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.O.q(true);
   }
}





