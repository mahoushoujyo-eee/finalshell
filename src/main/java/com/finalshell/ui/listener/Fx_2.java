package com.finalshell.ui.listener;

import com.finalshell.core.Rn2;
import com.finalshell.core.ZU;
import com.finalshell.ui.panel.QL;
import javax.swing.event.AncestorEvent;

public class Fx_2 extends FY {
   final ZU L;
   final QL E;

   Fx_2(QL var1, ZU var2) {
      this.E = var1;
      this.L = var2;
   }

   @Override
   public void ancestorAdded(AncestorEvent var1) {
      Rn2.h(this.L);
   }

   @Override
   public void ancestorRemoved(AncestorEvent var1) {
      Rn2.F(this.L);
   }
}





