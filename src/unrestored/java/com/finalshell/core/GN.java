package com.finalshell.core;

import java.io.PrintWriter;
import java.io.StringWriter;

public interface GN {
   boolean K(int var1);

   void t(int var1, String var2);

   default void c(int var1, String var2, Throwable var3) {
      try {
         if (!this.K(var1)) {
            return;
         }
      } catch (Throwable var10) {
         throw new RuntimeException(a(var10));
      }

      if (var3 != null) {
         StringWriter var4 = new StringWriter();
         PrintWriter var5 = new PrintWriter(var4, true);

         try {
            var3.printStackTrace(var5);
         } catch (Throwable var9) {
            try {
               var5.close();
            } catch (Throwable var8) {
               var9.addSuppressed(var8);
            }

            throw var9;
         }

         var5.close();
         var2 = var2 + System.lineSeparator() + var4.toString();
      }

      this.t(var1, var2);
   }

   static Throwable a(Throwable var0) {
      return var0;
   }
}





