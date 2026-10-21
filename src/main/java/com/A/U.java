package com.A;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class U implements ActionListener {
   final com.A.d j;

   U(com.A.d var1) {
      this.j = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.j.U();
   }
}





