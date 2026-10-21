package com;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

class cK_3 extends ComponentAdapter {
   final Ic_2 n;

   cK_3(Ic_2 var1) {
      this.n = var1;
   }

   @Override
   public void componentMoved(ComponentEvent var1) {
      Ic_2.w(this.n);
   }

   @Override
   public void componentResized(ComponentEvent var1) {
      Ic_2.w(this.n);
   }
}





