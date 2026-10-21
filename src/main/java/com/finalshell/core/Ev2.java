package com.finalshell.core;

public class Ev2 {
   public static boolean A;

   public static void f(boolean var0) {
      A = var0;
   }

   public static boolean x() {
      return A;
   }

   public static boolean K() {
      boolean var0 = x();
      return !var0;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      if (!x()) {
         f(true);
      }
   }
}





