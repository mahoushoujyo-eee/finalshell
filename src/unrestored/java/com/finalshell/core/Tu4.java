package com.finalshell.core;

import java.util.Iterator;
import java.util.Set;

public class Tu4 implements BG3 {
   public static Tu4 Q;

   public static Tu4 n() {
      String[] var0 = Lr2.Q();
      Tu4 var10000 = Q;
      if (var0 == null) {
         if (Q == null) {
            Q = new Tu4();
         }

         var10000 = Q;
      }

      return var10000;
   }

   @Override
   public double N(String var1, String var2) {
      String[] var3;
      double var4;
      String var14;
      String[] var10000 = Lr2.Q();
      var4 = 0.0;
      var3 = var10000;
      var14 = var1;
      label94:
      if (var3 == null) {
         if (var1 == null) {
            var14 = var2;
            if (var3 != null) {
               break label94;
            }

            if (var2 == null) {
               return 1.0;
            }
         }

         var14 = var1;
      }

      if (var3 == null) {
         if (var14 == null) {
            return 0.0;
         }

         var14 = var2;
      }

      if (var3 == null) {
         if (var14 == null) {
            return 0.0;
         }

         var14 = var1;
      }

      if (var14.equalsIgnoreCase(var2)) {
         return 1.0;
      } else {
         Set var6 = Lr2.L().P(var1);
         Set var7 = Lr2.L().P(var2);
         Set var15 = var6;
         if (var3 == null) {
            if (var6 == null) {
               return 0.0;
            }

            var15 = var7;
         }

         if (var3 == null) {
            if (var15 == null) {
               return 0.0;
            }

            var15 = var6;
         }

         Iterator var8 = var15.iterator();

         label63:
         while (true) {
            int var16 = (var8.hasNext()) ? 1 : 0;

            label61:
            while (var16 != 0) {
               String var9 = (String)var8.next();

               for (String var11 : var7) {
                  label55: {
                     double var12 = this.D(var9, var11);
                     System.out.println(var9 + "-" + var11 + "-" + KE3.O(var9, var11));
                     double var17 = var4;
                     if (var3 == null) {
                        double var18;
                        var16 = (var18 = var4 - var12) == 0.0 ? 0 : (var18 < 0.0 ? -1 : 1);
                        if (var3 != null) {
                           continue label61;
                        }

                        if (var16 >= 0) {
                           break label55;
                        }

                        var17 = var12;
                     }

                     var4 = var17;
                  }

                  if (var3 != null) {
                     break;
                  }
               }

               if (var3 != null) {
                  return var4;
               }
               continue label63;
            }

            return var4;
         }
      }
   }

   public double D(String var1, String var2) {
      return KE3.O(var1, var2) / KE3.I;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      Q = null;
   }
}





