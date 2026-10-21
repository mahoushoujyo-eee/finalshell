package com;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class wL_3 extends KeyAdapter {
   final com.lk_4 B;

   wL_3(com.lk_4 var1) {
      this.B = var1;
   }

   @Override
   public void keyReleased(KeyEvent var1) {
      String[] var2 = com.lk_4.N();
      boolean var10000 = this.B.isEnabled();
      if (var2 == null) {
         if (!var10000) {
            return;
         }

         var10000 = GR.lD.J(var1);
      }

      if (var2 == null) {
         if (var10000) {
            this.B.H();
            if (var2 == null) {
               return;
            }
         }

         var10000 = GR.rI.J(var1);
      }

      if (var10000) {
         this.B.q();
      }
   }
}





