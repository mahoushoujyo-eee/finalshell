package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class of_4 implements ActionListener {
   final com.DK M;

   of_4(com.DK var1) {
      this.M = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.M.z = 1;
      this.M.dispose();
   }
}





