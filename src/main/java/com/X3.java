package com;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

class X3 extends FocusAdapter {
   final Ig_2 Z;

   X3(Ig_2 var1) {
      this.Z = var1;
   }

   @Override
   public void focusLost(FocusEvent var1) {
      this.Z.M();
   }
}





