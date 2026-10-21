package org.H;

import org.v.RA;
import org.v.RH;
import org.v.Rg_2;
import org.v._e_2;
import org.v.hV;

class I implements _e_2 {
   final org.H.Cs_2 q;

   I(org.H.Cs_2 var1) {
      this.q = var1;
   }

   public hV m(RA var1) throws org.b_2 {
      return this.q.t(var1);
   }

   public hV p(Rg_2 var1) throws org.b_2 {
      return this.q.c(var1);
   }

   public hV g(RH var1) throws org.b_2 {
      return this.q.H(var1);
   }

   @Override
   public Object b(RH var1) throws Throwable {
      return this.g(var1);
   }

   @Override
   public Object a(Rg_2 var1) throws Throwable {
      return this.p(var1);
   }

   @Override
   public Object z(RA var1) throws Throwable {
      return this.m(var1);
   }
}





