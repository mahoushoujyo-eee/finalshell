package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Nv_2 implements ActionListener {
   final com.KD p;

   Nv_2(com.KD var1) {
      this.p = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      com.Ch_2.P(this.p);
   }
}





