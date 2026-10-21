package com.finalshell.ui.listener;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class KS3 extends MouseAdapter {
   final com.finalshell.core.OC3 E;

   KS3(com.finalshell.core.OC3 var1) {
      this.E = var1;
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      this.E.i = true;
      com.finalshell.core.OC3.l(this.E).repaint();
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      this.E.i = false;
      com.finalshell.core.OC3.w(this.E).repaint();
   }
}





