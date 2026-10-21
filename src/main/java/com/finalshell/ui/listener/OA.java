package com.finalshell.ui.listener;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class OA extends MouseAdapter {
   final com.finalshell.ui.panel.E2 s;

   OA(com.finalshell.ui.panel.E2 var1) {
      this.s = var1;
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      com.finalshell.ui.panel.E2.P(this.s, true);
      this.s.repaint();
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      com.finalshell.ui.panel.E2.P(this.s, false);
      this.s.repaint();
   }
}





