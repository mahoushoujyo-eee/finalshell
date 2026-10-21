package com.Z;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class X implements PropertyChangeListener {
   final com.Z.A y;

   X(com.Z.A var1) {
      this.y = var1;
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      this.y.Z(var1);
   }
}





