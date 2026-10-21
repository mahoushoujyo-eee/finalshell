package org.H;

import org.v.NV;
import org.v.RS;
import org.v.f_3;
import org.v.hV;
import org.v.t_4;

class C8 implements f_3 {
   final org.H.Cs_2 B;

   C8(org.H.Cs_2 var1) {
      this.B = var1;
   }

   public t_4 f(NV var1) throws org.b_2 {
      return this.B.E(var1);
   }

   public t_4 k(RS var1) throws org.b_2 {
      return this.B.T(var1);
   }

   public t_4 y(hV var1) throws org.b_2 {
      return this.B.R(var1);
   }

   @Override
   public Object C(RS var1) throws Throwable {
      return this.k(var1);
   }

   @Override
   public Object G(hV var1) throws Throwable {
      return this.y(var1);
   }

   @Override
   public Object t(NV var1) throws Throwable {
      return this.f(var1);
   }
}





