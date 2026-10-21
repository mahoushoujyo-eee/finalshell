package com.finalshell.ui.listener;

import com.finalshell.core.Xm2;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class Ri4 implements AdjustmentListener {
   final Xm2 d;

   Ri4(Xm2 var1) {
      this.d = var1;
   }

   @Override
   public void adjustmentValueChanged(AdjustmentEvent var1) {
      Xm2.x(this.d).repaint();
   }
}





