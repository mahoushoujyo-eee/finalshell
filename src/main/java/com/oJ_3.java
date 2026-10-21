package com;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class oJ_3 extends KeyAdapter {
   final com.Cs_2 h;
   final Sr_2 k;

   oJ_3(com.Cs_2 var1, Sr_2 var2) {
      this.h = var1;
      this.k = var2;
   }

   @Override
   public void keyReleased(KeyEvent var1) {
      com.oJ_3 var10000;
      String var2 = com.FV.D();
      var10000 = this;
      label18:
      if (var2 == null) {
         if (this.h != null) {
            var10000 = this;
            if (var2 != null) {
               break label18;
            }

            if (!this.h.J(var1)) {
               return;
            }
         }

         var10000 = this;
      }

      var10000.k.j(var1);
   }
}





