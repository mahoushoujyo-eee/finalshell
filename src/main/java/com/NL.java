package com;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class NL implements PropertyChangeListener {
   final Hl_2 y;

   NL(Hl_2 var1) {
      this.y = var1;
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      Hl_2.i(this.y);
   }
}





