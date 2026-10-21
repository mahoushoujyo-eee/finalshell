package com.finalshell.ui.listener;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Dk2 implements PropertyChangeListener {
   final com.finalshell.core.O52 h;

   Dk2(com.finalshell.core.O52 var1) {
      this.h = var1;
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      this.h.h();
   }
}





