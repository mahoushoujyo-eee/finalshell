package com.finalshell.core;

import java.io.IOException;

public abstract class MW {
   public static boolean M;

   public abstract Object Z() throws IOException;

   public static void q(boolean var0) {
      M = var0;
   }

   public static boolean J() {
      return M;
   }

   public static boolean q() {
      boolean var0 = J();
      return !var0;
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      if (!J()) {
         q(true);
      }
   }
}





