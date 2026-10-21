package com;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class xR_3 implements PropertyChangeListener {
   final com.KD P;
   final com.Qq_2 v;

   xR_3(com.Qq_2 var1, com.KD var2) {
      this.v = var1;
      this.P = var2;
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      if (com.Qq_2.u().contains(var1.getPropertyName())) {
         com.Qq_2.D(this.v, this.P, com.Qq_2.m(this.v));
      }
   }
}





