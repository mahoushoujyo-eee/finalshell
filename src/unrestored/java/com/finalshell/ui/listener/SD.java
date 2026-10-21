package com.finalshell.ui.listener;

import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class SD implements MouseWheelListener {
   public final com.finalshell.core.N2 l;

   public SD(com.finalshell.core.N2 var1) {
      this.l = var1;
   }

   @Override
   public void mouseWheelMoved(MouseWheelEvent var1) {
      int var2 = com.finalshell.core.N2.x(this.l).getValue() - var1.getWheelRotation();
      com.finalshell.core.N2.H(this.l)
         .setValue(Math.min(Math.max(com.finalshell.core.N2.o(this.l).getMinimum(), var2), com.finalshell.core.N2.I(this.l).getMaximum()));
   }
}





