package com.finalshell.ui.listener;

import com.finalshell.core.Hl2;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class NL implements PropertyChangeListener {
   final Hl2 y;

   NL(Hl2 var1) {
      this.y = var1;
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      Hl2.i(this.y);
   }
}





