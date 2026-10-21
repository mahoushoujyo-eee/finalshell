package com;

public class Ev_2 {
   private static boolean A;

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
      if (!x()) {
         f(true);
      }
   }
}





