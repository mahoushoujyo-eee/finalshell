package com;

public class Hi_2 extends RuntimeException {
   private static String Q;

   public Hi_2() {
   }

   public Hi_2(String var1) {
      super(var1);
   }

   public Hi_2(String var1, Throwable var2) {
      super(var1, var2);
   }

   public static void F(String var0) {
      Q = var0;
   }

   public static String C() {
      return Q;
   }

   static {
      if (C() != null) {
         F("HDZEp");
      }
   }
}





