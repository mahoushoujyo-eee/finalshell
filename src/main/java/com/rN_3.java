package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class rN_3 implements ActionListener {
   final com.at_2 n;
   final HD T;

   rN_3(HD var1, com.at_2 var2) {
      this.T = var1;
      this.n = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.T.L.f(this.n, 2);
   }
}





