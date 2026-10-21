package com;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class Fu_2 implements PropertyChangeListener {
   final com.Yh_2 u;

   Fu_2(com.Yh_2 var1) {
      this.u = var1;
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      this.u.h();
   }
}





