package com;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

class y_2 extends ComponentAdapter {
   final com.kz_4 W;

   y_2(com.kz_4 var1) {
      this.W = var1;
   }

   @Override
   public void componentResized(ComponentEvent var1) {
      String var2 = com.kz_4.M();
      com.kz_4 var10000 = this.W;
      if (var2 != null) {
         if (this.W.Z.isShowing()) {
            return;
         }

         var10000 = this.W;
      }

      var10000.P();
   }
}





