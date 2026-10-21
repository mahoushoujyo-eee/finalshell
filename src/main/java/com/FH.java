package com;

import javax.swing.event.AncestorEvent;

class FH extends com.FY {
   final Ej_2 q;

   FH(Ej_2 var1) {
      this.q = var1;
   }

   @Override
   public void ancestorAdded(AncestorEvent var1) {
      Ej_2.X(this.q, Ej_2.c(this.q));
   }

   @Override
   public void ancestorRemoved(AncestorEvent var1) {
      Ej_2.X(this.q, Ej_2.O(this.q));
   }
}





