package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class B3 implements ActionListener {
   final com.kD_3 R;

   B3(com.kD_3 var1) {
      this.R = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      int[] var2 = com.kD_3.u();
      com.BM var10000 = com.kD_3.c(this.R);
      if (var2 == null) {
         if (var10000.R()) {
            return;
         }

         var10000 = com.kD_3.c(this.R);
      }

      var10000.g(com.Fk_2.D(com.kD_3.c(this.R).T()));
   }
}





