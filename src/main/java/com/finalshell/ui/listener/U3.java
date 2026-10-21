package com.finalshell.ui.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class U3 implements ActionListener {
   final com.finalshell.core.D j;

   U3(com.finalshell.core.D var1) {
      this.j = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.j.U();
   }
}





