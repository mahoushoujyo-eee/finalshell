package com;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class yl_4 implements PropertyChangeListener {
   final com.QH h;

   yl_4(com.QH var1) {
      this.h = var1;
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      this.h.h();
   }
}





