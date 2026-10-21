package com.finalshell.ui.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Z3 implements ActionListener {
   final com.finalshell.ui.dialog.E v;

   Z3(com.finalshell.ui.dialog.E var1) {
      this.v = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      com.finalshell.ui.dialog.E.I(this.v, 1);
   }
}





