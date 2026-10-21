package com.finalshell.ui.listener;

import com.finalshell.core.FN;
import com.finalshell.core.FV_2;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Hk2 extends MouseAdapter {
   public final com.finalshell.core.O5 u;

   public Hk2(com.finalshell.core.O5 var1) {
      this.u = var1;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      String var2 = FV_2.D();
      int var10000 = (FN.B(var1)) ? 1 : 0;
      if (var2 == null) {
         if (var10000 == 0) {
            return;
         }

         var10000 = var1.getClickCount();
      }

      if (var10000 == 2) {
         this.u.r(var1);
      }
   }
}





