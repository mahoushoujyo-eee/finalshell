package com.finalshell.core;

public final class E_5 {
   public static boolean Q(java.lang.Class var0, String var1) {
      return o(var0, var1, false);
   }

   public static boolean o(java.lang.Class var0, String var1, boolean var2) {
      String var3 = T(var0, var1);
      return var3 != null ? Boolean.parseBoolean(var3) : var2;
   }

   public static int V(java.lang.Class var0, String var1, int var2) {
      String var3 = T(var0, var1);
      return var3 != null ? Integer.parseInt(var3) : var2;
   }

   @C_9
   public static String T(java.lang.Class var0, String var1) {
      return g(var0, var1, null);
   }

   @C_9
   public static String g(java.lang.Class var0, String var1, @C_9 String var2) {
      String var3 = System.getProperty(var0.getName() + "." + var1);
      if (var3 != null) {
         return var3;
      } else {
         var3 = System.getProperty(var0.getSimpleName() + "." + var1);
         return var3 != null ? var3 : var2;
      }
   }
}





