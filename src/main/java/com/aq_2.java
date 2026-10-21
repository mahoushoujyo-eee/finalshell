package com;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

class aq_2 extends FocusAdapter {
   final Ic_2 S;

   aq_2(Ic_2 var1) {
      this.S = var1;
   }

   @Override
   public void focusLost(FocusEvent var1) {
      Ic_2.w(this.S);
   }
}





