package com;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class YC implements PropertyChangeListener {
   final i1_2 C;

   YC(i1_2 var1) {
      this.C = var1;
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      this.C.h();
   }
}





