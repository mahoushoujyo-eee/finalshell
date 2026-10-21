package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class S8 implements ActionListener {
   final com.at_2 R;
   final HD b;

   S8(HD var1, com.at_2 var2) {
      this.b = var1;
      this.R = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.b.L.f(this.R, 3);
   }
}





