package com.finalshell.ui.listener;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class P4 extends MouseAdapter {
   public final com.finalshell.core.O5 c;

   public P4(com.finalshell.core.O5 var1) {
      this.c = var1;
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      this.c.r(var1);
   }
}





