package com.finalshell.ui.listener;

import com.finalshell.ui.panel.KD3;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Xi4 implements ActionListener {
   public final KD3 F;

   public Xi4(KD3 var1) {
      this.F = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      KD3.c(this.F).Q$void();
   }
}





