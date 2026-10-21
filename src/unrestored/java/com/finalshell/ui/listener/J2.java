package com.finalshell.ui.listener;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class J2 implements PropertyChangeListener {
   public final com.finalshell.core.M3 u;

   public J2(com.finalshell.core.M3 var1) {
      this.u = var1;
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      this.u.m(var1.getOldValue());
      this.u.w(var1.getNewValue());
   }
}





