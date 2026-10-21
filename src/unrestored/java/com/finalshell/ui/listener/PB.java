package com.finalshell.ui.listener;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PB extends MouseAdapter {
   public final com.finalshell.core.O5 K;

   public PB(com.finalshell.core.O5 var1) {
      this.K = var1;
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      this.K.r(var1);
   }
}





