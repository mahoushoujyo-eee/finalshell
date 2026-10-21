package com;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class lX_3 extends MouseAdapter {
   final com.kc_4 l;

   lX_3(com.kc_4 var1) {
      this.l = var1;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      this.l.requestFocusInWindow();
   }
}





