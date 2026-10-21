package com.finalshell.ui.listener;

import com.finalshell.core.Hl2;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Q22 implements PropertyChangeListener {
   public final Hl2 C;

   public Q22(Hl2 var1) {
      this.C = var1;
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      this.C.h();
   }
}





