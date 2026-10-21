package com;

import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

class yT_3 implements WindowFocusListener {
   final com.Ds_2 F;

   yT_3(com.Ds_2 var1) {
      this.F = var1;
   }

   @Override
   public void windowGainedFocus(WindowEvent var1) {
      this.F.P(true);
   }

   @Override
   public void windowLostFocus(WindowEvent var1) {
      this.F.P(false);
   }
}





