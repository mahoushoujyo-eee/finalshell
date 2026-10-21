package com.finalshell.core;

public final class NQ extends NR_2 {
   public final String[] z;
   public final int W;
   @C_9
   public Nt2_2 E;
   @C_9
   public N_ k;

   public NQ(com.finalshell.ui.model.I var1, String[] var2) {
      this(var1, var2, var2.length);
   }

   public NQ(com.finalshell.ui.model.I var1, String[] var2, int var3) {
      super(var1);
      this.z = var2;
      this.W = var3;
   }

   @Override
   public Nt2_2 f() {
      String[] var1 = RG_2.C();
      NQ var10000 = this;
      if (var1 != null) {
         if (this.E != null) {
            return this.E;
         }

         var10000 = this;
      }

      String[] var2 = new String[var10000.W];
      System.arraycopy(this.z, 0, var2, 0, this.W);
      NA_3 var3 = new NA_3(this.Q(), new HV_2[0], var2, null);
      X_3_2 var4 = this.u();
      if (var4 != null) {
         var3.n(var4);
      }

      return this.E = var3;
   }

   @Override
   public String toString() {
      return RG_2.b(this.z, ".", 0, this.W);
   }

   @C_9
   @Override
   public NR_2 v() {
      String[] var1 = RG_2.C();
      NQ var10000 = this;
      if (var1 != null) {
         if (this.k != null) {
            return this.k.v();
         }

         var10000 = this;
      }

      return var10000;
   }

   @C_9
   @Override
   public NV_2 n() {
      String[] var1 = RG_2.C();
      NQ var10000 = this;
      if (var1 != null) {
         if (this.k != null) {
            return this.k.n();
         }

         var10000 = this;
      }

      return var10000;
   }

   @C_9
   @Override
   public Object W(C_4_3 var1) throws Throwable {
      return var1.V(this);
   }
}





