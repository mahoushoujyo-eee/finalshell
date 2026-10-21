package com.finalshell.core;

import com.finalshell.network.SW;

public class Kg4 {
   public static boolean K;

   public static synchronized void j() {
      int[] var0 = SW.P();
      boolean var10000 = K;
      if (var0 != null) {
         if (K) {
            return;
         }

         var10000 = true;
      }

      K = var10000;
      EE.m(new SW());
      EE.H(new HJ());
      EE.A$void();
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      K = false;
   }
}





