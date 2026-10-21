package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class iV_3 implements ActionListener {
   final com.kD_3 p;

   iV_3(com.kD_3 var1) {
      this.p = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      int[] var2 = com.kD_3.u();
      com.BM var10000 = com.kD_3.c(this.p);
      if (var2 == null) {
         if (var10000.R()) {
            return;
         }

         var10000 = com.kD_3.c(this.p);
      }

      var10000.g(com.Fk_2.K(com.kD_3.c(this.p).T()));
   }
}





