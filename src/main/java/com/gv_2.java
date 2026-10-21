package com;

import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

class Gv_2 implements AdjustmentListener {
   final _y_2 n;

   Gv_2(_y_2 var1) {
      this.n = var1;
   }

   @Override
   public void adjustmentValueChanged(AdjustmentEvent var1) {
      this.n.e.repaint();
   }
}





