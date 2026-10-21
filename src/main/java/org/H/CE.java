package org.H;

import org.v.NT;
import org.v.RF;
import org.v._8;
import org.v.e_4;

class CE implements e_4 {
   final org.H.Cs_2 j;

   CE(org.H.Cs_2 var1) {
      this.j = var1;
   }

   public _8 S(NT var1) throws org.b_2 {
      return this.j.z(var1);
   }

   public _8 C(RF var1) throws org.b_2 {
      return this.j.W(var1);
   }

   @Override
   public Object q(RF var1) throws Throwable {
      return this.C(var1);
   }

   @Override
   public Object W(NT var1) throws Throwable {
      return this.S(var1);
   }
}





