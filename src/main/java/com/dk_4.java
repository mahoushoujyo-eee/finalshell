package com;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class dk_4 implements ItemListener {
   final com.Fm_2 y;

   dk_4(com.Fm_2 var1) {
      this.y = var1;
   }

   @Override
   public void itemStateChanged(ItemEvent var1) {
      this.y.A();
   }
}





