package com.finalshell.ui.listener;

import com.finalshell.core.FV_2;
import com.finalshell.core.Sr2;
import com.finalshell.ui.model.Cs2;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class W8 extends KeyAdapter {
   final Cs2 c;
   final Sr2 V;

   W8(Cs2 var1, Sr2 var2) {
      this.c = var1;
      this.V = var2;
   }

   @Override
   public void keyTyped(KeyEvent var1) {
      W8 var10000;
      String var2 = FV_2.D();
      var10000 = this;
      label18:
      if (var2 == null) {
         if (this.c != null) {
            var10000 = this;
            if (var2 != null) {
               break label18;
            }

            if (!this.c.J(var1)) {
               return;
            }
         }

         var10000 = this;
      }

      var10000.V.j(var1);
   }
}





