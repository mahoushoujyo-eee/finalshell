package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class TE implements ActionListener {
   final nr_4 T;

   TE(nr_4 var1) {
      this.T = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.T.E.u(this.T.v.isSelected());
      this.T.v();
   }
}





