package com;

import java.awt.Window;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class dK_3 implements PropertyChangeListener {
   final com.FJ O;

   dK_3(com.FJ var1) {
      this.O = var1;
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      int[] var2 = pb_4.g();
      if (var1.getNewValue() == Boolean.FALSE) {
         Window var3 = com.FN.L(com.FJ.P(this.O));
         Window var10000 = var3;
         if (var2 != null) {
            if (!com.FN.u(var3)) {
               return;
            }

            Xk_2.Z(var3, true);
            var10000 = var3;
         }

         Xk_2.v(var10000, null);
      }
   }
}





