package com.L;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class V implements PropertyChangeListener {
   final m M;

   V(m var1) {
      this.M = var1;
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      m.Z(this.M).setEnabled(m.h(this.M).isEnabled());
   }
}





