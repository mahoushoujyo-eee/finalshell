package com.C;

import java.awt.Container;
import javax.swing.event.AncestorEvent;

class T extends com.FY {
   final com.KR M;
   final com.C.X f;

   T(com.C.X var1, com.KR var2) {
      this.f = var1;
      this.M = var2;
   }

   @Override
   public void ancestorAdded(AncestorEvent var1) {
      int[] var10000 = com.C.W.B();
      Container var3 = this.M.getParent();
      int[] var2 = var10000;
      if (var2 == null) {
         if (var3 instanceof com.kE_3) {
            this.f.u = (com.kE_3)var3;
            this.f.u.addContainerListener(this.f.D);
         }

         this.f.Z();
      }
   }

   @Override
   public void ancestorRemoved(AncestorEvent var1) {
      this.f.V();
      this.f.Z();
   }
}





