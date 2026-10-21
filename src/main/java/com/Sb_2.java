package com;

import java.util.List;

class Sb_2 extends ST {
   final com.cB_3 d;
   final S5 r;
   final List K;
   final boolean z;
   final boolean Q;
   final us_2 q;

   Sb_2(us_2 var1, com.cB_3 var2, S5 var3, List var4, boolean var5, boolean var6) {
      this.q = var1;
      this.d = var2;
      this.r = var3;
      this.K = var4;
      this.z = var5;
      this.Q = var6;
   }

   @Override
   public void y(com.cB_3 var1, List var2) {
      String[] var3 = com.cB_3.C();
      if (var3 != null) {
         if (!var1.H().equals(this.d.H())) {
            return;
         }

         this.q.C(this);
      }

      Sb_2 var10000 = this;
      if (var3 != null) {
         if (this.r != null) {
            this.r.T(this.d);
         }

         var10000 = this;
      }

      com.cB_3 var4 = var10000.q.A((String)this.K.get(0));
      this.K.remove(0);
      if (var3 != null) {
         if (var4 != null) {
            this.q.k(var4, this.K, this.z, this.Q, this.r);
            if (var3 != null) {
               return;
            }
         }

         this.q.r(this.d, this.z, this.Q);
      }

      S5 var5 = this.r;
      if (var3 != null) {
         if (this.r == null) {
            return;
         }

         var5 = this.r;
      }

      var5.K(this.d);
   }

   @Override
   public void X(com.cB_3 var1, Throwable var2) {
      String[] var3 = com.cB_3.C();
      if (var3 != null) {
         if (!var1.H().equals(this.d.H())) {
            return;
         }

         this.q.C(this);
         this.q.r(this.d, this.z, this.Q);
      }

      S5 var10000 = this.r;
      if (var3 != null) {
         if (this.r == null) {
            return;
         }

         var10000 = this.r;
      }

      var10000.K(this.d);
   }
}





