package com.finalshell.ui.listener;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class B2 implements PropertyChangeListener {
   public final com.finalshell.core.Y3 g;

   public B2(com.finalshell.core.Y3 var1) {
      this.g = var1;
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      this.g.h();
   }
}





