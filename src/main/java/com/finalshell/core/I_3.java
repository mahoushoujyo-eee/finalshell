package com.finalshell.core;

public class I_3 implements C_e_2_2 {
   final Cs2_2 q;

   I_3(Cs2_2 var1) {
      this.q = var1;
   }

   public HV_2 m(RA var1) throws B2_5 {
      return this.q.t(var1);
   }

   public HV_2 p(Rg2 var1) throws B2_5 {
      return this.q.c(var1);
   }

   public HV_2 g(RH_2 var1) throws B2_5 {
      return this.q.H(var1);
   }

   @Override
   public Object b(RH_2 var1) throws Throwable {
      return this.g(var1);
   }

   @Override
   public Object a(Rg2 var1) throws Throwable {
      return this.p(var1);
   }

   @Override
   public Object z(RA var1) throws Throwable {
      return this.m(var1);
   }
}





