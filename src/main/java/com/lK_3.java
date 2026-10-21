package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class lK_3 implements ActionListener {
   final nC_3 T;
   final com.QQ M;

   lK_3(com.QQ var1, nC_3 var2) {
      this.M = var1;
      this.T = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      com.ky_4[] var10000 = com.QQ.N();
      this.M.Y(this.T);
      com.ky_4[] var2 = var10000;
      com.QQ var3 = this.M;
      if (var2 == null) {
         if (!this.M.Q) {
            return;
         }

         var3 = this.M;
      }

      var3.a();
   }
}





