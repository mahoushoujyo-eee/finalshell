package com.finalshell.ui.listener;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class T3 implements ChangeListener {
   public final com.finalshell.ui.panel.N_2 k;

   public T3(com.finalshell.ui.panel.N_2 var1) {
      this.k = var1;
   }

   @Override
   public void stateChanged(ChangeEvent var1) {
      com.finalshell.ui.panel.N_2.y(this.k, com.finalshell.ui.panel.N_2.r(this.k).d$Color());
      com.finalshell.ui.panel.N_2.a(this.k, com.finalshell.ui.panel.N_2.c(this.k), com.finalshell.ui.model.A2.palette);
   }
}





