package com.finalshell.ui.listener;

import com.finalshell.core.Yh2_2;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Fu2 implements PropertyChangeListener {
   final Yh2_2 u;

   Fu2(Yh2_2 var1) {
      this.u = var1;
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      this.u.h$void();
   }
}





