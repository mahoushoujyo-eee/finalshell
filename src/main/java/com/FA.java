package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class FA implements ActionListener {
   final EX w;
   final com.kD_3 F;

   FA(com.kD_3 var1, EX var2) {
      this.F = var1;
      this.w = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.w.setValue(1);
   }
}





