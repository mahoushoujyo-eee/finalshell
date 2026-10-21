package com.finalshell.core;

public abstract class NV_2 extends N_ implements M3_2, T4_3 {
   @C_9
   public X_3_2 e;
   public static Object D;
   @C_9
   public Object F;
   public static boolean K;
   public static int b;

   public NV_2(com.finalshell.ui.model.I var1) {
      super(var1);
      this.F = D;
   }

   @C_9
   @Override
   public final Object g(F_3_2 var1) throws Throwable {
      return var1.t(this);
   }

   @Override
   public final void d(X_3_2 var1) {
      new C_R(this, var1).U(this);
   }

   public X_3_2 T() {
      String[] var1 = RG_2.C();
      if (!K) {
         if (var1 == null) {
            return this.e;
         }

         if (this.e == null) {
            throw new AssertionError();
         }
      }

      return this.e;
   }

   @C_9
   public X_3_2 u() {
      return this.e;
   }

   @C_9
   @Override
   public NV_2 n() {
      return this;
   }

   @C_9
   public abstract Object i(C_w_2 var1) throws Throwable;

   @C_9
   @Override
   public final Object p(X_2_3 var1) throws Throwable {
      return var1.k(this);
   }

   @C_9
   @Override
   public final Object b(Fo2_2 var1) throws Throwable {
      return var1.q(this);
   }

   public static X_3_2 w(NV_2 var0) {
      return var0.e;
   }

   public static X_3_2 f(NV_2 var0, X_3_2 var1) {
      return var0.e = var1;
   }

   static {
      __vfClinit__();
   }

   public static void g(int var0) {
      b = var0;
   }

   public static int b() {
      return b;
   }

   public static int V() {
      int var0 = b();
      return var0 == 0 ? 31 : 0;
   }

   public static void __vfClinit__() {
      if (b() != 0) {
         g(10);
      }

      K = !RG_2.class.desiredAssertionStatus();
      D = new Fk2_2();
   }
}





