package com.finalshell.ui.listener;

import com.finalshell.core.FN;
import com.finalshell.ui.panel.XT3;
import javax.swing.event.AncestorEvent;

public class N_2 extends FY {
   final XT3 f;
   final com.finalshell.ui.panel.T M;

   N_2(com.finalshell.ui.panel.T var1, XT3 var2) {
      this.M = var1;
      this.f = var2;
   }

   @Override
   public void ancestorAdded(AncestorEvent var1) {
      this.h();
   }

   @Override
   public void ancestorMoved(AncestorEvent var1) {
      this.h();
   }

   public void h() {
      this.f.O(FN.O$boolean(this.M));
   }
}





