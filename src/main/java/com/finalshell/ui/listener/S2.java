package com.finalshell.ui.listener;

import com.finalshell.core.W_2;
import com.finalshell.ui.panel.KE3;
import java.awt.Container;
import javax.swing.event.AncestorEvent;

public class S2 extends FY {
   final com.finalshell.ui.panel.Ov2 j;
   final com.finalshell.core.J_2 d;

   S2(com.finalshell.core.J_2 var1, com.finalshell.ui.panel.Ov2 var2) {
      this.d = var1;
      this.j = var2;
   }

   @Override
   public void ancestorAdded(AncestorEvent var1) {
      int[] var10000 = W_2.B$arrint();
      Container var3 = this.j.getParent();
      int[] var2 = var10000;
      if (var2 == null) {
         if (var3 instanceof KE3) {
            this.d.O = (KE3)var3;
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





