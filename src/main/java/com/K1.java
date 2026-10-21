package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class K1 implements ActionListener {
   final com.kD_3 A;

   K1(com.kD_3 var1) {
      this.A = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      int[] var2 = com.kD_3.u();
      com.BM var10000 = com.kD_3.c(this.A);
      if (var2 == null) {
         if (var10000.R()) {
            return;
         }

         var10000 = com.kD_3.c(this.A);
      }

      com.Wx_2.G(PM.l(var10000.w()));
   }
}





