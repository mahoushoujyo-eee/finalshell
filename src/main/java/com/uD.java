package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class uD implements ActionListener {
   final IQ Y;

   uD(IQ var1) {
      this.Y = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.Y.M();
   }
}





