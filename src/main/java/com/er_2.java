package com;

import java.io.File;
import java.util.List;

class Er_2 extends EY {
   final com.kD_3 T;

   Er_2(com.kD_3 var1) {
      this.T = var1;
   }

   @Override
   public boolean d(List var1) {
      int[] var2 = com.kD_3.u();
      List var10000 = var1;
      if (var2 == null) {
         if (var1 == null) {
            return false;
         }

         var10000 = var1;
      }

      for (File var4 : var10000) {
         boolean var5 = Xg_2.P(var4.getName());
         if (var2 != null) {
            return var5;
         }

         if (var2 != null) {
            return var5;
         }

         if (var5) {
            this.T.v(var4);
            return true;
         }

         if (var2 != null) {
            break;
         }
      }

      return false;
   }
}





