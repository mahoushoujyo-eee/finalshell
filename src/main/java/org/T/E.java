package org.T;

public final class E {
   private E() {
   }

   public static boolean Q(Class var0, String var1) {
      return o(var0, var1, false);
   }

   public static boolean o(Class var0, String var1, boolean var2) {
      String var3 = T(var0, var1);
      return var3 != null ? Boolean.parseBoolean(var3) : var2;
   }

   public static int V(Class var0, String var1, int var2) {
      String var3 = T(var0, var1);
      return var3 != null ? Integer.parseInt(var3) : var2;
   }

   @org.F.c
   public static String T(Class var0, String var1) {
      return g(var0, var1, null);
   }

   @org.F.c
   public static String g(Class var0, String var1, @org.F.c String var2) {
      String var3 = System.getProperty(var0.getName() + "." + var1);
      if (var3 != null) {
         return var3;
      } else {
         var3 = System.getProperty(var0.getSimpleName() + "." + var1);
         return var3 != null ? var3 : var2;
      }
   }
}





