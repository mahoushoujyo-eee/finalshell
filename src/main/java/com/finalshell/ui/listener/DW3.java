package com.finalshell.ui.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DW3 implements ActionListener {
   public final com.finalshell.ui.panel.Qq2 s;

   public DW3(com.finalshell.ui.panel.Qq2 var1) {
      this.s = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.s.g();
   }
}





