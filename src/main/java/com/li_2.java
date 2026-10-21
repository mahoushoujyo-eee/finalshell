package com;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

class Li_2 implements FocusListener {
   final Hl_2 O;

   Li_2(Hl_2 var1) {
      this.O = var1;
   }

   @Override
   public void focusLost(FocusEvent var1) {
      Hl_2.s(this.O).repaint();
   }

   @Override
   public void focusGained(FocusEvent var1) {
      Hl_2.s(this.O).repaint();
   }
}





