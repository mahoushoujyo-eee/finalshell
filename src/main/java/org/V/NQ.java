package org.v;

import org.I;

public final class NQ extends NR {
   public final String[] z;
   public final int W;
   @org.F.c
   private Nt_2 E;
   @org.F.c
   N_ k;

   public NQ(I var1, String[] var2) {
      this(var1, var2, var2.length);
   }

   public NQ(I var1, String[] var2, int var3) {
      super(var1);
      this.z = var2;
      this.W = var3;
   }

   @Override
   public Nt_2 f() {
      String[] var1 = RG.C();
      NQ var10000 = this;
      if (var1 != null) {
         if (this.E != null) {
            return this.E;
         }

         var10000 = this;
      }

      String[] var2 = new String[var10000.W];
      System.arraycopy(this.z, 0, var2, 0, this.W);
      NA var3 = new NA(this.Q(), new hV[0], var2, null);
      x_3 var4 = this.u();
      if (var4 != null) {
         var3.n(var4);
      }

      return this.E = var3;
   }

   @Override
   public String toString() {
      return RG.b(this.z, ".", 0, this.W);
   }

   @org.F.c
   @Override
   public NR v() {
      String[] var1 = RG.C();
      NQ var10000 = this;
      if (var1 != null) {
         if (this.k != null) {
            return this.k.v();
         }

         var10000 = this;
      }

      return var10000;
   }

   @org.F.c
   @Override
   public NV n() {
      String[] var1 = RG.C();
      NQ var10000 = this;
      if (var1 != null) {
         if (this.k != null) {
            return this.k.n();
         }

         var10000 = this;
      }

      return var10000;
   }

   @org.F.c
   @Override
   public Object W(_4 var1) throws Throwable {
      return var1.V(this);
   }
}





