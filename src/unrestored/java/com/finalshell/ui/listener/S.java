package com.finalshell.ui.listener;

import com.finalshell.core.A2_2;
import com.finalshell.core.Qx2;
import com.finalshell.core.W_2;
import com.finalshell.ui.panel.KE3;
import java.awt.Container;
import javax.swing.event.AncestorEvent;

public class S extends FY {
   public final Qx2 Y;
   public final A2_2 U;

   public S(A2_2 var1, Qx2 var2) {
      this.U = var1;
      this.Y = var2;
   }

   @Override
   public void ancestorAdded(AncestorEvent var1) {
      int[] var10000 = W_2.B$arrint();
      Container var3 = this.Y.getParent();
      int[] var2 = var10000;
      if (var2 == null) {
         if (var3 instanceof KE3) {
            this.U.t = (KE3)var3;
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





