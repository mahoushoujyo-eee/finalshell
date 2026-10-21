package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;

public class Fr2 {
   public int C;
   public int N;
   public int R;
   public int c;
   public int q;
   public int O;
   public boolean z = false;
   public int U;

   public float m() {
      Ky4[] var1;
      int var2;
      label23: {
         Ky4[] var10000 = Qm2.J();
         var2 = this.R() - this.o();
         var1 = var10000;
         int var4 = var2;
         if (var1 != null) {
            if (var2 >= 0) {
               break label23;
            }

            var4 = 0;
         }

         var2 = var4;
      }

      float var3 = 0.0F;
      int var5 = this.R();
      if (var1 != null) {
         if (var5 <= 0) {
            return var3;
         }

         var5 = var2;
      }

      return (float)var5 / (float)this.R();
   }

   public float y$float() {
      Ky4[] var10000 = Qm2.J();
      float var2 = 0.0F;
      Ky4[] var1 = var10000;
      int var3 = this.Q();
      if (var1 != null) {
         if (var3 <= 0) {
            return var2;
         }

         var3 = this.u();
      }

      return (float)var3 / (float)this.Q();
   }

   public void h(int var1) {
      this.U += var1;
   }

   public void A(int var1) {
      this.R++;
      this.C += var1;
   }

   public void q(int var1) {
      this.N += var1;
   }

   public int R() {
      return this.C;
   }

   public int y$int() {
      return this.R;
   }

   public int o() {
      return this.c;
   }

   public void C(int var1) {
      if (var1 > this.c) {
         this.c = var1;
      }
   }

   public int G() {
      return this.q;
   }

   public void H(int var1) {
      this.q = var1;
   }

   public int z() {
      return this.O;
   }

   public void g(int var1) {
      this.O = var1;
      this.z = true;
   }

   public boolean x() {
      return this.z;
   }

   public int u() {
      return this.U;
   }

   public void c(int var1) {
      this.U = var1;
   }

   public int Q() {
      return this.N;
   }

   public void D(int var1) {
      this.N = var1;
   }
}





