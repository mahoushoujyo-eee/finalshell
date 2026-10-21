package com.finalshell.ui.listener;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class B2 implements PropertyChangeListener {
   final com.finalshell.core.Y3 g;

   B2(com.finalshell.core.Y3 var1) {
      this.g = var1;
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      this.g.h();
   }
}





