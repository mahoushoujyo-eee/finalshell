package com.finalshell.ui.listener;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class Ih4 extends ComponentAdapter {
   public final com.finalshell.ui.panel.Qq2 Q;

   public Ih4(com.finalshell.ui.panel.Qq2 var1) {
      this.Q = var1;
   }

   @Override
   public void componentHidden(ComponentEvent var1) {
      this.Q.q(false);
   }

   @Override
   public void componentResized(ComponentEvent var1) {
      this.Q.R();
   }

   @Override
   public void componentMoved(ComponentEvent var1) {
      this.Q.R();
   }
}





