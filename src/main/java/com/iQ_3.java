package com;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class iQ_3 implements PropertyChangeListener {
   final com.lk_4 s;

   iQ_3(com.lk_4 var1) {
      this.s = var1;
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      String[] var2 = com.lk_4.N();
      com.lk_4 var10000 = this.s;
      if (var2 == null) {
         if (!this.s.R.isShowing()) {
            return;
         }

         var10000 = this.s;
      }

      var10000.l();
   }
}





