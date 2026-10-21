package com.finalshell.core;

public class Jy2 {
   public static int i;

   public static void b(Object var0) {
      System.out.println(var0);
   }

   public static void g(String var0) {
      System.out.println(var0);
   }

   public static void W(int var0) {
      i = var0;
   }

   public static int C() {
      return i;
   }

   public static int G() {
      int var0 = C();
      return var0 == 0 ? 30 : 0;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      if (C() != 0) {
         W(43);
      }
   }
}





