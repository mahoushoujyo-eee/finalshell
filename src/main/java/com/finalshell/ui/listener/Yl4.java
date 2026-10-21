package com.finalshell.ui.listener;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Yl4 implements PropertyChangeListener {
   final com.finalshell.core.QH h;

   Yl4(com.finalshell.core.QH var1) {
      this.h = var1;
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      this.h.h();
   }
}





