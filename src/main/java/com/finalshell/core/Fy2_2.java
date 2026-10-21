package com.finalshell.core;

public class Fy2_2 implements Rz2_2 {
   final H3_2 a;

   Fy2_2(H3_2 var1) {
      this.a = var1;
   }

   @C_9
   public Void t(RD var1) throws B2_5 {
      H3_2.k(this.a, var1);
      return null;
   }

   @C_9
   public Void K(R1_2 var1) throws B2_5 {
      H3_2.f(this.a, var1);
      return null;
   }

   @C_9
   @Override
   public Object V(R1_2 var1) throws Throwable {
      return this.K(var1);
   }

   @C_9
   @Override
   public Object g(RD var1) throws Throwable {
      return this.t(var1);
   }
}





