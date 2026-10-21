package com.finalshell.core;

public class CP3 extends C42 {
   public final Yp2 g;

   public CP3(Yp2 var1) {
      this.g = var1;
   }

   @Override
   public boolean z() {
      int var1 = Yp2.T();
      boolean var10000 = this.g.J;
      if (var1 != 0) {
         if (this.g.J) {
            return false;
         }

         var10000 = this.g.s;
      }

      return var1 == 0 ? var10000 : var10000;
   }

   @Override
   public void f(boolean var1) {
      this.g.G = var1;
      this.g.l();
   }
}





