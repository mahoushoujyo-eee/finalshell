package com;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class S_ implements PropertyChangeListener {
   final nx_4 t;

   S_(nx_4 var1) {
      this.t = var1;
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      int var2 = nx_4.R();
      nx_4 var10000 = this.t;
      if (var2 == 0) {
         if (!this.t.S.isShowing()) {
            return;
         }

         var10000 = this.t;
      }

      var10000.y();
   }
}





