package com;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class n0_2 implements PropertyChangeListener {
   final com.Fm_2 A;

   n0_2(com.Fm_2 var1) {
      this.A = var1;
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      this.A.I.a(this.A.U.isEnabled());
   }
}





