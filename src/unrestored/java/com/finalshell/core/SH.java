package com.finalshell.core;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SH implements GN {
   public static Logger L;

   @Override
   public boolean K(int var1) {
      return L.isLoggable(Y(var1));
   }

   @Override
   public void t(int var1, String var2) {
      this.c(var1, var2, null);
   }

   @Override
   public void c(int var1, String var2, Throwable var3) {
      boolean var4 = Dm4.F$boolean();
      if (var4) {
         if (var3 == null) {
            L.log(Y(var1), var2);
            return;
         }

         L.log(Y(var1), var2, var3);
      }
   }

   public static Level Y(int var0) {
      switch (var0) {
         case 0:
            return Level.FINE;
         case 1:
            return Level.INFO;
         case 2:
            return Level.WARNING;
         case 3:
         case 4:
            return Level.SEVERE;
         default:
            return Level.FINER;
      }
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      L = Logger.getLogger(Xe2.class.getName());
   }
}





