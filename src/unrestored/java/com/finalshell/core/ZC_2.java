package com.finalshell.core;

public class ZC_2 {
   public static boolean J;

   public static void main(String[] var0) {
      new ZC_2();
   }

   public static void X(boolean var0) {
      J = var0;
   }

   public static boolean z() {
      return J;
   }

   public static boolean u() {
      boolean var0 = z();
      return !var0;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      if (z()) {
         X(true);
      }
   }
}





