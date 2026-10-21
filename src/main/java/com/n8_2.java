package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class n8_2 implements ActionListener {
   final com.kV_3 E;

   n8_2(com.kV_3 var1) {
      this.E = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.E.S(-1);
   }
}





