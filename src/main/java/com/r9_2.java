package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class r9_2 implements ActionListener {
   final com.k3_2 s;

   r9_2(com.k3_2 var1) {
      this.s = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      int[] var2 = com.k3_2.L();
      com.k3_2 var10000 = this.s;
      if (var2 != null) {
         if (this.s.k < 1.0F) {
            this.s.k = Math.min(1.0F, this.s.k + this.s.H);
            this.s.revalidate();
            if (var2 != null) {
               return;
            }
         }

         this.s.k = 1.0F;
         this.s.K();
         var10000 = this.s;
      }

      var10000.p.Y();
   }
}





