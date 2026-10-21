package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class H3 implements ActionListener {
   final int b;
   final HD X;

   H3(HD var1, int var2) {
      this.X = var1;
      this.b = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.X.L.u(this.X.L.x(this.b));
   }
}





