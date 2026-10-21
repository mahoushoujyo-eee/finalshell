package com.finalshell.ui.listener;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class U_2 implements PropertyChangeListener {
   public final com.finalshell.core.Q3 G;

   public U_2(com.finalshell.core.Q3 var1) {
      this.G = var1;
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      this.G.y();
   }
}





