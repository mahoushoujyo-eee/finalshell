package com;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class i implements ItemListener {
   final IY o;

   i(IY var1) {
      this.o = var1;
   }

   @Override
   public void itemStateChanged(ItemEvent var1) {
      this.o.M();
   }
}





