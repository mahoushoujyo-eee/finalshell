package com.finalshell.ui.listener;

import com.finalshell.ui.panel.KW3;
import com.finalshell.ui.panel.OY3;
import com.finalshell.ui.panel.Xt2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Nt4 implements ActionListener {
   final Xt2 G;

   Nt4(Xt2 var1) {
      this.G = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      boolean var2;
      var2 = OY3.y$boolean();
      int var10000 = Xt2.u(this.G);
      label24:
      if (var2) {
         if (var10000 < this.G.z.J() * 2) {
            Xt2.t(this.G, KW3.e(this.G.z));
            if (var2) {
               break label24;
            }
         }

         Xt2.X(this.G, 0);
      }

      Xt2 var3 = this.G;
      if (var2) {
         if (!this.G.isVisible()) {
            return;
         }

         var3 = this.G;
      }

      var3.repaint();
   }
}





