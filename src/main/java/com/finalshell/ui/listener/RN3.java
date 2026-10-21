package com.finalshell.ui.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RN3 implements ActionListener {
   public final com.finalshell.core.At2 n;
   public final HD T;

   public RN3(HD var1, com.finalshell.core.At2 var2) {
      this.T = var1;
      this.n = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.T.L.f(this.n, 2);
   }
}





