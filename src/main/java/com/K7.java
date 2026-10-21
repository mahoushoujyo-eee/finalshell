package com;

import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

class K7 implements AncestorListener {
   final com.Wd_2 u;

   K7(com.Wd_2 var1) {
      this.u = var1;
   }

   @Override
   public void ancestorAdded(AncestorEvent var1) {
      com.Wd_2.L(this.u);
      this.u.N();
      this.u.t();
      com.Wd_2.F(this.u, 0.0F);
      com.Wd_2.D(this.u, iC_3.fadeIn);
      com.Wd_2.N(this.u).u();
      com.Wd_2.A(this.u);
   }

   @Override
   public void ancestorRemoved(AncestorEvent var1) {
      com.ky_4[] var2 = com.ac_2.n();
      com.Wd_2 var10000 = this.u;
      if (var2 == null) {
         if (this.u.getParent() != null) {
            return;
         }

         var10000 = this.u;
      }

      com.Wd_2.I(var10000);
   }

   @Override
   public void ancestorMoved(AncestorEvent var1) {
      this.u.N();
      this.u.t();
   }
}





