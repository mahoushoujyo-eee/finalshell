package com.finalshell.ui.listener;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class IP implements PropertyChangeListener {
   final com.finalshell.core.QH k;

   IP(com.finalshell.core.QH var1) {
      this.k = var1;
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      com.finalshell.core.QH.j(this.k);
   }
}





