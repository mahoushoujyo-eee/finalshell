package com.finalshell.ui.listener;

import com.finalshell.ui.panel.ConnectionProperty;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class Gv2 implements AdjustmentListener {
   public final ConnectionProperty n;

   public Gv2(ConnectionProperty var1) {
      this.n = var1;
   }

   @Override
   public void adjustmentValueChanged(AdjustmentEvent var1) {
      this.n.e.repaint();
   }
}





