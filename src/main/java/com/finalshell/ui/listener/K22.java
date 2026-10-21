package com.finalshell.ui.listener;

import com.finalshell.core.Xm2;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class K22 implements PropertyChangeListener {
   final Xm2 x;

   K22(Xm2 var1) {
      this.x = var1;
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      this.x.h$void();
   }
}





