package com.L;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class J implements PropertyChangeListener {
   final m u;

   J(m var1) {
      this.u = var1;
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      this.u.m(var1.getOldValue());
      this.u.w(var1.getNewValue());
   }
}





