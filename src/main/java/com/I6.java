package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class I6 implements ActionListener {
   final com.kz_4 v;

   I6(com.kz_4 var1) {
      this.v = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.v.X(null);
   }
}





