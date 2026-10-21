package com.finalshell.ui.listener;

import com.finalshell.core.K4_2;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class G3 implements ItemListener {
   final C4 d;

   G3(C4 var1) {
      this.d = var1;
   }

   @Override
   public void itemStateChanged(ItemEvent var1) {
      boolean var2 = K4_2.Z$boolean();
      C4 var10000 = this.d;
      if (var2) {
         if (C4.l(this.d)) {
            boolean var3 = C4.T$JRadioButton(this.d).isSelected();
            if (var2) {
               if (var3) {
                  C4.K(this.d, true);
                  C4.t(this.d).u$WC();
                  if (var2) {
                     return;
                  }
               }

               C4.K(this.d, false);
            }

            C4.t(this.d).u$WC();
            if (var2) {
               return;
            }
         }

         var10000 = this.d;
      }

      var10000.K();
   }
}





