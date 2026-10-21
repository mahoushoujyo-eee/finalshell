package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class pH_3 implements ActionListener {
   final com.kV_3 k;

   pH_3(com.kV_3 var1) {
      this.k = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.k.P(1);
   }
}





