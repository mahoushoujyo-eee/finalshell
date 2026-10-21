package com;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Date;

class Sp_2 implements ItemListener {
   final Date c;
   final com.kV_3 Q;

   Sp_2(com.kV_3 var1, Date var2) {
      this.Q = var1;
      this.c = var2;
   }

   @Override
   public void itemStateChanged(ItemEvent var1) {
      com.Qe_2 var2 = (com.Qe_2)var1.getSource();
      if (var2.isSelected()) {
         this.Q.J(this.c);
      }
   }
}





