package com.t;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class J extends WindowAdapter {
   final s_3 L;

   J(s_3 var1) {
      this.L = var1;
   }

   @Override
   public void windowClosed(WindowEvent var1) {
      s_3.K(this.L).z(-1);
   }
}





