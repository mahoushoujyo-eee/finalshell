package com;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class rg_4 extends MouseAdapter {
   final com.kc_4 Y;

   rg_4(com.kc_4 var1) {
      this.Y = var1;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      this.Y.requestFocusInWindow();
   }
}





