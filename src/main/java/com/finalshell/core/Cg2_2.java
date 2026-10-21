package com.finalshell.core;

public class Cg2_2 implements FY_2 {
   final Cs2_2 v;

   Cg2_2(Cs2_2 var1) {
      this.v = var1;
   }

   public RQ m(Rf2_2 var1) throws B2_5 {
      return this.v.d(var1);
   }

   public RQ y(R32_2 var1) throws B2_5 {
      return this.v.G(var1);
   }

   @Override
   public Object S(R32_2 var1) throws Throwable {
      return this.y(var1);
   }

   @Override
   public Object K(Rf2_2 var1) throws Throwable {
      return this.m(var1);
   }
}





