package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ll_4 implements ActionListener {
   final nx_4 t;

   ll_4(nx_4 var1) {
      this.t = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.t.b();
   }
}





