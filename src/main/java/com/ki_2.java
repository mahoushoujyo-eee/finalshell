package com;

import java.lang.reflect.Method;
import java.util.Comparator;

public class Ki_2 implements Comparator {
   public int b(Method var1, Method var2) {
      int var10000 = Ph_2.u();
      int var4 = var1.getName().compareTo(var2.getName());
      int var3 = var10000;
      var10000 = var4;
      if (var3 == 0) {
         if (var4 == 0) {
            Class var5 = var1.getReturnType();
            Class var6 = var2.getReturnType();
            byte var8 = var5.equals(var6);
            if (var3 == 0) {
               if (var8 != 0) {
                  return 0;
               }

               var8 = var5.isAssignableFrom(var6);
            }

            if (var3 == 0) {
               if (var8 != 0) {
                  return -1;
               }

               var8 = var6.isAssignableFrom(var5);
            }

            if (var3 == 0) {
               if (var8 != 0) {
                  return 1;
               }

               var8 = 0;
            }

            return var8;
         }

         var10000 = var4;
      }

      return var10000;
   }

   @Override
   public int compare(Object var1, Object var2) {
      return this.b((Method)var1, (Method)var2);
   }
}





