package com;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

class Os_2 extends FocusAdapter {
   final com.OG I;

   Os_2(com.OG var1) {
      this.I = var1;
   }

   @Override
   public void focusGained(FocusEvent var1) {
      this.I.repaint();
   }

   @Override
   public void focusLost(FocusEvent var1) {
      this.I.repaint();
   }
}





