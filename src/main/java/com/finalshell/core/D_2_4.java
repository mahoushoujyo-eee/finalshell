package com.finalshell.core;

public class D_2_4 implements A_4 {
   final java.lang.Class L;

   D_2_4(java.lang.Class var1) {
      this.L = var1;
   }

   @Override
   public boolean k(@C_9 Object var1) {
      boolean var2 = F3_3.G();
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





