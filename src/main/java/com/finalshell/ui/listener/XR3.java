package com.finalshell.ui.listener;

import com.finalshell.core.KD;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class XR3 implements PropertyChangeListener {
   final KD P;
   final com.finalshell.ui.panel.Qq2 v;

   XR3(com.finalshell.ui.panel.Qq2 var1, KD var2) {
      this.v = var1;
      this.P = var2;
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      if (com.finalshell.ui.panel.Qq2.u().contains(var1.getPropertyName())) {
         com.finalshell.ui.panel.Qq2.D(this.v, this.P, com.finalshell.ui.panel.Qq2.m(this.v));
      }
   }
}





