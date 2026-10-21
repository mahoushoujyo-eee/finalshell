package com.finalshell.core;

public class Pd2 implements WX_2 {
   @Override
   public String g(Object var1, String var2, Object var3) {
      String var4 = Nv4.o();
      String var10000 = var2;
      if (var4 != null) {
         label20:
         if (var2 != null) {
            var10000 = var2;
            if (var4 != null) {
               if (var2.length() == 0) {
                  break label20;
               }

               var10000 = var2;
            }

            char[] var5 = var10000.toCharArray();
            var5[0] = Character.toUpperCase(var5[0]);
            return new String(var5);
         }

         var10000 = var2;
      }

      return var10000;
   }
}





