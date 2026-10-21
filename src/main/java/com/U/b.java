package com.U;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class b implements PropertyChangeListener {
   final y g;

   b(y var1) {
      this.g = var1;
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      this.g.h();
   }
}





