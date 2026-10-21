package com;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class _M implements PropertyChangeListener {
   final nr_4 a;

   _M(nr_4 var1) {
      this.a = var1;
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      this.a.y();
   }
}





