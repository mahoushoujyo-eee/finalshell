package com;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Date;

class et_4 implements ItemListener {
   final Date e;
   final com.kV_3 i;

   et_4(com.kV_3 var1, Date var2) {
      this.i = var1;
      this.e = var2;
   }

   @Override
   public void itemStateChanged(ItemEvent var1) {
      com.Qe_2 var2 = (com.Qe_2)var1.getSource();
      if (var2.isSelected()) {
         this.i.J(this.e);
      }
   }
}





