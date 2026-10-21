package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Di_2 implements ActionListener {
   final com.kV_3 s;

   Di_2(com.kV_3 var1) {
      this.s = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.s.S(1);
   }
}





