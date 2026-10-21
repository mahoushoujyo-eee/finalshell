package com;

import java.util.Comparator;

public class Yb_2 implements Comparator {
   public int R(com.ld_4 var1, com.ld_4 var2) {
      byte var10000 = i2_2.K();
      Class var4 = var1.D();
      boolean var3 = (boolean)var10000;
      Class var5 = var2.D();
      var10000 = var4.equals(var5);
      if (var3) {
         if (var10000 != 0) {
            return 0;
         }

         var10000 = var4.isAssignableFrom(var5);
      }

      if (var3) {
         if (var10000 != 0) {
            return 1;
         }

         var10000 = -1;
      }

      return var10000;
   }

   @Override
   public int compare(Object var1, Object var2) {
      return this.R((com.ld_4)var1, (com.ld_4)var2);
   }
}





