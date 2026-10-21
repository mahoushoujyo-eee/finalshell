package com;

import javax.swing.event.AncestorEvent;

class Fx_2 extends com.FY {
   final com.zU L;
   final com.QL E;

   Fx_2(com.QL var1, com.zU var2) {
      this.E = var1;
      this.L = var2;
   }

   @Override
   public void ancestorAdded(AncestorEvent var1) {
      Rn_2.h(this.L);
   }

   @Override
   public void ancestorRemoved(AncestorEvent var1) {
      Rn_2.F(this.L);
   }
}





