package com;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class wJ_3 implements PropertyChangeListener {
   final com.Fm_2 e;

   wJ_3(com.Fm_2 var1) {
      this.e = var1;
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      this.e.A();
   }
}





