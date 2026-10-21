package com.C;

import java.awt.Container;
import javax.swing.event.AncestorEvent;

class s_2 extends com.FY {
   final com.Ov_2 j;
   final J d;

   s_2(J var1, com.Ov_2 var2) {
      this.d = var1;
      this.j = var2;
   }

   @Override
   public void ancestorAdded(AncestorEvent var1) {
      int[] var10000 = com.C.W.B();
      Container var3 = this.j.getParent();
      int[] var2 = var10000;
      if (var2 == null) {
         if (var3 instanceof com.kE_3) {
            this.d.O = (com.kE_3)var3;
            this.d.O.addContainerListener(this.d.F);
         }

         this.d.Z();
      }
   }

   @Override
   public void ancestorRemoved(AncestorEvent var1) {
      this.d.U();
      this.d.Z();
   }
}





