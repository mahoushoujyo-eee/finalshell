package com;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class PH extends WindowAdapter {
   final com.YM G;

   PH(com.YM var1) {
      this.G = var1;
   }

   @Override
   public void windowClosed(WindowEvent var1) {
      int var2 = nx_4.c();
      com.YM var10000 = this.G;
      if (var2 != 0) {
         if (com.YM.q(this.G) != null) {
            var10000 = this.G;
            if (var2 != 0) {
               if (com.YM.Z(this.G)) {
                  this.G.O.T(com.YM.O(this.G));
               }

               com.YM.q(this.G).flush();
               var10000 = this.G;
            }

            com.YM.I(var10000, null);
         }

         w6_2.A(com.YM.l(this.G));
         com.YM.E(this.G, null);
         var10000 = this.G;
      }

      com.YM.W(var10000, null);
   }
}





