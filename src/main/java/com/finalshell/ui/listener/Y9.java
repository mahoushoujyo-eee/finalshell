package com.finalshell.ui.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Y9 implements ActionListener {
   final com.finalshell.ui.panel.N_2 L;

   Y9(com.finalshell.ui.panel.N_2 var1) {
      this.L = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.L.x(this.L.t$Color());
      com.finalshell.ui.panel.N_2.D(this.L, var1);
   }
}





