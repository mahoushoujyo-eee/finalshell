package com;

import java.util.Comparator;

public class Es_2 implements Comparator {
   public int u(com.lS_3 var1, com.lS_3 var2) {
      boolean var3 = com.Oj_2.g();
      int var10000 = var1.H();
      int var10001 = var2.H();
      if (var3) {
         if (var10000 < var10001) {
            return -1;
         }

         var10000 = var1.H();
         if (!var3) {
            return var10000;
         }

         var10001 = var2.H();
      }

      return var10000 > var10001 ? 1 : 0;
   }

   @Override
   public int compare(Object var1, Object var2) {
      return this.u((com.lS_3)var1, (com.lS_3)var2);
   }
}





