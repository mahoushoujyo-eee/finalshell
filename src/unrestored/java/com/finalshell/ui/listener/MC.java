package com.finalshell.ui.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MC implements ActionListener {
   public final Y7 t;

   public MC(Y7 var1) {
      this.t = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.t.l.M(com.finalshell.ui.model.M2.tiles);
   }
}





