package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ir_4 implements ActionListener {
   final com.kz_4 b;

   ir_4(com.kz_4 var1) {
      this.b = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.b.transferFocus();
      com.FN.M(this.b.S);
      this.b.S.r(this.b.W);
   }
}





