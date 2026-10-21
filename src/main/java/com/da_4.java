package com;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

class da_4 extends ComponentAdapter {
   final com.QH q;

   da_4(com.QH var1) {
      this.q = var1;
   }

   @Override
   public void componentResized(ComponentEvent var1) {
      this.q.h();
   }
}





