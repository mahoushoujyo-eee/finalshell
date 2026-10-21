package org.H;

import org.v.R1;
import org.v.RB;
import org.v.RD;
import org.v.Rz_2;

class A implements Rz_2 {
   final org.H.Cs_2 Q;

   A(org.H.Cs_2 var1) {
      this.Q = var1;
   }

   @org.F.c
   public RB t(RD var1) throws org.b_2 {
      return this.Q.O(var1);
   }

   @org.F.c
   public RB q(R1 var1) throws org.b_2 {
      return this.Q.h(var1);
   }

   @org.F.c
   @Override
   public Object V(R1 var1) throws Throwable {
      return this.q(var1);
   }

   @org.F.c
   @Override
   public Object g(RD var1) throws Throwable {
      return this.t(var1);
   }
}





