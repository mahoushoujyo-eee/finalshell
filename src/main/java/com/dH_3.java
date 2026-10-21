package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class dH_3 implements ActionListener {
   final HD v;

   dH_3(HD var1) {
      this.v = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.v.L.Y();
   }
}





