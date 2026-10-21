package com.h;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class g implements ItemListener {
   final com.h.c d;

   g(com.h.c var1) {
      this.d = var1;
   }

   @Override
   public void itemStateChanged(ItemEvent var1) {
      boolean var2 = com.h.K.Z();
      com.h.c var10000 = this.d;
      if (var2) {
         if (com.h.c.l(this.d)) {
            boolean var3 = com.h.c.T(this.d).isSelected();
            if (var2) {
               if (var3) {
                  com.h.c.K(this.d, true);
                  com.h.c.t(this.d).u();
                  if (var2) {
                     return;
                  }
               }

               com.h.c.K(this.d, false);
            }

            com.h.c.t(this.d).u();
            if (var2) {
               return;
            }
         }

         var10000 = this.d;
      }

      var10000.K();
   }
}





