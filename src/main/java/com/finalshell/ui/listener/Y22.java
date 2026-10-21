package com.finalshell.ui.listener;

import com.finalshell.ui.panel.Kz4;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class Y22 extends ComponentAdapter {
   final Kz4 W;

   Y22(Kz4 var1) {
      this.W = var1;
   }

   @Override
   public void componentResized(ComponentEvent var1) {
      String var2 = Kz4.M();
      Kz4 var10000 = this.W;
      if (var2 != null) {
         if (this.W.Z.isShowing()) {
            return;
         }

         var10000 = this.W;
      }

      var10000.P();
   }
}





