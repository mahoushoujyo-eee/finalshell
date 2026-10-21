package com.finalshell.ui.listener;

import com.finalshell.core.Ix2;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class EL implements AdjustmentListener {
   final Ix2 Y;

   EL(Ix2 var1) {
      this.Y = var1;
   }

   @Override
   public void adjustmentValueChanged(AdjustmentEvent var1) {
      this.Y.M();
   }
}





