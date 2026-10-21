package com;

import java.awt.Component;
import java.awt.Window;
import java.util.ArrayList;
import java.util.List;

public class iK_3 {
   private static int C;

   public static List O(String var0, Component var1) {
      List var3;
      label21: {
         int var10000 = o();
         var3 = com.FN.C(var0, var1);
         int var2 = var10000;
         List var4 = var3;
         if (var2 == 0) {
            if (var3.size() <= 0) {
               break label21;
            }

            var4 = var3;
         }

         V(var4, var1);
         if (var2 == 0) {
            return var3;
         }

         com.ky_4.K(new String[1]);
      }

      o(var1);
      return var3;
   }

   public static void A(Component var0) {
      A(var0, null);
   }

   public static void A(Component var0, Component var1) {
      int var2 = o();
      Component var10000 = var0;
      if (var2 == 0) {
         if (var0 == null) {
            return;
         }

         var10000 = var0;
      }

      com.Qm_2 var3 = com.oK_3.P(com.FN.L(var10000));
      com.Qm_2 var4 = var3;
      if (var2 == 0) {
         if (var3 == null) {
            return;
         }

         var3.w();
         var4 = var3;
      }

      Object var10001 = var1;
      if (var2 == 0) {
         var10001 = var1 != null ? var1 : var3;
      }

      var4.a((Component)var10001);
      var3.M(new Component[]{var0});
   }

   public static void E(List var0) {
      V(var0, null);
   }

   public static void V(List var0, Component var1) {
      int var2 = Q();
      List var10000 = var0;
      if (var2 != 0) {
         if (var0 == null) {
            return;
         }

         var10000 = var0;
      }

      if (var10000.size() > 0) {
         ArrayList var3 = new ArrayList();

         for (Component var5 : var0) {
            com.Qm_2 var6 = com.oK_3.P(com.FN.L(var5));
            if (var6 != null) {
               if (!var3.contains(var6.g())) {
                  Object var10001 = var1;
                  if (var2 != 0) {
                     var10001 = var1 != null ? var1 : var6;
                  }

                  var6.a((Component)var10001);
                  var6.w();
                  var3.add(var6.g());
               }

               var6.M(new Component[]{var5});
            }

            if (var2 == 0) {
               break;
            }
         }
      }
   }

   public static void I(Component var0) {
      int var1 = Q();
      Component var10000 = var0;
      if (var1 != 0) {
         if (var0 == null) {
            return;
         }

         var10000 = var0;
      }

      com.Qm_2 var2 = com.oK_3.P(com.FN.L(var10000));
      com.Qm_2 var3 = var2;
      if (var1 != 0) {
         if (var2 == null) {
            return;
         }

         var3 = var2;
      }

      var3.C(new Component[]{var0});
   }

   public static void A(List var0) {
      int var1 = o();
      List var10000 = var0;
      if (var1 == 0) {
         if (var0 == null) {
            return;
         }

         var10000 = var0;
      }

      if (var1 == 0) {
         if (var10000.size() <= 0) {
            return;
         }

         var10000 = var0;
      }

      for (Component var3 : var10000) {
         label26: {
            com.Qm_2 var4 = com.oK_3.P(com.FN.L(var3));
            com.Qm_2 var5 = var4;
            if (var1 == 0) {
               if (var4 == null) {
                  break label26;
               }

               var5 = var4;
            }

            var5.C(new Component[]{var3});
         }

         if (var1 != 0) {
            break;
         }
      }
   }

   public static void o(Component var0) {
      x(com.FN.L(var0));
   }

   public static void x(Window var0) {
      int var10000 = Q();
      com.Qm_2 var2 = com.oK_3.P(var0);
      int var1 = var10000;
      com.Qm_2 var3 = var2;
      if (var1 != 0) {
         if (var2 == null) {
            return;
         }

         var3 = var2;
      }

      var3.w();
   }

   public static void J(Component var0) {
      c(com.FN.L(var0), var0);
   }

   public static void c(Window var0, Component var1) {
      int var2;
      label17: {
         int var10000 = o();
         com.Qm_2 var3 = com.oK_3.P(var0);
         var2 = var10000;
         com.Qm_2 var5 = var3;
         if (var2 == 0) {
            if (var3 == null) {
               break label17;
            }

            var5 = var3;
         }

         var5.a(var1);
      }

      if (com.ky_4.F() != null) {
         U(++var2);
      }
   }

   public static void U(int var0) {
      C = var0;
   }

   public static int Q() {
      return C;
   }

   public static int o() {
      int var0 = Q();
      return var0 == 0 ? 72 : 0;
   }

   static {
      if (o() != 0) {
         U(70);
      }
   }
}





