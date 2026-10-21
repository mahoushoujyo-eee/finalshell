package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class _J implements ActionListener {
   final com.k3_2 Q;

   _J(com.k3_2 var1) {
      this.Q = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      int[] var2 = com.k3_2.L();
      com.k3_2 var10000 = this.Q;
      if (var2 != null) {
         if (this.Q.k > 0.0F) {
            this.Q.k = Math.max(0.0F, this.Q.k - this.Q.H);
            this.Q.revalidate();
            if (var2 != null) {
               return;
            }
         }

         this.Q.k = 0.0F;
         this.Q.u();
         var10000 = this.Q;
      }

      var10000.p.Y();
   }
}





