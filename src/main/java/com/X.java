package com;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

class X extends ComponentAdapter {
   final Hl_2 g;

   X(Hl_2 var1) {
      this.g = var1;
   }

   @Override
   public void componentResized(ComponentEvent var1) {
      this.g.h();
   }
}





