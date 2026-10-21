package com;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

class Gp_2 extends ComponentAdapter {
   final com.Wd_2 I;

   Gp_2(com.Wd_2 var1) {
      this.I = var1;
   }

   @Override
   public void componentResized(ComponentEvent var1) {
      this.I.t();
   }
}





