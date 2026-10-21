package com;

import java.awt.Window;

class RZ extends Rt_2 {
   final com.Ds_2 U;

   RZ(com.Ds_2 var1, Window var2, Window var3) {
      super(var2, var3);
      this.U = var1;
   }

   @Override
   public boolean P() {
      int[] var1 = com.Ds_2.U();
      boolean var10000 = this.U.r;
      if (var1 == null) {
         var10000 = !this.U.r;
      }

      return var10000;
   }
}





