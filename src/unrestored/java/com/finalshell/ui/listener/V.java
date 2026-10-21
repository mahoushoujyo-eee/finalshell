package com.finalshell.ui.listener;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class V implements PropertyChangeListener {
   public final com.finalshell.core.M3 M;

   public V(com.finalshell.core.M3 var1) {
      this.M = var1;
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      com.finalshell.core.M3.Z(this.M).setEnabled(com.finalshell.core.M3.h(this.M).isEnabled());
   }
}





