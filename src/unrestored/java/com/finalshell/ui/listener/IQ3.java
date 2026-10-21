package com.finalshell.ui.listener;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class IQ3 implements PropertyChangeListener {
   public final com.finalshell.core.Lk4 s;

   public IQ3(com.finalshell.core.Lk4 var1) {
      this.s = var1;
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      String[] var2 = com.finalshell.core.Lk4.N();
      com.finalshell.core.Lk4 var10000 = this.s;
      if (var2 == null) {
         if (!this.s.R.isShowing()) {
            return;
         }

         var10000 = this.s;
      }

      var10000.l();
   }
}





