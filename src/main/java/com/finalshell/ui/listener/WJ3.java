package com.finalshell.ui.listener;

import com.finalshell.core.Fm2;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class WJ3 implements PropertyChangeListener {
   final Fm2 e;

   WJ3(Fm2 var1) {
      this.e = var1;
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      this.e.A();
   }
}





