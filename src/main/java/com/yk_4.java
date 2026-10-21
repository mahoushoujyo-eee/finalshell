package com;

import java.awt.Rectangle;

class yk_4 implements Runnable {
   final Rectangle N;
   final com.Qm_2 W;

   yk_4(com.Qm_2 var1, Rectangle var2) {
      this.W = var1;
      this.N = var2;
   }

   @Override
   public void run() {
      boolean var1 = com.Qm_2.Z();
      com.yk_4 var10000 = this;
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





