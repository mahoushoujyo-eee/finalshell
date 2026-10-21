package com.Z;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class x_2 implements ActionListener {
   final com.Z.T l;

   x_2(com.Z.T var1) {
      this.l = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.l.v(var1);
   }
}





