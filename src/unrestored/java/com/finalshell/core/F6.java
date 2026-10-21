package com.finalshell.core;

public final class F6 {
   public static int H;

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
      __vfClinit__();
   }

   public static void __vfClinit__() {
      if (k() == 0) {
         m(54);
      }
   }
}





