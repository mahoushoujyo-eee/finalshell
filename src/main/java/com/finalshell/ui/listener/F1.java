package com.finalshell.ui.listener;

import com.finalshell.core.Xs2;
import javax.swing.event.AncestorEvent;

public class F1 extends FY {
   final Xs2 b;

   F1(Xs2 var1) {
      this.b = var1;
   }

   @Override
   public void ancestorAdded(AncestorEvent var1) {
      this.b.o(Xs2.r(this.b));
   }
}





