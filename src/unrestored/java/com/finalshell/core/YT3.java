package com.finalshell.core;

import com.finalshell.ui.dialog.Ds2;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

public class YT3 implements WindowFocusListener {
   public final Ds2 F;

   public YT3(Ds2 var1) {
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





