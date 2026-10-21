package com.finalshell.ui.listener;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class XU implements PropertyChangeListener {
   final com.finalshell.core.FJ W;

   XU(com.finalshell.core.FJ var1) {
      this.W = var1;
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      com.finalshell.core.FJ.C(this.W).setVisible(false);
   }
}





