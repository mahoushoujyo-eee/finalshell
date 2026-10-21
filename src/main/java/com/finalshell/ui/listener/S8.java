package com.finalshell.ui.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class S8 implements ActionListener {
   final com.finalshell.core.At2 R;
   final HD b;

   S8(HD var1, com.finalshell.core.At2 var2) {
      this.b = var1;
      this.R = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.b.L.f(this.R, 3);
   }
}





