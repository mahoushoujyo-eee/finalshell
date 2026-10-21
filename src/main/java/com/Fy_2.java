package com;

import javax.swing.event.AncestorEvent;

class Fy_2 extends com.FY {
   final com.Qq_2 U;

   Fy_2(com.Qq_2 var1) {
      this.U = var1;
   }

   @Override
   public void ancestorRemoved(AncestorEvent var1) {
      this.U.q(false);
   }

   @Override
   public void ancestorMoved(AncestorEvent var1) {
      this.U.R();
   }
}





