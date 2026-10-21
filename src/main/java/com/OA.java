package com;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class OA extends MouseAdapter {
   final _e_2 s;

   OA(_e_2 var1) {
      this.s = var1;
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      _e_2.P(this.s, true);
      this.s.repaint();
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      _e_2.P(this.s, false);
      this.s.repaint();
   }
}





