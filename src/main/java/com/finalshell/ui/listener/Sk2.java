package com.finalshell.ui.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sk2 implements ActionListener {
   final com.finalshell.core.At2 R;
   final HD o;

   Sk2(HD var1, com.finalshell.core.At2 var2) {
      this.o = var1;
      this.R = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.o.L.f(this.R, 4);
   }
}





