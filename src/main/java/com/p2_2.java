package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class p2_2 implements ActionListener {
   final HD F;

   p2_2(HD var1) {
      this.F = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.F.L.z();
   }
}





