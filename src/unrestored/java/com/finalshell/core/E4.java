package com.finalshell.core;

import com.finalshell.ui.model.IJ;
import com.finalshell.ui.model.Oj4;
import java.util.ArrayList;
import java.util.List;

public class E4 {
   public static String y(String var0, Object[] var1) {
      boolean var2 = I22.X$boolean();
      boolean var10000 = I22.m();
      if (!var2) {
         if (!var10000) {
            return var0;
         }

         if (var2) {
            return var0;
         }

         var10000 = I22.D(var0);
      }

      return var10000 ? I22.A(var0, var1) : var0;
   }

   public static void a(Au2 var0, String var1, Object[] var2) {
      boolean var3 = I22.K$boolean();
      boolean var10000 = I22.m();
      if (var3) {
         if (!var10000) {
            return;
         }

         var10000 = I22.D(var1);
      }

      if (var10000) {
         var0.u(var1, var2);
      }
   }

   public static List j(Oj4 var0) {
      ArrayList var1 = new ArrayList();
      a(var0.N(), var0, var1);
      return var1;
   }

   public static void a(String var0, Oj4 var1, List var2) {
      boolean var10000 = I22.X$boolean();
      var0 = O(var0);
      boolean var3 = var10000;
      List var9 = var1.I();
      if (!var3) {
         if (var9 != null) {
            for (com.finalshell.ui.model.R9 var5 : var1.I()) {
               var2.add(var0 + var5.h());
               if (var3) {
                  return;
               }

               if (var3) {
                  break;
               }
            }
         }

         var9 = var1.j();
      }

      if (!var3) {
         if (var9 == null) {
            return;
         }

         var9 = var1.j();
      }

      for (Oj4 var8 : var9) {
         a(j(var0, var8), var8, var2);
         if (var3) {
            break;
         }
      }
   }

   public static void Z(Oj4 var0, Oj4 var1) {
      w(var0.N(), var0, var1);
   }

   public static void w(String var0, Oj4 var1, Oj4 var2) {
      boolean var3;
      List var12;
      label63: {
         label67: {
            boolean var10000 = I22.X$boolean();
            var0 = O(var0);
            var3 = var10000;
            var12 = var1.I();
            if (!var3) {
               if (var12 != null) {
                  for (com.finalshell.ui.model.R9 var5 : var1.I()) {
                     com.finalshell.ui.model.R9 var6 = var5.M();
                     var6.Z(var0 + var6.h());
                     var2.v(var6);
                     if (var3) {
                        break label67;
                     }

                     if (var3) {
                        break;
                     }
                  }
               }

               var12 = var1.n();
            }

            if (var3) {
               break label63;
            }

            if (var12 != null) {
               for (IJ var10 : var1.n()) {
                  var2.N(var10);
                  if (var3) {
                     return;
                  }

                  if (var3) {
                     break;
                  }
               }
            }
         }

         var12 = var1.j();
      }

      if (!var3) {
         if (var12 == null) {
            return;
         }

         var12 = var1.j();
      }

      for (Oj4 var11 : var12) {
         w(j(var0, var11), var11, var2);
         if (var3) {
            break;
         }
      }
   }

   public static String O(String var0) {
      boolean var1 = I22.K$boolean();
      String var10000 = var0;
      if (var1) {
         if (var0 == null) {
            return "";
         }

         var10000 = var0;
      }

      boolean var2 = var10000.equals("");
      if (var1) {
         if (var2) {
            return "";
         }

         if (!var1) {
            return var0;
         }

         var2 = var0.endsWith(".");
      }

      return !var2 ? var0 + "." : "";
   }

   public static String j(String var0, Oj4 var1) {
      boolean var10000 = I22.K$boolean();
      String var3 = var1.N();
      boolean var2 = var10000;
      StringBuilder var4 = new StringBuilder().append(var0);
      String var10001 = var3;
      if (var2) {
         if (var3 == null) {
            return var4.append("").toString();
         }

         var10001 = var3;
      }

      if (!var2) {
         return var4.append(var10001).toString();
      } else {
         return !var10001.equals("") ? var4.append(var3).toString() : var4.append("").toString();
      }
   }
}





