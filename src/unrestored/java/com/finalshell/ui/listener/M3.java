package com.finalshell.ui.listener;

import com.finalshell.core.K5_2;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class M3 implements PropertyChangeListener {
   public final K5_2 L;

   public M3(K5_2 var1) {
      this.L = var1;
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      this.L.k = K5_2.l(this.L).getComponentOrientation().isLeftToRight();
   }
}





