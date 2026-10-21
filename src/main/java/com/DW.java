package com;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class DW implements PropertyChangeListener {
   final Hl_2 S;

   DW(Hl_2 var1) {
      this.S = var1;
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      this.S.h();
   }
}





