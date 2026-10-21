package com;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class kS_3 extends MouseAdapter {
   final com.oC_3 E;

   kS_3(com.oC_3 var1) {
      this.E = var1;
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      this.E.i = true;
      com.oC_3.l(this.E).repaint();
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      this.E.i = false;
      com.oC_3.w(this.E).repaint();
   }
}





