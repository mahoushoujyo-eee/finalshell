package com.C;

import java.awt.Container;
import javax.swing.event.AncestorEvent;

class Z extends com.FY {
   final com.ki_4 U;
   final I H;

   Z(I var1, com.ki_4 var2) {
      this.H = var1;
      this.U = var2;
   }

   @Override
   public void ancestorAdded(AncestorEvent var1) {
      int[] var10000 = com.C.W.B();
      Container var3 = this.U.getParent();
      int[] var2 = var10000;
      if (var2 == null) {
         if (var3 instanceof com.kE_3) {
            this.H.A = (com.kE_3)var3;
            this.H.A.addContainerListener(this.H.S);
         }

         this.H.Z();
      }
   }

   @Override
   public void ancestorRemoved(AncestorEvent var1) {
      this.H.r();
      this.H.Z();
   }
}





