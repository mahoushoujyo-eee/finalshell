package com.finalshell.ui.listener;

import com.finalshell.ui.panel.KD3;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LA3 implements ActionListener {
   public final KD3 T;

   public LA3(KD3 var1) {
      this.T = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      KD3.c(this.T).R$void();
   }
}





