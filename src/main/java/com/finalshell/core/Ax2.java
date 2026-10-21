package com.finalshell.core;

import java.util.Iterator;
import java.util.List;

public final class Ax2 {
   public static boolean Z(Object var0, Object[] var1) {
      String var2 = FV_2.D();
      Object[] var10000 = var1;
      if (var2 == null) {
         if (var1 == null) {
            return 0 != 0;
         }

         var10000 = var1;
      }

      int var7 = var10000.length;
      if (var2 != null) {
         return var7 != 0;
      } else {
         if (var7 > 0) {
            Object[] var3 = var1;
            int var4 = var1.length;
            int var5 = 0;

            while (var5 < var4) {
               Object var6 = var3[var5];
               if (var2 == null) {
                  boolean var8 = U(var0, var6);
                  if (var2 != null) {
                     return var8;
                  }

                  if (var8) {
                     return true;
                  }

                  var5++;
               }

               if (var2 != null) {
                  break;
               }
            }
         }

         return 0 != 0;
      }
   }

   public static boolean U(Object var0, Object var1) {
      String var2;
      Object var10000;
      var2 = FV_2.D();
      var10000 = var0;
      label42:
      if (var2 == null) {
         if (var0 == null) {
            var10000 = var1;
            if (var2 != null) {
               break label42;
            }

            if (var1 == null) {
               return true;
            }
         }

         var10000 = var0;
      }

      if (var2 == null) {
         if (var10000 == null) {
            return false;
         }

         var10000 = var1;
      }

      if (var2 == null) {
         if (var10000 == null) {
            return false;
         }

         var10000 = var0;
      }

      boolean var3 = var10000.equals(var1);
      return var2 != null ? var3 : var3;
   }

   public static boolean f(String var0, List var1) {
      String var10000 = FV_2.D();
      Iterator var3 = var1.iterator();
      String var2 = var10000;

      while (true) {
         if (var3.hasNext()) {
            String var4 = (String)var3.next();
            var5 = var0.contains(var4);
            if (var2 != null) {
               break;
            }

            if (var2 != null) {
               return var5;
            }

            if (var5) {
               return true;
            }

            if (var2 == null) {
               continue;
            }
         }

         var5 = false;
         break;
      }

      return var5;
   }
}





