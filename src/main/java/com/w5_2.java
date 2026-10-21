package com;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class w5_2 implements PropertyChangeListener {
   final com.oC_3 V;

   w5_2(com.oC_3 var1) {
      this.V = var1;
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      this.V.h();
   }
}





