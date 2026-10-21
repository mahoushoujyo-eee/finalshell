package com.finalshell.ui.listener;

import com.finalshell.core.FV_2;
import com.finalshell.core.Sr2;
import com.finalshell.ui.model.Cs2;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class OJ3 extends KeyAdapter {
   final Cs2 h;
   final Sr2 k;

   OJ3(Cs2 var1, Sr2 var2) {
      this.h = var1;
      this.k = var2;
   }

   @Override
   public void keyReleased(KeyEvent var1) {
      OJ3 var10000;
      String var2 = FV_2.D();
      var10000 = this;
      label18:
      if (var2 == null) {
         if (this.h != null) {
            var10000 = this;
            if (var2 != null) {
               break label18;
            }

            if (!this.h.J(var1)) {
               return;
            }
         }

         var10000 = this;
      }

      var10000.k.j(var1);
   }
}





