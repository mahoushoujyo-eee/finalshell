package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class dE_3 implements ActionListener {
   final com.DK V;

   dE_3(com.DK var1) {
      this.V = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.V.z = 0;
      this.V.dispose();
   }
}





