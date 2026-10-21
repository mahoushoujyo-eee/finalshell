package com;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class G4 extends MouseAdapter {
   final HT v;
   final com.O5 V;

   G4(HT var1, com.O5 var2) {
      this.v = var1;
      this.V = var2;
   }

   @Override
   public void mouseDragged(MouseEvent var1) {
      G4 var10000;
      String var2 = com.FV.D();
      var10000 = this;
      label18:
      if (var2 == null) {
         if (this.v != null) {
            var10000 = this;
            if (var2 != null) {
               break label18;
            }

            if (this.v != HT.l(var1)) {
               return;
            }
         }

         var10000 = this;
      }

      var10000.V.r(var1);
   }
}





