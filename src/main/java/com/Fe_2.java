package com;

import javax.swing.event.AncestorEvent;

class Fe_2 extends com.FY {
   final com.Oj_2 d;

   Fe_2(com.Oj_2 var1) {
      this.d = var1;
   }

   @Override
   public void ancestorRemoved(AncestorEvent var1) {
      this.d.f(false);
   }

   @Override
   public void ancestorAdded(AncestorEvent var1) {
      this.d.f(false);
   }

   @Override
   public void ancestorMoved(AncestorEvent var1) {
      this.d.f(false);
   }
}





