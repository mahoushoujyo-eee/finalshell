package com;

import javax.swing.event.AncestorEvent;

class F1 extends com.FY {
   final Xs_2 b;

   F1(Xs_2 var1) {
      this.b = var1;
   }

   @Override
   public void ancestorAdded(AncestorEvent var1) {
      this.b.o(Xs_2.r(this.b));
   }
}





