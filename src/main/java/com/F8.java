package com;

import javax.swing.event.AncestorEvent;

class F8 extends com.FY {
   final SW X;
   final com.DA z;

   F8(com.DA var1, SW var2) {
      this.z = var1;
      this.X = var2;
   }

   @Override
   public void ancestorAdded(AncestorEvent var1) {
      com.DA.l(this.z).requestFocusInWindow();
   }
}





