package com.finalshell.ui.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class X3 implements ActionListener {
   final com.finalshell.ui.dialog.E V;

   X3(com.finalshell.ui.dialog.E var1) {
      this.V = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      com.finalshell.ui.dialog.E.I(this.V, 0);
   }
}





