package com.finalshell.ui.listener;

import com.finalshell.core.FV_2;
import com.finalshell.ui.model.HT;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class UC extends MouseAdapter {
   public final HT M;
   public final com.finalshell.core.O5 y;

   public UC(HT var1, com.finalshell.core.O5 var2) {
      this.M = var1;
      this.y = var2;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      UC var10000;
      String var2 = FV_2.D();
      var10000 = this;
      label18:
      if (var2 == null) {
         if (this.M != null) {
            var10000 = this;
            if (var2 != null) {
               break label18;
            }

            if (this.M != HT.l(var1)) {
               return;
            }
         }

         var10000 = this;
      }

      var10000.y.r(var1);
   }
}





