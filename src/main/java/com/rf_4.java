package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class rf_4 implements ActionListener {
   final com.OG V;

   rf_4(com.OG var1) {
      this.V = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.V.B();
   }
}





