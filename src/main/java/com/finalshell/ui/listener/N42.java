package com.finalshell.ui.listener;

import com.finalshell.core.FV_2;
import com.finalshell.ui.model.HT;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class N42 extends MouseAdapter {
   final HT C;
   final com.finalshell.core.O5 E;

   N42(HT var1, com.finalshell.core.O5 var2) {
      this.C = var1;
      this.E = var2;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      N42 var10000;
      String var2 = FV_2.D();
      var10000 = this;
      label18:
      if (var2 == null) {
         if (this.C != null) {
            var10000 = this;
            if (var2 != null) {
               break label18;
            }

            if (this.C != HT.l(var1)) {
               return;
            }
         }

         var10000 = this;
      }

      var10000.E.r(var1);
   }
}





