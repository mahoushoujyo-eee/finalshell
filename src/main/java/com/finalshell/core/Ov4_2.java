package com.finalshell.core;

import java.util.Collection;

public class Ov4_2 {
   public static boolean i(String var0) {
      int var1 = D5.K();
      String var10000 = var0;
      if (var1 != 0) {
         if (var0 == null) {
            return true;
         }

         var10000 = var0.trim();
      }

      boolean var2 = var10000.equals("");
      return var1 == 0 ? var2 : var2;
   }

   public static boolean G(Object[] var0) {
      int var1 = D5.K();
      Object[] var10000 = var0;
      if (var1 != 0) {
         if (var0 == null) {
            return 1 != 0;
         }

         var10000 = var0;
      }

      int var2 = var10000.length;
      if (var1 == 0) {
         return var2 != 0;
      } else {
         return (boolean)((var2 != 0 ? 0 : 1) != 0);
      }
   }

   public static boolean l(Collection var0) {
      int var1 = D5.K();
      Collection var10000 = var0;
      if (var1 != 0) {
         if (var0 == null) {
            return 1 != 0;
         }

         var10000 = var0;
      }

      int var2 = var10000.size();
      if (var1 == 0) {
         return var2 != 0;
      } else {
         return (boolean)((var2 != 0 ? 0 : 1) != 0);
      }
   }

   public static boolean m(Collection[] var0) {
      int var10000 = D5.e();
      Collection[] var2 = var0;
      int var1 = var10000;
      int var3 = var0.length;
      int var4 = 0;

      while (true) {
         if (var4 < var3) {
            Collection var5 = var2[var4];
            if (var1 == 0) {
               var6 = l(var5);
               if (var1 != 0) {
                  break;
               }

               if (!var6) {
                  return false;
               }

               var4++;
            }

            if (var1 == 0) {
               continue;
            }
         }

         var6 = true;
         break;
      }

      return var6;
   }

   public static boolean j(String[] var0) {
      String[] var2 = var0;
      int var3 = var0.length;
      int var10000 = D5.e();
      int var4 = 0;
      int var1 = var10000;

      while (true) {
         if (var4 < var3) {
            String var5 = var2[var4];
            if (var1 == 0) {
               var6 = i(var5);
               if (var1 != 0) {
                  break;
               }

               if (!var6) {
                  return false;
               }

               var4++;
            }

            if (var1 == 0) {
               continue;
            }
         }

         var6 = true;
         break;
      }

      return var6;
   }

   public static boolean y(Collection[] var0) {
      int var10000 = D5.K();
      Collection[] var2 = var0;
      int var1 = var10000;
      int var3 = var0.length;
      int var4 = 0;

      while (true) {
         if (var4 < var3) {
            Collection var5 = var2[var4];
            if (var1 != 0) {
               var6 = l(var5);
               if (var1 == 0) {
                  break;
               }

               if (var6) {
                  return true;
               }

               var4++;
            }

            if (var1 != 0) {
               continue;
            }
         }

         var6 = false;
         break;
      }

      return var6;
   }

   public static boolean l(String[] var0) {
      int var10000 = D5.e();
      String[] var2 = var0;
      int var3 = var0.length;
      int var1 = var10000;
      int var4 = 0;

      while (true) {
         if (var4 < var3) {
            String var5 = var2[var4];
            if (var1 == 0) {
               var6 = i(var5);
               if (var1 != 0) {
                  break;
               }

               if (var6) {
                  return true;
               }

               var4++;
            }

            if (var1 == 0) {
               continue;
            }
         }

         var6 = false;
         break;
      }

      return var6;
   }
}





