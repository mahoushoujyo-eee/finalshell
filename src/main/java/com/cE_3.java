package com;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

class cE_3 extends FocusAdapter {
   final nx_4 n;

   cE_3(nx_4 var1) {
      this.n = var1;
   }

   @Override
   public void focusLost(FocusEvent var1) {
      this.n.b();
   }
}





