package com.finalshell.ui.listener;

import com.finalshell.core.A4_2;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class X6 implements PropertyChangeListener {
   public final A4_2 y;

   public X6(A4_2 var1) {
      this.y = var1;
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      this.y.Z(var1);
   }
}





