package com;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class XU implements PropertyChangeListener {
   final com.FJ W;

   XU(com.FJ var1) {
      this.W = var1;
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      com.FJ.C(this.W).setVisible(false);
   }
}





