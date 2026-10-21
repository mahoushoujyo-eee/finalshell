package com.finalshell.ui.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IA3 implements ActionListener {
   final com.finalshell.core.At2 t;
   final HD d;

   IA3(HD var1, com.finalshell.core.At2 var2) {
      this.d = var1;
      this.t = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.d.L.f(this.t, 1);
   }
}





