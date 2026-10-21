package com.finalshell.core;

public class Y3_3 implements FY_2 {
   public final FF_2 Q;
   public static long a;

   public Y3_3(FF_2 var1) {
      this.Q = var1;
   }

   @C_9
   public Void S(Rf2_2 var1) {
      FF_2.B(this.Q, var1.b);
      this.Q.A(var1.C);
      this.Q.t.print((char)((int)a));
      FF_2.c(this.Q, var1.p);
      return null;
   }

   @C_9
   public Void q(R32_2 var1) {
      this.Q.G(var1.S);
      return null;
   }

   @C_9
   @Override
   public Object S(R32_2 var1) throws Throwable {
      return this.q(var1);
   }

   @C_9
   @Override
   public Object K(Rf2_2 var1) throws Throwable {
      return this.S(var1);
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      long var0 = 475500105005849965L;
      long var10002 = -3445473164119188147L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





