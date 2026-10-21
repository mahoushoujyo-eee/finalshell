package com.finalshell.ui.listener;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class CM implements ChangeListener {
   final com.finalshell.core.N2 p;

   CM(com.finalshell.core.N2 var1) {
      this.p = var1;
   }

   @Override
   public void stateChanged(ChangeEvent var1) {
      com.finalshell.core.N2.T(this.p).repaint();
   }
}





