package com.finalshell.ui.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class K_2 implements ActionListener {
   final com.finalshell.ui.panel.T w;

   K_2(com.finalshell.ui.panel.T var1) {
      this.w = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.w.I.doClick(0);
   }
}





