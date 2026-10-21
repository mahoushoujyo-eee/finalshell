package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class WH implements ActionListener {
   final nC_3 K;
   final com.QS J;

   WH(com.QS var1, nC_3 var2) {
      this.J = var1;
      this.K = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      com.ky_4[] var10000 = com.QQ.N();
      this.J.Z(this.K);
      com.ky_4[] var2 = var10000;
      com.QS var3 = this.J;
      if (var2 == null) {
         if (!this.J.O) {
            return;
         }

         var3 = this.J;
      }

      var3.a();
   }
}





