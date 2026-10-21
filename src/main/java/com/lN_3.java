package com;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;

class lN_3 extends MouseAdapter {
   final com.kh_4 K;

   lN_3(com.kh_4 var1) {
      this.K = var1;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      int var2 = nx_4.R();
      int var10000 = SwingUtilities.isLeftMouseButton(var1);
      if (var2 == 0) {
         if (var10000 == 0) {
            return;
         }

         var10000 = var1.getY();
      }

      if (var10000 <= this.K.getHeight() / 2) {
         com.kh_4.e(this.K);
         if (var2 == 0) {
            return;
         }
      }

      com.kh_4.Q(this.K);
   }
}





