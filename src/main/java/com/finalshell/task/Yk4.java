package com.finalshell.task;

import com.finalshell.ui.panel.Qm2;
import java.awt.Rectangle;

public class Yk4 implements Runnable {
   final Rectangle N;
   final Qm2 W;

   Yk4(Qm2 var1, Rectangle var2) {
      this.W = var1;
      this.N = var2;
   }

   @Override
   public void run() {
      boolean var1 = Qm2.Z$boolean();
      Yk4 var10000 = this;
      if (!var1) {
         if (this.N != null) {
            this.W.repaint(this.N);
            if (!var1) {
               return;
            }
         }

         var10000 = this;
      }

      var10000.W.repaint();
   }
}





