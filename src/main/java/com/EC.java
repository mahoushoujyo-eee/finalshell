package com;

public class EC {
   private final int F;
   private final int Q;
   private static boolean U;

   public EC(int var1, int var2) {
      this.F = var1;
      boolean var10000 = x();
      this.Q = var2;
      boolean var3 = var10000;
      if (!var3) {
         com.ky_4.K(new String[3]);
      }
   }

   public int O() {
      return this.F;
   }

   public int C() {
      return this.Q;
   }

   public static void S(boolean var0) {
      U = var0;
   }

   public static boolean j() {
      return U;
   }

   public static boolean x() {
      boolean var0 = j();
      return !var0;
   }

   static {
      if (j()) {
         S(true);
      }
   }
}





