package com;

import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

class EL implements AdjustmentListener {
   final Ix_2 Y;

   EL(Ix_2 var1) {
      this.Y = var1;
   }

   @Override
   public void adjustmentValueChanged(AdjustmentEvent var1) {
      this.Y.M();
   }
}





