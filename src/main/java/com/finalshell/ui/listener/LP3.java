package com.finalshell.ui.listener;

import com.finalshell.ui.panel.K32;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class LP3 implements PropertyChangeListener {
   final K32 z;

   LP3(K32 var1) {
      this.z = var1;
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      this.z.V();
   }
}





