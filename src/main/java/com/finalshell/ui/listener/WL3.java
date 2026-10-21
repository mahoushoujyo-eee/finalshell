package com.finalshell.ui.listener;

import com.finalshell.core.GR;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class WL3 extends KeyAdapter {
   final com.finalshell.core.Lk4 B;

   WL3(com.finalshell.core.Lk4 var1) {
      this.B = var1;
   }

   @Override
   public void keyReleased(KeyEvent var1) {
      String[] var2 = com.finalshell.core.Lk4.N();
      boolean var10000 = this.B.isEnabled();
      if (var2 == null) {
         if (!var10000) {
            return;
         }

         var10000 = GR.lD.J(var1);
      }

      if (var2 == null) {
         if (var10000) {
            this.B.H$void();
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





