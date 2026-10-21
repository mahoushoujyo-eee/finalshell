package com;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

class KX extends FocusAdapter {
   final com.az_2 J;

   KX(com.az_2 var1) {
      this.J = var1;
   }

   @Override
   public void focusGained(FocusEvent var1) {
      this.J.N(var1);
   }
}





