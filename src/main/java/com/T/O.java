package com.t;

import com.uE;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class O implements ActionListener {
   final uE s;
   final com.t.n_2 U;

   O(com.t.n_2 var1, uE var2) {
      this.U = var1;
      this.s = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.U.N(this.s.isSelected());
   }
}





