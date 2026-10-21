package com.finalshell.ui.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Du4 implements ActionListener {
   public final HD q;

   public Du4(HD var1) {
      this.q = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.q.L.d();
   }
}





