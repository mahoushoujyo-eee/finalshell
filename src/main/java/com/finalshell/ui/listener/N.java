package com.finalshell.ui.listener;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class N implements PropertyChangeListener {
   final com.finalshell.core.D N;

   N(com.finalshell.core.D var1) {
      this.N = var1;
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      this.N.V.revalidate();
      this.N.V.repaint();
   }
}





