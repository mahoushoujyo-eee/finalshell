package com;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class J extends KeyAdapter {
   final com.Cs_2 I;
   final Sr_2 W;

   J(com.Cs_2 var1, Sr_2 var2) {
      this.I = var1;
      this.W = var2;
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      J var10000;
      String var2 = com.FV.D();
      var10000 = this;
      label18:
      if (var2 == null) {
         if (this.I != null) {
            var10000 = this;
            if (var2 != null) {
               break label18;
            }

            if (!this.I.J(var1)) {
               return;
            }
         }

         var10000 = this;
      }

      var10000.W.j(var1);
   }
}





