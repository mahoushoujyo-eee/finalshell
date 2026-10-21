package com;

import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

class ri_4 implements AdjustmentListener {
   final Xm_2 d;

   ri_4(Xm_2 var1) {
      this.d = var1;
   }

   @Override
   public void adjustmentValueChanged(AdjustmentEvent var1) {
      Xm_2.x(this.d).repaint();
   }
}





