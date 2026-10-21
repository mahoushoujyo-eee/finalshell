package com.finalshell.ui.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sh2 implements ActionListener {
   final int I;
   final HD P;

   Sh2(HD var1, int var2) {
      this.P = var1;
      this.I = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.P.L.R(this.P.L.x(this.I));
   }
}





