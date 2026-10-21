package com.finalshell.core;

import org.jetbrains.annotations.NotNull;

public class YA3 {
   public final Runnable e;
   public static boolean x;

   public YA3(@NotNull Runnable var1) {
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
      __vfClinit__();
   }

   public static void __vfClinit__() {
      if (!w()) {
         K(true);
      }
   }
}





