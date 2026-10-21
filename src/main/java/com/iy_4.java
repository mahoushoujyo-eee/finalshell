package com;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class iy_4 extends MouseAdapter {
   final nr_4 g;

   iy_4(nr_4 var1) {
      this.g = var1;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      this.g.o.r(this.g.q);
   }
}





