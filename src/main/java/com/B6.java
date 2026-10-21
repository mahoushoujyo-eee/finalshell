package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class B6 implements ActionListener {
   final IH C;

   B6(IH var1) {
      this.C = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.C.M();
   }
}





