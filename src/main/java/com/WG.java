package com;

public class WG extends RuntimeException {
   private static int s;

   public WG() {
   }

   public WG(String var1) {
      super(var1);
   }

   public WG(String var1, Throwable var2) {
      super(var1, var2);
   }

   public WG(Throwable var1) {
      super(var1);
   }

   public static void z(int var0) {
      s = var0;
   }

   public static int t() {
      return s;
   }

   public static int C() {
      int var0 = t();

      try {
         return var0 == 0 ? 30 : 0;
      } catch (RuntimeException var1) {
         throw a(var1);
      }
   }

   private static RuntimeException a(RuntimeException var0) {
      return var0;
   }

   static {
      if (t() != 0) {
         z(86);
      }
   }
}





