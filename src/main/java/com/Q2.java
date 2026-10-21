package com;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class Q2 implements PropertyChangeListener {
   final Hl_2 C;

   Q2(Hl_2 var1) {
      this.C = var1;
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      this.C.h();
   }
}





