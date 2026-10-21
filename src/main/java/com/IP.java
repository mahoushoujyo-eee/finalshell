package com;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class IP implements PropertyChangeListener {
   final com.QH k;

   IP(com.QH var1) {
      this.k = var1;
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      com.QH.j(this.k);
   }
}





