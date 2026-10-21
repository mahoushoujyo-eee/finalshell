package com;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class _a_2 implements PropertyChangeListener {
   final Ej_2 Z;

   _a_2(Ej_2 var1) {
      this.Z = var1;
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      Ej_2.X(this.Z, Ej_2.P(this.Z));
   }
}





