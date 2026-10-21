package com;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class PB extends MouseAdapter {
   final com.O5 K;

   PB(com.O5 var1) {
      this.K = var1;
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      this.K.r(var1);
   }
}





