package com;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class Cl_2 implements PropertyChangeListener {
   final _n_2 X;

   Cl_2(_n_2 var1) {
      this.X = var1;
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      this.X.h();
   }
}





