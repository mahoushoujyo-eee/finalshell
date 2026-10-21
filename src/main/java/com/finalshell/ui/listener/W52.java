package com.finalshell.ui.listener;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class W52 implements PropertyChangeListener {
   final com.finalshell.core.OC3 V;

   W52(com.finalshell.core.OC3 var1) {
      this.V = var1;
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      this.V.h();
   }
}





