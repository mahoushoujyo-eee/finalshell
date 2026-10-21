package com;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

class ys_4 extends ComponentAdapter {
   final Ie_2 W;

   ys_4(Ie_2 var1) {
      this.W = var1;
   }

   @Override
   public void componentResized(ComponentEvent var1) {
      this.W.M();
   }

   @Override
   public void componentMoved(ComponentEvent var1) {
      this.W.M();
   }
}





