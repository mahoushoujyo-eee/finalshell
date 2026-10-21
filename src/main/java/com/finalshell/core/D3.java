package com.finalshell.core;

public class D3 {
   public static boolean X;

   public static void m(boolean var0) {
      X = var0;
   }

   public static boolean S() {
      return X;
   }

   public static boolean M() {
      boolean var0 = S();
      return !var0;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      if (!S()) {
         m(true);
      }
   }
}





