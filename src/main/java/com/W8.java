package com;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class W8 extends KeyAdapter {
   final com.Cs_2 c;
   final Sr_2 V;

   W8(com.Cs_2 var1, Sr_2 var2) {
      this.c = var1;
      this.V = var2;
   }

   @Override
   public void keyTyped(KeyEvent var1) {
      com.W8 var10000;
      String var2 = com.FV.D();
      var10000 = this;
      label18:
      if (var2 == null) {
         if (this.c != null) {
            var10000 = this;
            if (var2 != null) {
               break label18;
            }

            if (!this.c.J(var1)) {
               return;
            }
         }

         var10000 = this;
      }

      var10000.V.j(var1);
   }
}





