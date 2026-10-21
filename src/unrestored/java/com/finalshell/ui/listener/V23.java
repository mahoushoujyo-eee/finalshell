package com.finalshell.ui.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class V23 implements ActionListener {
   public final com.finalshell.ui.panel.N_2 w;

   public V23(com.finalshell.ui.panel.N_2 var1) {
      this.w = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      com.finalshell.ui.panel.N_2.l(this.w, 1);
      this.w.x(this.w.t$Color());
      com.finalshell.ui.panel.N_2.c(this.w, var1);
   }
}





