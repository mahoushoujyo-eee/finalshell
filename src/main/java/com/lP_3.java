package com;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class lP_3 implements PropertyChangeListener {
   final com.k3_2 z;

   lP_3(com.k3_2 var1) {
      this.z = var1;
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      this.z.V();
   }
}





