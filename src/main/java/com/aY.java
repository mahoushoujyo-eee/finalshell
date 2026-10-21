package com;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class aY extends WindowAdapter {
   final com.DK q;

   aY(com.DK var1) {
      this.q = var1;
   }

   @Override
   public void windowClosed(WindowEvent var1) {
      this.q.z = -1;
   }
}





