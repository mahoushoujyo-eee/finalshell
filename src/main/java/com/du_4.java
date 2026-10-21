package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class du_4 implements ActionListener {
   final HD q;

   du_4(HD var1) {
      this.q = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.q.L.d();
   }
}





