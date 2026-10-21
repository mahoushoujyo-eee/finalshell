package com;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

class dz_4 extends ComponentAdapter {
   final pA_3 w;

   dz_4(pA_3 var1) {
      this.w = var1;
   }

   @Override
   public void componentResized(ComponentEvent var1) {
      pA_3.I(this.w);
   }
}





