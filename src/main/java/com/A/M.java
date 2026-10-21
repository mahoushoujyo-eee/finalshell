package com.A;

class M extends com.c4_2 {
   final C Y;

   M(C var1, boolean var2) {
      super(var2);
      this.Y = var1;
   }

   @Override
   public boolean z() {
      return this.Y.N;
   }

   @Override
   public void f(boolean var1) {
      int[] var2 = com.A.y_2.M();
      boolean var10000 = this.Y.N;
      if (var2 != null) {
         if (!this.Y.N) {
            return;
         }

         var10000 = this.Y.isShowing();
      }

      if (var2 != null) {
         if (!var10000) {
            return;
         }

         var10000 = var1;
      }

      if (!var10000) {
         this.Y.setVisible(false);
      }
   }
}





