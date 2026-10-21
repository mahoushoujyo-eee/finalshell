package org.m;

import java.io.IOException;

public class C extends IOException {
   private static boolean l;

   public C() {
   }

   public C(String var1) {
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
      if (!I()) {
         h(true);
      }
   }
}





