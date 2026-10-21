package com.finalshell.ui.listener;

import com.finalshell.core.Nx4;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class S_ implements PropertyChangeListener {
   public final Nx4 t;

   public S_(Nx4 var1) {
      this.t = var1;
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      int var2 = Nx4.R();
      Nx4 var10000 = this.t;
      if (var2 == 0) {
         if (!this.t.S.isShowing()) {
            return;
         }

         var10000 = this.t;
      }

      var10000.y();
   }
}





