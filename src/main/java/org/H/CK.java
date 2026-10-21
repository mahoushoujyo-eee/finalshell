package org.H;

import org.v.NV;
import org.v.RS;
import org.v.f_3;
import org.v.hV;

class CK implements f_3 {
   final org.H.k_2 S;

   CK(org.H.k_2 var1) {
      this.S = var1;
   }

   @org.F.c
   public Void A(NV var1) throws Throwable {
      var1.i(org.H.k_2.x(this.S));
      return null;
   }

   @org.F.c
   public Void n(RS var1) throws Throwable {
      org.H.k_2.B(this.S).y(var1);
      return null;
   }

   @org.F.c
   public Void a(hV var1) throws Throwable {
      org.H.k_2.B(this.S).i(var1);
      return null;
   }

   @org.F.c
   @Override
   public Object C(RS var1) throws Throwable {
      return this.n(var1);
   }

   @org.F.c
   @Override
   public Object G(hV var1) throws Throwable {
      return this.a(var1);
   }

   @org.F.c
   @Override
   public Object t(NV var1) throws Throwable {
      return this.A(var1);
   }
}





