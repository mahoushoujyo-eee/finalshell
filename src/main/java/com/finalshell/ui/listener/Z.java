package com.finalshell.ui.listener;

import com.finalshell.core.W_2;
import com.finalshell.ui.panel.KE3;
import com.finalshell.ui.panel.Ki4;
import java.awt.Container;
import javax.swing.event.AncestorEvent;

public class Z extends FY {
   final Ki4 U;
   final com.finalshell.core.I H;

   Z(com.finalshell.core.I var1, Ki4 var2) {
      this.H = var1;
      this.U = var2;
   }

   @Override
   public void ancestorAdded(AncestorEvent var1) {
      int[] var10000 = W_2.B$arrint();
      Container var3 = this.U.getParent();
      int[] var2 = var10000;
      if (var2 == null) {
         if (var3 instanceof KE3) {
            this.H.A = (KE3)var3;
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





