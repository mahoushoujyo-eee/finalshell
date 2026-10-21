package com.finalshell.ui.listener;

import com.finalshell.core.FN;
import com.finalshell.ui.panel.Kz4;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ir4 implements ActionListener {
   final Kz4 b;

   Ir4(Kz4 var1) {
      this.b = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.b.transferFocus();
      FN.M(this.b.S);
      this.b.S.r(this.b.W);
   }
}





