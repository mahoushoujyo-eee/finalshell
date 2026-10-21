package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class _R implements ActionListener {
   final com.kD_3 T;

   _R(com.kD_3 var1) {
      this.T = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      int[] var2 = com.kD_3.u();
      com.BM var10000 = com.kD_3.c(this.T);
      if (var2 == null) {
         if (var10000.R()) {
            return;
         }

         var10000 = com.kD_3.c(this.T);
      }

      var10000.g(com.Fk_2.N(com.kD_3.c(this.T).T()));
   }
}





