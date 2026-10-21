package com.finalshell.ui.listener;

import com.finalshell.core.FN;
import com.finalshell.core.Xk2;
import com.finalshell.ui.panel.Pb4;
import java.awt.Window;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class L8 implements PropertyChangeListener {
   final com.finalshell.core.FJ L;

   L8(com.finalshell.core.FJ var1) {
      this.L = var1;
   }

   @Override
   public void propertyChange(PropertyChangeEvent var1) {
      int[] var2 = Pb4.g();
      if (var1.getNewValue() == Boolean.TRUE) {
         Window var3 = FN.L(com.finalshell.core.FJ.V(this.L));
         Object var10000 = var3;
         if (var2 != null) {
            if (!FN.u(var3)) {
               return;
            }

            var10000 = var3.getParent();
         }

         Object var4 = var10000;
         var10000 = var4;
         if (var2 != null) {
            if (var4 == null) {
               return;
            }

            var10000 = var4;
         }

         label43: {
            boolean var6 = var10000 instanceof Window;
            if (var2 != null) {
               if (!var6) {
                  return;
               }

               var10000 = (Window)var4;
               if (var2 == null) {
                  break label43;
               }

               var6 = Xk2.X((Window)var10000);
            }

            if (var6) {
               return;
            }

            var10000 = var3;
         }

         Xk2.Z((Window)var10000, false);
      }
   }
}





