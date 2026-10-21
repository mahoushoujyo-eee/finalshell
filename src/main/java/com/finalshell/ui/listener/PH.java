package com.finalshell.ui.listener;

import com.finalshell.core.Nx4;
import com.finalshell.core.W62;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class PH extends WindowAdapter {
   final YM G;

   PH(YM var1) {
      this.G = var1;
   }

   @Override
   public void windowClosed(WindowEvent var1) {
      int var2 = Nx4.c$int();
      YM var10000 = this.G;
      if (var2 != 0) {
         if (YM.q(this.G) != null) {
            var10000 = this.G;
            if (var2 != 0) {
               if (YM.Z(this.G)) {
                  this.G.O.T(YM.O(this.G));
               }

               YM.q(this.G).flush();
               var10000 = this.G;
            }

            YM.I(var10000, null);
         }

         W62.A(YM.l(this.G));
         YM.E(this.G, null);
         var10000 = this.G;
      }

      YM.W(var10000, null);
   }
}





