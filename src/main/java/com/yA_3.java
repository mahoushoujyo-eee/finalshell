package com;

import org.jetbrains.annotations.NotNull;

public class yA_3 {
   private final Runnable e;
   private static boolean x;

   public yA_3(@NotNull Runnable var1) {
      this.e = var1;
   }

   public void v() {
      this.e.run();
   }

   public static void K(boolean var0) {
      x = var0;
   }

   public static boolean w() {
      return x;
   }

   public static boolean H() {
      boolean var0 = w();
      return !var0;
   }

   static {
      if (!w()) {
         K(true);
      }
   }
}





