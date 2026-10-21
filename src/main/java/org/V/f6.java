package org.v;

public final class f6 {
   private static int H;

   private f6() {
   }

   public static void m(int var0) {
      H = var0;
   }

   public static int k() {
      return H;
   }

   public static int P() {
      int var0 = k();
      return var0 == 0 ? 31 : 0;
   }

   static {
      if (k() == 0) {
         m(54);
      }
   }
}





