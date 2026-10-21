package org.x;

import java.util.Comparator;

class l implements Comparator {
   static final boolean d = !org.x.O.class.desiredAssertionStatus();

   @Override
   public int compare(@org.F.c Object var1, @org.F.c Object var2) {
      String var3 = org.x.O.f();
      int var10000 = d;
      if (var3 != null) {
         if (!d && var1 == null) {
            throw new AssertionError();
         }

         var10000 = d;
      }

      if (var3 != null) {
         label30: {
            if (var10000 == 0) {
               var4 = var2;
               if (var3 == null) {
                  break label30;
               }

               if (var2 == null) {
                  throw new AssertionError();
               }
            }

            var4 = var2;
         }

         var10000 = ((V)var4).F - ((V)var1).F;
      }

      if (com.ky_4.F() != null) {
         org.x.O.s("PwyoAb");
      }

      return var10000;
   }
}





