package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

class pL_3 implements ActionListener {
   final Date l;
   final com.kV_3 m;

   pL_3(com.kV_3 var1, Date var2) {
      this.m = var1;
      this.l = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.m.p = (com.Qe_2)var1.getSource();
      this.m.J(this.l);
   }
}





