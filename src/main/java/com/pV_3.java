package com;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

class pV_3 extends FocusAdapter {
   final com.KV n;

   pV_3(com.KV var1) {
      this.n = var1;
   }

   @Override
   public void focusGained(FocusEvent var1) {
      com.KV.q(this.n).repaint();
   }

   @Override
   public void focusLost(FocusEvent var1) {
      com.KV.C(this.n).repaint();
   }
}





