package com.A;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class N implements PropertyChangeListener {
   final com.A.d N;

   N(com.A.d var1) {
      this.N = var1;
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      this.N.V.revalidate();
      this.N.V.repaint();
   }
}





