package com.A;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class Y implements PropertyChangeListener {
   final com.A.d Y;

   Y(com.A.d var1) {
      this.Y = var1;
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      this.Y.Z();
   }
}





