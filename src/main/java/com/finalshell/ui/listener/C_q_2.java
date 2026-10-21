package com.finalshell.ui.listener;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class C_q_2 implements PropertyChangeListener {
   final com.finalshell.core.QH I;

   C_q_2(com.finalshell.core.QH var1) {
      this.I = var1;
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      this.I.h();
   }
}





