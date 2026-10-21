package com;

import javax.swing.event.AncestorEvent;

class Fh_2 extends com.FY {
   final com.Wd_2 t;

   Fh_2(com.Wd_2 var1) {
      this.t = var1;
   }

   @Override
   public void ancestorRemoved(AncestorEvent var1) {
      this.t.j();
   }

   @Override
   public void ancestorMoved(AncestorEvent var1) {
      this.t.j();
   }
}





