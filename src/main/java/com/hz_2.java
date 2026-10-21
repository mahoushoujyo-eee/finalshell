package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Hz_2 implements ActionListener {
   final com.KD g;

   Hz_2(com.KD var1) {
      this.g = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      com.Ch_2.P(this.g);
   }
}





