package com.finalshell.ui.listener;

import com.finalshell.ui.panel.EX;
import com.finalshell.ui.panel.KD3;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FA implements ActionListener {
   public final EX w;
   public final KD3 F;

   public FA(KD3 var1, EX var2) {
      this.F = var1;
      this.w = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.w.setValue(1);
   }
}





