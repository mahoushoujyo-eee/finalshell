package com.finalshell.ui.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class M2 implements ActionListener {
   public final com.finalshell.ui.dialog.E x;

   public M2(com.finalshell.ui.dialog.E var1) {
      this.x = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      com.finalshell.ui.dialog.E.I(this.x, 2);
   }
}





