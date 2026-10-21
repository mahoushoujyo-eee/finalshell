package com.finalshell.ui.listener;

import com.finalshell.core.KD;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Z5 extends MouseAdapter {
   final KD L;
   final com.finalshell.ui.panel.N_2 P;

   Z5(com.finalshell.ui.panel.N_2 var1, KD var2) {
      this.P = var1;
      this.L = var2;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      if (var1.getClickCount() == 2) {
         this.L.doClick(0);
      }
   }
}





