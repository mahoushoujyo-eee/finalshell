package com.finalshell.ui.listener;

import com.finalshell.core.FN;
import com.finalshell.core.Xk2;
import com.finalshell.ui.panel.Pb4;
import java.awt.Window;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class DK3 implements PropertyChangeListener {
   public final com.finalshell.core.FJ O;

   public DK3(com.finalshell.core.FJ var1) {
      this.O = var1;
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      int[] var2 = Pb4.g();
      if (var1.getNewValue() == Boolean.FALSE) {
         Window var3 = FN.L(com.finalshell.core.FJ.P(this.O));
         Window var10000 = var3;
         if (var2 != null) {
            if (!FN.u(var3)) {
               return;
            }

            Xk2.Z(var3, true);
            var10000 = var3;
         }

         Xk2.v(var10000, null);
      }
   }
}





