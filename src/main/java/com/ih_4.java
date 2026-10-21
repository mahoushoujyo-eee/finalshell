package com;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

class ih_4 extends ComponentAdapter {
   final com.Qq_2 Q;

   ih_4(com.Qq_2 var1) {
      this.Q = var1;
   }

   @Override
   public void componentHidden(ComponentEvent var1) {
      this.Q.q(false);
   }

   @Override
   public void componentResized(ComponentEvent var1) {
      this.Q.R();
   }

   @Override
   public void componentMoved(ComponentEvent var1) {
      this.Q.R();
   }
}





