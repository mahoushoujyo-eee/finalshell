package com;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class Dk_2 implements PropertyChangeListener {
   final com.o5_2 h;

   Dk_2(com.o5_2 var1) {
      this.h = var1;
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      this.h.h();
   }
}





