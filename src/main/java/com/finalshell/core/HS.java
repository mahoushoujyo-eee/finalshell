package com.finalshell.core;

public class HS implements Fo2_2 {
   final Q4_3 d;
   final M3_2 t;
   final H3_2 w;

   HS(H3_2 var1, Q4_3 var2, M3_2 var3) {
      this.w = var1;
      this.d = var2;
      this.t = var3;
   }

   @C_9
   public Void U(NJ_3 var1) throws B2_5 {
      H3_2.e(this.w, var1, this.d);
      return null;
   }

   @C_9
   public Void W(NV_2 var1) throws B2_5 {
      H3_2.h(this.w, this.t, H3_2.X(this.w, var1), this.d, this.w.w(var1));
      return null;
   }

   @C_9
   @Override
   public Object q(NV_2 var1) throws Throwable {
      return this.W(var1);
   }

   @C_9
   @Override
   public Object u(NJ_3 var1) throws Throwable {
      return this.U(var1);
   }
}





