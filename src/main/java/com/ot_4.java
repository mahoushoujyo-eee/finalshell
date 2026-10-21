package com;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

class ot_4 implements FocusListener {
   final com.QH u;

   ot_4(com.QH var1) {
      this.u = var1;
   }

   @Override
   public void focusLost(FocusEvent var1) {
      com.QH.P(this.u).repaint();
   }

   @Override
   public void focusGained(FocusEvent var1) {
      com.QH.P(this.u).repaint();
   }
}





