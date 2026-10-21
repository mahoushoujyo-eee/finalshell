package com.finalshell.ui.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class P22 implements ActionListener {
   final HD F;

   P22(HD var1) {
      this.F = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.F.L.z$void();
   }
}





