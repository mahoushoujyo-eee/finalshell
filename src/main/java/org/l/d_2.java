package org.l;

import org.T.a;

class d_2 implements a {
   final Class L;

   d_2(Class var1) {
      this.L = var1;
   }

   @Override
   public boolean k(@org.F.c Object var1) {
      boolean var2 = F.G();
      if (var1 != null) {
         boolean var10000 = this.L.isAssignableFrom(var1.getClass());
         if (var2) {
            return var10000;
         }

         if (var10000) {
            return true;
         }
      }

      return false;
   }
}





