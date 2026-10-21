package com;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class n4_2 extends MouseAdapter {
   final HT C;
   final com.O5 E;

   n4_2(HT var1, com.O5 var2) {
      this.C = var1;
      this.E = var2;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      n4_2 var10000;
      String var2 = com.FV.D();
      var10000 = this;
      label18:
      if (var2 == null) {
         if (this.C != null) {
            var10000 = this;
            if (var2 != null) {
               break label18;
            }

            if (this.C != HT.l(var1)) {
               return;
            }
         }

         var10000 = this;
      }

      var10000.E.r(var1);
   }
}





