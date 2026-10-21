package com.finalshell.ui.listener;

import com.finalshell.core.Hl2;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class DW implements PropertyChangeListener {
   final Hl2 S;

   DW(Hl2 var1) {
      this.S = var1;
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      this.S.h();
   }
}





