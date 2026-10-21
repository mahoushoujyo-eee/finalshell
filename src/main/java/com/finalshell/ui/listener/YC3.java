package com.finalshell.ui.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class YC3 implements ActionListener {
   final com.finalshell.core.Lk4 v;

   YC3(com.finalshell.core.Lk4 var1) {
      this.v = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.v.q();
   }
}





