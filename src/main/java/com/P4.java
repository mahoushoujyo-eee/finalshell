package com;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class P4 extends MouseAdapter {
   final com.O5 c;

   P4(com.O5 var1) {
      this.c = var1;
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      this.c.r(var1);
   }
}





