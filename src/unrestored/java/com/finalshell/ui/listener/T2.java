package com.finalshell.ui.listener;

import com.finalshell.core.W_2;
import com.finalshell.ui.panel.KE3;
import java.awt.Container;
import javax.swing.event.AncestorEvent;

public class T2 extends FY {
   public final com.finalshell.core.KR M;
   public final com.finalshell.core.X f;

   public T2(com.finalshell.core.X var1, com.finalshell.core.KR var2) {
      this.f = var1;
      this.M = var2;
   }

   @Override
   public void ancestorAdded(AncestorEvent var1) {
      int[] var10000 = W_2.B$arrint();
      Container var3 = this.M.getParent();
      int[] var2 = var10000;
      if (var2 == null) {
         if (var3 instanceof KE3) {
            this.f.u = (KE3)var3;
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





