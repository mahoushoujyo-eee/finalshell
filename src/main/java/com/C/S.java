package com.C;

import java.awt.Container;
import javax.swing.event.AncestorEvent;

class S extends com.FY {
   final com.Qx_2 Y;
   final com.C.a_2 U;

   S(com.C.a_2 var1, com.Qx_2 var2) {
      this.U = var1;
      this.Y = var2;
   }

   @Override
   public void ancestorAdded(AncestorEvent var1) {
      int[] var10000 = com.C.W.B();
      Container var3 = this.Y.getParent();
      int[] var2 = var10000;
      if (var2 == null) {
         if (var3 instanceof com.kE_3) {
            this.U.t = (com.kE_3)var3;
            this.U.t.addContainerListener(this.U.G);
         }

         this.U.Z();
      }
   }

   @Override
   public void ancestorRemoved(AncestorEvent var1) {
      this.U.K();
      this.U.Z();
   }
}





