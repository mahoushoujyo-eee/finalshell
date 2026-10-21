package com.finalshell.ui.listener;

import com.finalshell.core.I12;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class YC implements PropertyChangeListener {
   public final I12 C;

   public YC(I12 var1) {
      this.C = var1;
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      this.C.h();
   }
}





