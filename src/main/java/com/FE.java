package com;

import javax.swing.event.AncestorEvent;

class FE extends com.FY {
   final com.Qq_2 M;

   FE(com.Qq_2 var1) {
      this.M = var1;
   }

   @Override
   public void ancestorAdded(AncestorEvent var1) {
      this.M.R();
   }

   @Override
   public void ancestorMoved(AncestorEvent var1) {
      this.M.R();
   }
}





