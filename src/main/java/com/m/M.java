package com.m;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class M implements PropertyChangeListener {
   final com.m.K L;

   M(com.m.K var1) {
      this.L = var1;
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      this.L.k = com.m.K.l(this.L).getComponentOrientation().isLeftToRight();
   }
}





