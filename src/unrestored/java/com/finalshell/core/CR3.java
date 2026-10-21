package com.finalshell.core;

public class CR3 extends C42 {
   public final Y_ Z;

   public CR3(Y_ var1) {
      this.Z = var1;
   }

   @Override
   public boolean z() {
      int var1 = Yp2.f();
      boolean var10000 = this.Z.N;
      if (var1 == 0) {
         if (this.Z.N) {
            return false;
         }

         var10000 = this.Z.E;
      }

      return var1 != 0 ? var10000 : var10000;
   }

   @Override
   public void f(boolean var1) {
      this.Z.i = var1;
      this.Z.l();
   }
}





