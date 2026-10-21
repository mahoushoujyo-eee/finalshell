package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class uQ implements ActionListener {
   final com.BX G;
   final com.at_2 J;
   final com.Bw_2 B;

   uQ(com.Bw_2 var1, com.BX var2, com.at_2 var3) {
      this.B = var1;
      this.G = var2;
      this.J = var3;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.G.u(this.J);
   }
}





