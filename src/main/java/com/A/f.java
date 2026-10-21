package com.A;

class f extends com.c4_2 {
   final com.A.E J;

   f(com.A.E var1, boolean var2) {
      super(var2);
      this.J = var1;
   }

   @Override
   public boolean z() {
      int[] var1 = com.A.y_2.M();
      boolean var10000 = this.J.isShowing();
      if (var1 != null) {
         if (!var10000) {
            return false;
         }

         var10000 = this.J.U;
      }

      return var1 == null ? var10000 : var10000;
   }

   @Override
   public void f(boolean var1) {
      int[] var2 = com.A.y_2.M();
      boolean var10000 = this.J.U;
      if (var2 != null) {
         if (!this.J.U) {
            return;
         }

         var10000 = this.J.isShowing();
      }

      if (var2 != null) {
         if (!var10000) {
            return;
         }

         var10000 = var1;
      }

      if (!var10000) {
         this.J.dispose();
      }
   }
}





