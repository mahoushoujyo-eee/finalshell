package com.finalshell.ui.listener;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class X22 implements ChangeListener {
   public final com.finalshell.core.U_2 g;

   public X22(com.finalshell.core.U_2 var1) {
      this.g = var1;
   }

   @Override
   public void stateChanged(ChangeEvent var1) {
      int var2 = com.finalshell.ui.panel.N_2.g();
      if (var2 == 0 && !com.finalshell.core.U_2.x(this.g)) {
         com.finalshell.core.U_2.N(this.g, true);
         com.finalshell.core.U_2.c(this.g).x(com.finalshell.core.U_2.k(this.g).getSelectedColor());
         com.finalshell.core.U_2.N(this.g, false);
      }
   }
}





