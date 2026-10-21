package com.finalshell.core;

import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

public class B_2 implements WindowFocusListener {
   public final D Y;

   public B_2(D var1) {
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





