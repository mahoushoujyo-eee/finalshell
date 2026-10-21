package com.finalshell.ui.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LL implements ActionListener {
   public final com.finalshell.ui.panel.Qq2 O;

   public LL(com.finalshell.ui.panel.Qq2 var1) {
      this.O = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.O.q(true);
   }
}





