package com;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

class yD_3 extends ComponentAdapter {
   final com.lk_4 o;

   yD_3(com.lk_4 var1) {
      this.o = var1;
   }

   @Override
   public void componentHidden(ComponentEvent var1) {
      this.o.C();
   }
}





