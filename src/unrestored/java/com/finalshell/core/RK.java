package com.finalshell.core;

public abstract class RK implements HV_2 {
   public final Nt2_2 A;

   public RK(Nt2_2 var1) {
      this.A = var1;
   }

   @Override
   public void d(X_3_2 var1) {
      this.A.n(var1);
   }

   @Override
   public com.finalshell.ui.model.I Q() {
      return this.A.Q();
   }

   @C_9
   @Override
   public final Object g(F_3_2 var1) throws Throwable {
      return var1.G(this);
   }

   @C_9
   @Override
   public final Object i(Hj2 var1) throws Throwable {
      return this.q(var1);
   }

   @Override
   public void M(String var1) throws B2_5 {
      throw new B2_5(var1, this.Q());
   }
}





