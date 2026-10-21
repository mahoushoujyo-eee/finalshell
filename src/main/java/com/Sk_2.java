package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Sk_2 implements ActionListener {
   final com.at_2 R;
   final HD o;

   Sk_2(HD var1, com.at_2 var2) {
      this.o = var1;
      this.R = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.o.L.f(this.R, 4);
   }
}





