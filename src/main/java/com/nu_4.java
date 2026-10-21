package com;

import java.awt.event.KeyEvent;

class nu_4 implements com.Wc_2 {
   final com.YM a;

   nu_4(com.YM var1) {
      this.a = var1;
   }

   @Override
   public void j(KeyEvent var1) {
      int var2 = nx_4.R();
      com.A.E var10000 = com.YM.M(this.a);
      if (var2 == 0) {
         if (var10000 == null) {
            return;
         }

         com.YM.A(this.a, false);
         var10000 = com.YM.M(this.a);
      }

      var10000.dispose();
   }
}





