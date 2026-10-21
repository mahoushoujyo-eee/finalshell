package com.finalshell.ui.listener;

import com.finalshell.core.FN;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Vv extends FocusAdapter {
   final com.finalshell.core.Lk4 d;

   Vv(com.finalshell.core.Lk4 var1) {
      this.d = var1;
   }

   @Override
   public void focusLost(FocusEvent var1) {
      String[] var2 = com.finalshell.core.Lk4.N();
      com.finalshell.core.Lk4 var10000 = this.d;
      if (var2 == null) {
         if (FN.a(this.d.R, var1.getOppositeComponent())) {
            return;
         }

         var10000 = this.d;
      }

      var10000.Y(true);
   }
}





