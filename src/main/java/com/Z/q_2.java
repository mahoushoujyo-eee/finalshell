package com.Z;

import com.EY;
import java.io.File;
import java.util.List;

public class q_2 extends EY {
   protected d_2 p;
   final com.Z.T k;

   public q_2(com.Z.T var1, d_2 var2) {
      this.k = var1;
      this.p = var2;
   }

   @Override
   public boolean d(List var1) {
      String var2 = com.Z.T.v();
      int var10000 = var1.size();
      if (var2 == null) {
         if (var10000 > 0) {
            File var3 = (File)var1.get(0);
            if (var2 == null) {
               if (var1.size() == 1 && com.Cz_2.z(var3)) {
                  this.k.M(var3, this.p);
                  if (var2 == null) {
                     return true;
                  }
               }

               this.k.M(var3.getParentFile(), this.p);
            }

            this.k.S(var1);
            return true;
         }

         var10000 = 0;
      }

      return (boolean)var10000;
   }
}





