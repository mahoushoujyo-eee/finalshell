package com;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

class Nn_2 extends FocusAdapter {
   final com.az_2 S;

   Nn_2(com.az_2 var1) {
      this.S = var1;
   }

   @Override
   public void focusLost(FocusEvent var1) {
      this.S.N(var1);
   }
}





