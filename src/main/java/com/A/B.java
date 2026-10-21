package com.A;

import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

class B implements WindowFocusListener {
   final com.A.d Y;

   B(com.A.d var1) {
      this.Y = var1;
   }

   @Override
   public void windowGainedFocus(WindowEvent var1) {
      this.Y.N.repaint();
   }

   @Override
   public void windowLostFocus(WindowEvent var1) {
      this.Y.N.repaint();
   }
}





