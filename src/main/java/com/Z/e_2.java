package com.Z;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class e_2 implements ActionListener {
   final com.Z.A y;

   e_2(com.Z.A var1) {
      this.y = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      com.Z.A.n(this.y).cancelSelection();
   }
}





