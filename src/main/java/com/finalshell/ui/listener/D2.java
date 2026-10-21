package com.finalshell.ui.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class D2 implements ActionListener {
   final com.finalshell.ui.dialog.E N;

   D2(com.finalshell.ui.dialog.E var1) {
      this.N = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      com.finalshell.ui.dialog.E.I(this.N, 0);
   }
}





