package com;

import java.io.File;
import java.util.List;

class EH extends EY {
   final u2 r;

   EH(u2 var1) {
      this.r = var1;
   }

   @Override
   public boolean A() {
      return this.r.i;
   }

   @Override
   public boolean d(List var1) {
      String[] var2 = com.cB_3.C();
      int var10000 = var1.size();
      if (var2 != null) {
         if (var10000 > 0) {
            this.r.q((File)var1.get(0), true);
            return true;
         }

         var10000 = 0;
      }

      return (boolean)var10000;
   }
}





