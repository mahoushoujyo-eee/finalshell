package com.finalshell.ui.listener;

import com.finalshell.core.Pk4;
import javax.swing.event.AncestorEvent;

public class F9 extends FY {
   public final Pk4 M;

   public F9(Pk4 var1) {
      this.M = var1;
   }

   @Override
   public void ancestorAdded(AncestorEvent var1) {
      this.M.h();
      Pk4.I(this.M, Pk4.b(this.M), false);
   }
}





