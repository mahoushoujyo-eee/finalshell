package com.finalshell.ui.listener;

import com.finalshell.core.Gi2;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Ce4 implements PropertyChangeListener {
   final Gi2 O;

   Ce4(Gi2 var1) {
      this.O = var1;
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      this.O.h();
   }
}





