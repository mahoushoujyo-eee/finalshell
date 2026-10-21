package org.v;

import org.I;

public abstract class NV extends N_ implements org.v.M, t_4 {
   @org.F.c
   private x_3 e;
   static final Object D;
   @org.F.c
   Object F;
   static final boolean K;
   private static int b;

   protected NV(I var1) {
      super(var1);
      this.F = D;
   }

   @org.F.c
   @Override
   public final Object g(f_3 var1) throws Throwable {
      return var1.t(this);
   }

   @Override
   public final void d(x_3 var1) {
      new _R(this, var1).U(this);
   }

   public x_3 T() {
      String[] var1 = RG.C();
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

   @org.F.c
   public x_3 u() {
      return this.e;
   }

   @org.F.c
   @Override
   public NV n() {
      return this;
   }

   @org.F.c
   public abstract Object i(_w_2 var1) throws Throwable;

   @org.F.c
   @Override
   public final Object p(X_2 var1) throws Throwable {
      return var1.k(this);
   }

   @org.F.c
   @Override
   public final Object b(fo_2 var1) throws Throwable {
      return var1.q(this);
   }

   static x_3 w(NV var0) {
      return var0.e;
   }

   static x_3 f(NV var0, x_3 var1) {
      return var0.e = var1;
   }

   static {
      if (b() != 0) {
         g(10);
      }

      K = !RG.class.desiredAssertionStatus();
      D = new fk_2();
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
}





