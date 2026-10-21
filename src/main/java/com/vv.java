package com;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

class vv extends FocusAdapter {
   final com.lk_4 d;

   vv(com.lk_4 var1) {
      this.d = var1;
   }

   @Override
   public void focusLost(FocusEvent var1) {
      String[] var2 = com.lk_4.N();
      com.lk_4 var10000 = this.d;
      if (var2 == null) {
         if (com.FN.a(this.d.R, var1.getOppositeComponent())) {
            return;
         }

         var10000 = this.d;
      }

      var10000.Y(true);
   }
}





