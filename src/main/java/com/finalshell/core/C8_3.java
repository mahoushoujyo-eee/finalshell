package com.finalshell.core;

public class C8_3 implements F_3_2 {
   public final Cs2_2 B;

   public C8_3(Cs2_2 var1) {
      this.B = var1;
   }

   public T4_3 f(NV_2 var1) throws B2_5 {
      return this.B.E(var1);
   }

   public T4_3 k(RS_2 var1) throws B2_5 {
      return this.B.T(var1);
   }

   public T4_3 y(HV_2 var1) throws B2_5 {
      return this.B.R(var1);
   }

   @Override
   public Object C(RS_2 var1) throws Throwable {
      return this.k(var1);
   }

   @Override
   public Object G(HV_2 var1) throws Throwable {
      return this.y(var1);
   }

   @Override
   public Object t(NV_2 var1) throws Throwable {
      return this.f(var1);
   }
}





