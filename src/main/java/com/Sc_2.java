package com;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

class Sc_2 extends ComponentAdapter {
   final pA_3 G;

   Sc_2(pA_3 var1) {
      this.G = var1;
   }

   @Override
   public void componentResized(ComponentEvent var1) {
      pA_3.I(this.G);
   }
}





