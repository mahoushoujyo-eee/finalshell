package com;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

class FK extends FocusAdapter {
   final pA_3 L;

   FK(pA_3 var1) {
      this.L = var1;
   }

   @Override
   public void focusGained(FocusEvent var1) {
      pA_3.C(this.L, pA_3.S(this.L).w());
      pA_3.D(this.L).E();
      this.L.h = System.currentTimeMillis();
      this.L.cQ = false;
   }

   @Override
   public void focusLost(FocusEvent var1) {
      int var2 = _y_2.M();
      pA_3 var10000 = this.L;
      if (var2 != 0) {
         if (pA_3.D(this.L) != null) {
            pA_3.D(this.L).E();
         }

         var10000 = this.L;
      }

      pA_3.Z(var10000, var1.getComponent(), false);
   }
}





