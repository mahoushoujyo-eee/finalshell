package com;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;

class Rm_2 extends MouseAdapter {
   final com.lk_4 K;

   Rm_2(com.lk_4 var1) {
      this.K = var1;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      String[] var2 = com.lk_4.N();
      boolean var10000 = this.K.isEnabled();
      if (var2 == null) {
         if (!var10000) {
            return;
         }

         var10000 = SwingUtilities.isRightMouseButton(var1);
      }

      if (var10000) {
         this.K.q();
      }
   }
}





