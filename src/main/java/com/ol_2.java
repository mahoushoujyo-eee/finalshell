package com;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

class Ol_2 extends ComponentAdapter {
   final com.oY_3 M;

   Ol_2(com.oY_3 var1) {
      this.M = var1;
   }

   @Override
   public void componentResized(ComponentEvent var1) {
      this.M.P();
   }
}





