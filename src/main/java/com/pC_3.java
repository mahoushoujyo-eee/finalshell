package com;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;

class pC_3 extends MouseAdapter {
   final com.kz_4 m;

   pC_3(com.kz_4 var1) {
      this.m = var1;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      if (SwingUtilities.isLeftMouseButton(var1)) {
         this.m.m();
      }
   }
}





