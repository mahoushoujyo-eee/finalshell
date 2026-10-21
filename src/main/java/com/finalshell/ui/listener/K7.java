package com.finalshell.ui.listener;

import com.finalshell.core.Ac2;
import com.finalshell.ui.model.IC3;
import com.finalshell.ui.panel.Ky4;
import com.finalshell.ui.panel.Wd2;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

public class K7 implements AncestorListener {
   final Wd2 u;

   K7(Wd2 var1) {
      this.u = var1;
   }

   @Override
   public void ancestorAdded(AncestorEvent var1) {
      Wd2.L(this.u);
      this.u.N$void();
      this.u.t$void();
      Wd2.F(this.u, 0.0F);
      Wd2.D(this.u, IC3.fadeIn);
      Wd2.N(this.u).u$WC();
      Wd2.A(this.u);
   }

   @Override
   public void ancestorRemoved(AncestorEvent var1) {
      Ky4[] var2 = Ac2.n();
      Wd2 var10000 = this.u;
      if (var2 == null) {
         if (this.u.getParent() != null) {
            return;
         }

         var10000 = this.u;
      }

      Wd2.I(var10000);
   }

   @Override
   public void ancestorMoved(AncestorEvent var1) {
      this.u.N$void();
      this.u.t$void();
   }
}





