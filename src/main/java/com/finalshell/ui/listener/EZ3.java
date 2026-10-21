package com.finalshell.ui.listener;

import com.finalshell.core.Ig2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EZ3 implements ActionListener {
   final Ig2 I;

   EZ3(Ig2 var1) {
      this.I = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.I.M();
   }
}





