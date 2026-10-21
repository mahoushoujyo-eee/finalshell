package com.finalshell.ui.listener;

import com.finalshell.core.Ej2;
import javax.swing.event.AncestorEvent;

public class FH2 extends FY {
   final Ej2 q;

   FH2(Ej2 var1) {
      this.q = var1;
   }

   @Override
   public void ancestorAdded(AncestorEvent var1) {
      Ej2.X(this.q, Ej2.c(this.q));
   }

   @Override
   public void ancestorRemoved(AncestorEvent var1) {
      Ej2.X(this.q, Ej2.O(this.q));
   }
}





