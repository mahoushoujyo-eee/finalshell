package com;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;

class rL_3 extends MouseAdapter {
   final com.k4_2 d;

   rL_3(com.k4_2 var1) {
      this.d = var1;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      if (SwingUtilities.isLeftMouseButton(var1)) {
         com.k4_2.L(this.d).doClick(0);
      }
   }
}





