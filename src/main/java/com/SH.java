package com;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SH implements GN {
   private static final Logger L = Logger.getLogger(Xe_2.class.getName());

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
      boolean var4 = com.dm_4.F();
      if (var4) {
         if (var3 == null) {
            L.log(Y(var1), var2);
            return;
         }

         L.log(Y(var1), var2, var3);
      }
   }

   static Level Y(int var0) {
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
}





