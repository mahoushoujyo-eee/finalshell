package org;

public class b_2 extends d_2 {
   private static String[] u;

   public b_2(String var1, @org.F.c I var2) {
      super(var1, var2);
   }

   public b_2(String var1, @org.F.c I var2, Throwable var3) {
      super(var1, var2, var3);
   }

   public static void Q(String[] var0) {
      u = var0;
   }

   public static String[] d() {
      return u;
   }

   static {
      if (d() != null) {
         Q(new String[3]);
      }
   }
}





