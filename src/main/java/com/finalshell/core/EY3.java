package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import com.finalshell.ui.panel.QS;

public class EY3 extends ES3 {
   final QS q;

   EY3(QS var1) {
      this.q = var1;
   }

   @Override
   public void Y() {
      this.q.d = false;
   }

   @Override
   public void h() {
      QS.I(this.q);
   }

   @Override
   public void T() {
      Ky4[] var10000 = com.finalshell.ui.panel.QQ.N$arrky_4();
      QS.K(this.q);
      Ky4[] var1 = var10000;
      QS var2 = this.q;
      if (var1 == null) {
         if (this.q.d) {
            this.q.u();
            if (var1 == null) {
               return;
            }
         }

         var2 = this.q;
      }

      var2.z();
   }
}





