package com;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class Hk_2 extends MouseAdapter {
   final com.O5 u;

   Hk_2(com.O5 var1) {
      this.u = var1;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      String var2 = com.FV.D();
      int var10000 = com.FN.B(var1);
      if (var2 == null) {
         if (var10000 == 0) {
            return;
         }

         var10000 = var1.getClickCount();
      }

      if (var10000 == 2) {
         this.u.r(var1);
      }
   }
}





