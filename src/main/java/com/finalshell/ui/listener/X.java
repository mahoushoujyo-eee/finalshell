package com.finalshell.ui.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class X implements ActionListener {
   public final com.finalshell.core.D K;

   public X(com.finalshell.core.D var1) {
      this.K = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.K.Q();
   }
}





