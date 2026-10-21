package com;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

class CV extends FocusAdapter {
   final pA_3 o;

   CV(pA_3 var1) {
      this.o = var1;
   }

   @Override
   public void focusGained(FocusEvent var1) {
      pA_3.D(this.o).E();
      this.o.h = System.currentTimeMillis();
      this.o.cQ = false;
   }

   @Override
   public void focusLost(FocusEvent var1) {
      int var2 = _y_2.M();
      com.d__2 var10000 = pA_3.D(this.o);
      if (var2 != 0) {
         if (var10000 == null) {
            return;
         }

         var10000 = pA_3.D(this.o);
      }

      var10000.E();
   }
}





