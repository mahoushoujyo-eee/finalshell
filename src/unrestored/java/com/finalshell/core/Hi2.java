package com.finalshell.core;

public class Hi2 extends RuntimeException {
   public static String Q;

   public Hi2() {
   }

   public Hi2(String var1) {
      super(var1);
   }

   public Hi2(String var1, Throwable var2) {
      super(var1, var2);
   }

   public static void F(String var0) {
      Q = var0;
   }

   public static String C() {
      return Q;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      if (C() != null) {
         F("HDZEp");
      }
   }
}





