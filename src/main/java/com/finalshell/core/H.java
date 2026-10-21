package com.finalshell.core;

import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

public class H implements WindowStateListener {
   final D Q;

   H(D var1) {
      this.Q = var1;
   }

   @Override
   public void windowStateChanged(WindowEvent var1) {
      this.Q.B = var1.getNewState();
      this.Q.R$void();
   }
}





