package com.finalshell.ui.listener;

import com.finalshell.core.Pk4;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Y02 implements PropertyChangeListener {
   public final Pk4 b;

   public Y02(Pk4 var1) {
      this.b = var1;
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      this.b.h();
   }
}





