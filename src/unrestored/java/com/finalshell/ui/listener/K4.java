package com.finalshell.ui.listener;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class K4 implements ChangeListener {
   public final com.finalshell.ui.panel.N_2 M;

   public K4(com.finalshell.ui.panel.N_2 var1) {
      this.M = var1;
   }

   @Override
   public void stateChanged(ChangeEvent var1) {
      com.finalshell.ui.panel.N_2.r(this.M).K(com.finalshell.ui.panel.N_2.u(this.M).s());
   }
}





