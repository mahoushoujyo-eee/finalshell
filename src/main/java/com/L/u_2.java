package com.L;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class u_2 implements PropertyChangeListener {
   final com.L.Q G;

   u_2(com.L.Q var1) {
      this.G = var1;
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      this.G.y();
   }
}





