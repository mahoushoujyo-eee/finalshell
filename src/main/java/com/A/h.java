package com.A;

import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

class h implements WindowStateListener {
   final com.A.d Q;

   h(com.A.d var1) {
      this.Q = var1;
   }

   @Override
   public void windowStateChanged(WindowEvent var1) {
      this.Q.B = var1.getNewState();
      this.Q.R();
   }
}





