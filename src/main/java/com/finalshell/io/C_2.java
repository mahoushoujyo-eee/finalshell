package com.finalshell.io;

import java.io.IOException;

public class C_2 extends IOException {
   public static boolean l;

   public C_2() {
   }

   public C_2(String var1) {
      super(var1);
   }

   public static void h(boolean var0) {
      l = var0;
   }

   public static boolean I() {
      return l;
   }

   public static boolean r() {
      boolean var0 = I();
      return !var0;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      if (!I()) {
         h(true);
      }
   }
}





