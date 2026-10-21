package com;

import java.util.List;

class oP_3 extends com.oR_3 {
   final com.cB_3 m;
   final boolean R;
   final com.zn_2 B;

   oP_3(com.zn_2 var1, com.cB_3 var2, boolean var3) {
      this.B = var1;
      this.m = var2;
      this.R = var3;
   }

   @Override
   public void r(com.cB_3 var1, List var2) {
      String[] var3 = com.cB_3.C();
      com.oP_3 var10000 = this;
      if (var3 != null) {
         if (!this.m.H().equals(var1.H())) {
            return;
         }

         this.B.B(this);
         var10000 = this;
      }

      var10000.B.v(this.m, this.R);
   }

   @Override
   public void N(com.cB_3 var1, Throwable var2) {
      String[] var3 = com.cB_3.C();
      com.oP_3 var10000 = this;
      if (var3 != null) {
         if (!this.m.H().equals(var1.H())) {
            return;
         }

         var10000 = this;
      }

      var10000.B.B(this);
   }
}





