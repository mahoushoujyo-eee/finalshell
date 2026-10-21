package com.finalshell.ui.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class C_u_2 implements ActionListener {
   final com.finalshell.core.Lk4 b;

   C_u_2(com.finalshell.core.Lk4 var1) {
      this.b = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.b.Y(true);
   }
}





