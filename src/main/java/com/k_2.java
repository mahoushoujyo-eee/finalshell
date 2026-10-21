package com;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class k_2 implements PropertyChangeListener {
   final Xm_2 x;

   k_2(Xm_2 var1) {
      this.x = var1;
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      this.x.h();
   }
}





