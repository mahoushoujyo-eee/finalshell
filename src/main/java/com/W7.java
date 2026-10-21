package com;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;

class W7 extends MouseAdapter {
   final com.ku_4 N;
   final Component W;

   W7(com.ku_4 var1, Component var2) {
      this.N = var1;
      this.W = var2;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      int var2 = com.ku_4.H();
      if (var2 == 0) {
         if (!SwingUtilities.isMiddleMouseButton(var1)) {
            return;
         }

         this.N.remove(this.W);
         this.N.revalidate();
      }

      this.N.repaint();
   }
}





