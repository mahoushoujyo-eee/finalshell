package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Wf_2 implements ActionListener {
   final nr_4 t;

   Wf_2(nr_4 var1) {
      this.t = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.t.E.I(this.t.F.isSelected());
      this.t.v();
   }
}





