package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class rJ_3 implements ActionListener {
   final pb_4 D;
   final com.Qe_2 s;
   final com.kz_4 B;

   rJ_3(com.kz_4 var1, pb_4 var2, com.Qe_2 var3) {
      this.B = var1;
      this.D = var2;
      this.s = var3;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.B.transferFocus();
      com.FN.M(this.D);
      this.D.r(this.s);
   }
}





