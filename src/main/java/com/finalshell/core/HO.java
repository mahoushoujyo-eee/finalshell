package com.finalshell.core;

public class HO {
   protected static boolean k;

   public static synchronized void n() {
      boolean var0 = I22.X$boolean();
      boolean var10000 = k;
      if (!var0) {
         if (k) {
            return;
         }

         var10000 = true;
      }

      k = var10000;
      I22.L();
      I22.Z(new E42());
      I22.Z(new E02());
      I22.Z(new Eu4());
      I22.Z(new Ek4());
      I22.Z(new EN3());
      I22.Z(new Eh4());
      I22.Z(new EV3());
      I22.Z(new Ec4());
      I22.M(new Hv2());
      I22.Z(new YI_2());
   }

   static {
      __vfClinit__();
   }

   public static void __vfClinit__() {
      k = false;
   }
}





