package com.L;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

class O extends FocusAdapter {
   final m F;

   O(m var1) {
      this.F = var1;
   }

   @Override
   public void focusGained(FocusEvent var1) {
      m.v(this.F).repaint();
   }

   @Override
   public void focusLost(FocusEvent var1) {
      m.R(this.F).repaint();
   }
}





