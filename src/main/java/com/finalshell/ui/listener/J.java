package com.finalshell.ui.listener;

import com.finalshell.core.FV_2;
import com.finalshell.core.Sr2;
import com.finalshell.ui.model.Cs2;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class J extends KeyAdapter {
   public final Cs2 I;
   public final Sr2 W;

   public J(Cs2 var1, Sr2 var2) {
      this.I = var1;
      this.W = var2;
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      J var10000;
      String var2 = FV_2.D();
      var10000 = this;
      label18:
      if (var2 == null) {
         if (this.I != null) {
            var10000 = this;
            if (var2 != null) {
               break label18;
            }

            if (!this.I.J(var1)) {
               return;
            }
         }

         var10000 = this;
      }

      var10000.W.j(var1);
   }
}





