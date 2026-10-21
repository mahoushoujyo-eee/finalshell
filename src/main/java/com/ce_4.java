package com;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class ce_4 implements PropertyChangeListener {
   final Gi_2 O;

   ce_4(Gi_2 var1) {
      this.O = var1;
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      this.O.h();
   }
}





