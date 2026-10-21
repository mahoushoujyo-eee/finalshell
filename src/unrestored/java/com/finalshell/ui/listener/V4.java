package com.finalshell.ui.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class V4 implements ActionListener {
   public final com.finalshell.ui.panel.N_2 J;

   public V4(com.finalshell.ui.panel.N_2 var1) {
      this.J = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      com.finalshell.ui.panel.N_2.l(this.J, 0);
      com.finalshell.ui.panel.N_2.O(this.J, var1);
   }
}





