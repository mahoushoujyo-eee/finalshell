package com;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class uC extends MouseAdapter {
   final HT M;
   final com.O5 y;

   uC(HT var1, com.O5 var2) {
      this.M = var1;
      this.y = var2;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      uC var10000;
      String var2 = com.FV.D();
      var10000 = this;
      label18:
      if (var2 == null) {
         if (this.M != null) {
            var10000 = this;
            if (var2 != null) {
               break label18;
            }

            if (this.M != HT.l(var1)) {
               return;
            }
         }

         var10000 = this;
      }

      var10000.y.r(var1);
   }
}





