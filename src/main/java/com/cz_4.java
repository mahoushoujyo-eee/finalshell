package com;

class cz_4 extends com.c4_2 {
   final com.Y9 F;

   cz_4(com.Y9 var1) {
      this.F = var1;
   }

   @Override
   public boolean z() {
      String var1 = SZ.L();
      boolean var10000 = com.Y9.D(this.F);
      if (var1 == null) {
         if (!var10000) {
            return false;
         }

         var10000 = com.Y9.O(this.F);
      }

      return var1 != null ? var10000 : var10000;
   }

   @Override
   public void f(boolean var1) {
      com.Y9.b(this.F, var1);
      com.Y9.i(this.F).repaint();
   }
}





