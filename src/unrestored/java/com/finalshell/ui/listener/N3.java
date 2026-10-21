package com.finalshell.ui.listener;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class N3 implements ChangeListener {
   public final com.finalshell.core.U_2 S;

   public N3(com.finalshell.core.U_2 var1) {
      this.S = var1;
   }

   @Override
   public void stateChanged(ChangeEvent var1) {
      int var2 = com.finalshell.ui.panel.N_2.W();
      if (var2 != 0 && !com.finalshell.core.U_2.x(this.S)) {
         com.finalshell.core.U_2.N(this.S, true);
         com.finalshell.core.U_2.k(this.S).setSelectedColor(com.finalshell.core.U_2.c(this.S).T());
         com.finalshell.core.U_2.N(this.S, false);
      }
   }
}





