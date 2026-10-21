package com.finalshell.ui.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class X_2 implements ActionListener {
   final com.finalshell.ui.panel.T l;

   X_2(com.finalshell.ui.panel.T var1) {
      this.l = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.l.v(var1);
   }
}





