package com;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

class wc_4 extends FocusAdapter {
   final IH l;

   wc_4(IH var1) {
      this.l = var1;
   }

   @Override
   public void focusLost(FocusEvent var1) {
      this.l.M();
   }
}





