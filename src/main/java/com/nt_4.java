package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class nt_4 implements ActionListener {
   final Xt_2 G;

   nt_4(Xt_2 var1) {
      this.G = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      boolean var2;
      var2 = com.oY_3.y();
      int var10000 = Xt_2.u(this.G);
      label24:
      if (var2) {
         if (var10000 < this.G.z.J() * 2) {
            Xt_2.t(this.G, com.kW_3.e(this.G.z));
            if (var2) {
               break label24;
            }
         }

         Xt_2.X(this.G, 0);
      }

      Xt_2 var3 = this.G;
      if (var2) {
         if (!this.G.isVisible()) {
            return;
         }

         var3 = this.G;
      }

      var3.repaint();
   }
}





